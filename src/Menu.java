import java.util.ArrayList;
import java.util.List;
public class Menu {

    public static final String ALLERGENI = "Allergeni";
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

        for (Portata portata : listaPortate) {
            // stampa del titolo di ogni sezione sfruttando un contatore count
         if (portata instanceof Antipasti && conta == 0) {
             System.out.println(ColorEnum.WHITE.getAnsiCode() + ((Antipasti) portata).getClass().getName()+ ":");
                conta++;
            } else if (portata instanceof PrimoPiatto && conta == 1) {
                //TODO sistemare
//                portata.printInfoPortata();
                System.out.println(ColorEnum.WHITE.getAnsiCode() + portata.getClassName().toUpperCase()+ ":");
                conta++;
            } else if (portata instanceof SecondoPiatto && conta == 2) {
                System.out.println(ColorEnum.WHITE.getAnsiCode() +portata.getClassName().toUpperCase()+ ":");
                conta++;
            } else if (portata instanceof Dessert && conta == 3) {
                System.out.println(ColorEnum.WHITE.getAnsiCode() +portata.getClassName().toUpperCase() + ":");
                conta++;
            } else if (portata instanceof Bevanda && conta == 4) {
                System.out.println(ColorEnum.WHITE.getAnsiCode() +portata.getClassName().toUpperCase() + ":");
                conta++;
            }

            System.out.println(ColorEnum.GREEN.getAnsiCode() + portata.getName().toUpperCase()
                    + "  " + ColorEnum.PURPLE.getAnsiCode() + portata.getPrice() + "€"
                    + "\n" + ColorEnum.CYAN.getAnsiCode() + portata.getDescription() + ";");

            List<String> listaAllergeni = portata.getAllergeni(); // Salvo la lista degli allergeni dentro una variabile

            // If - else che usiamo per gestire la stampa degli allergeni
            if (listaAllergeni.isEmpty()){ // Caso in cui non ci sono allergeni
                System.out.println(ColorEnum.YELLOW.getAnsiCode() + ALLERGENI + ": " + ColorEnum.RED.getAnsiCode() + "Non ci sono allergeni;"+ "\n");
            }else { // caso in cui sono presenti degli allergeni
                System.out.print(ColorEnum.YELLOW.getAnsiCode() + ALLERGENI + ": ");
                int lastIndex = listaAllergeni.size() - 1; //utilizziamo la variabile lastIndex per salvare l'ultima posizione all'interno della lista degli allergeni

                if (listaAllergeni.size() > 1){ //se la grandezza della lista degli allergeni è > 1 allora ci cicliamo dentro
                    listaAllergeni.forEach(allergene -> {
                        if (listaAllergeni.lastIndexOf(allergene) == lastIndex){ // se l'attuale allergene è nell'ultima posizione della lista
                            System.out.print(ColorEnum.RED.getAnsiCode() +allergene.getDescrizione() + ";"); // allora stampiamo allergene con il ;
                        } else System.out.print(ColorEnum.RED.getAnsiCode() +allergene.getDescrizione() + ", " ); // altrimenti stampiamo l'allergene con la virgola
                    });
                } else { //se la lista ha un solo allergene allora stampiamo direttamente allergene e il ;
                    listaAllergeni.forEach(allergene -> System.out.print(ColorEnum.RED.getAnsiCode() +allergene.getDescrizione() + ";"));
                }
                System.out.println("\n");
            }
        }

    }

    public void printMenu(){

        System.out.print("TIPO MENU: ");
        /*
            switch (tipoMenu){
                case CARNE -> System.out.println("Menu di carne\n");
                case PESCE -> System.out.println("Menu di pesce\n");
                case VEGANO -> System.out.println("Menu vegano\n");
                case VEGETARIANO -> System.out.println("Menu vegetariano\n");
            }
         */
        System.out.println(tipoMenu.getName());

        System.out.println("PRIMI PIATTI: \n");
        for (Portata p : listaPortate) {
            if (p instanceof PrimoPiatto) {
                p.printPortata(this.colorEnum);
            }
        }
        System.out.println("\nSECONDI PIATTI: \n");
        for (Portata p: listaPortate) {
            if (p.getClass() == SecondoPiatto.class){
                p.printPortata(this.colorEnum);
            }
        }
        System.out.println("\nDESSERT: \n");
        for (Portata p: listaPortate) {
            if (p.getClass() == Dessert.class){
                p.printPortata(this.colorEnum);
            }
        }
        System.out.println("\nBEVANDE: \n");
        for (Portata p: listaPortate) {
            if (p.getClass() == Bevanda.class){
                p.printPortata(this.colorEnum);
            }
        }
    }
}