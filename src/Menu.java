import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Portata> listaPortate;
    private String title;
    private String description;


    public Menu(String title, String description) {
        this.title = title;
        this.description = description;
        listaPortate = new ArrayList<>();
    }
    public void aggiungiPortata(Portata portata) {
        listaPortate.add(portata);
    }

    public void rimuoviPortata(Portata portata) {
        listaPortate.remove(portata);
    }

    public void stampaPortate() {
        int conta = 0;
        System.out.println(title + "\n"+description+"\n" );
        System.out.println(ColorEnum.WHITE.getAnsiCode() + "PRIMI PIATTI:");
        for (Portata portata : listaPortate) {
            if (portata instanceof SecondoPiatto && conta == 0) {
                System.out.println(ColorEnum.WHITE.getAnsiCode() +"SECONDI PIATTI :");
                conta++;
            } else if (portata instanceof Dessert && conta == 1) {
                System.out.println(ColorEnum.WHITE.getAnsiCode() +"DESSERT :");
                conta++;
            } else if (portata instanceof Bevanda && conta == 2) {
                System.out.println(ColorEnum.WHITE.getAnsiCode() +"BEVANDE :");
                conta++;
            }

            System.out.println(ColorEnum.GREEN.getAnsiCode() + portata.getName().toUpperCase()
                               + "  " + ColorEnum.PURPLE.getAnsiCode() + portata.getPrice() + "€"
                               + "\n" + ColorEnum.CYAN.getAnsiCode() + portata.getDescription());

            if (portata.getAllergeni().isEmpty()){
                System.out.println(ColorEnum.YELLOW.getAnsiCode() + "Allergeni: " + ColorEnum.RED.getAnsiCode() + "Non ci sono allergeni"+ "\n");
            }else {System.out.print(ColorEnum.YELLOW.getAnsiCode() + "Allergeni: ");
                int lastIndex = portata.getAllergeni().size() - 1;
                if (portata.getAllergeni().size() > 1){
                    portata.getAllergeni().forEach(allergene -> {
                        if (portata.getAllergeni().lastIndexOf(allergene) == lastIndex){
                            System.out.print(ColorEnum.BLUE.getAnsiCode() + allergene + ";");
                        } else System.out.print(ColorEnum.BLUE.getAnsiCode() +allergene + "," );
                    });
                } else {
                     portata.getAllergeni().forEach(allergene -> System.out.print(ColorEnum.RED.getAnsiCode() + allergene + "; "));
                 }
                System.out.println("\n");
            }
        }

    }
}




