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
            System.out.println(portata.getName().toUpperCase() + "  " + portata.getPrice() + "€" + "\n" + portata.getDescription() + "\n");
        }

    }
}




