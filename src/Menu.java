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
        System.out.println("PRIMI PIATTI:");
        for (Portata portata : listaPortate) {
            if (portata instanceof SecondoPiatto && conta == 0) {
                System.out.println("SECONDI PIATTI :");
                conta++;
            } else if (portata instanceof Dessert && conta == 1) {
                System.out.println("DESSERT :");
                conta++;
            } else if (portata instanceof Bevanda && conta == 2) {
                System.out.println("BEVANDE :");
                conta++;
            }
            System.out.println(portata.getName().toUpperCase() + "  " + portata.getPrice() + "€" + "\n" + portata.getDescription());
            if (portata.getAllergeni().isEmpty()){
                System.out.println("Allergeni: " + "Non ci sono allergeni"+ "\n");
            }else {System.out.print("Allergeni: ");
                int lastIndex = portata.getAllergeni().size() - 1;
                if (portata.getAllergeni().size() > 1){
                    portata.getAllergeni().forEach(allergene -> {
                        if (portata.getAllergeni().lastIndexOf(allergene) == lastIndex){
                            // quando c e un solo allergene add un ;
                            System.out.print(allergene + ";");
                            //invece quando ci sono piu allergeni stampa una virgola tra gli allergeni
                        } else System.out.print(allergene + "," );
                    });
                } else {
                    //stampa il ; dopo gli allergeni
                     portata.getAllergeni().forEach(allergene -> System.out.print(allergene + "; "));
                 }
                System.out.println("\n");
            }
        }

    }
}




