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

<<<<<<< HEAD
    public void stampaPortate()
    {
        System.out.println(ColorEnum.WHITE.getAnsiCode()+"\nANTIPASTI: ");
        for (Portata p : listaPortate) {
            if (p instanceof Antipasti) {
                p.printInfoPortata();
                System.out.println("\n");
=======
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
>>>>>>> 38ce93793fc635c6e908f96c6d19a7bb11f7886c
            }
        }

        System.out.println(ColorEnum.WHITE.getAnsiCode()+"\nPRIMI PIATTI: ");
        for (Portata p : listaPortate) {
            if (p instanceof PrimoPiatto) {
                p.printInfoPortata();
                System.out.println("\n");
            }
        }


        System.out.println(ColorEnum.WHITE.getAnsiCode()+"\nSECONDI PIATTI: ");
        for (Portata p : listaPortate) {
            if (p instanceof SecondoPiatto) {
                p.printInfoPortata();
                System.out.println("\n");
            }
        }


        System.out.println(ColorEnum.WHITE.getAnsiCode()+"\nCONTORNI: ");
        for (Portata p : listaPortate) {
            if (p instanceof Contorno) {
                p.printInfoPortata();
                System.out.println("\n");
            }
        }


        System.out.println(ColorEnum.WHITE.getAnsiCode()+ "\nDESSERT: ");
        for (Portata p : listaPortate) {
            if (p instanceof Dessert) {
                p.printInfoPortata();
                System.out.println("\n");
            }
        }

        System.out.println(ColorEnum.WHITE.getAnsiCode()+ "\nBEVANDE: ");
        for (Portata p : listaPortate) {
            if (p instanceof Bevanda) {
                p.printInfoPortata();
                System.out.println("\n");
            }
        }

    }
}