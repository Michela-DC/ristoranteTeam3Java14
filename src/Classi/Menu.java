package Classi;

import Classi.Sottoclassi.*;
import Enumerati.ColorEnum;

import java.util.ArrayList;
import java.util.List;
public class Menu {

    //inserito la porta nel menu
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

    public void stampaPortate()

    {
        System.out.println(title + "\n"+description+"\n" );

        //???
        System.out.println(ColorEnum.WHITE.getAnsiCode()+"\nANTIPASTI: ");


        for (Portata p : listaPortate) {
            if (p instanceof Antipasti) {
                p.printInfoPortata();
                System.out.println("\n");
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