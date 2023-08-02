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

    /**
     * Funzione dentro il quale utilizzo il metodo stampaTitoloEInfoPortata passandogli il titolo della sezione e la classe da controllare
     *
     */
    public void stampaPortate() {
        System.out.println(title + "\n"+description+"\n" );
        stampaTitoloEInfoPortata("ANTIPASTI", Antipasti.class);
        stampaTitoloEInfoPortata("PRIMI PIATTI", PrimoPiatto.class);
        stampaTitoloEInfoPortata("SECONDI PIATTI", SecondoPiatto.class);
        stampaTitoloEInfoPortata("CONTORNI", Contorno.class);
        stampaTitoloEInfoPortata("DESSERT", Dessert.class);
        stampaTitoloEInfoPortata("BEVANDE", Bevanda.class);
    }

    /**
     * Metodo che riceve in input il titolo della sezione e la classe da controllare:
     * stampa il titolo con il colore specificato dall'enum
     * esegue for per ciclare dentro alla lista delle portate
     * se la singola portata è un'istanza della classe passata in input allora richiama il metodo printInfoPortata() della classe padre Portata
     *
     * Class<\? extends Portata> classToCheck è un utilizzo dei Java generics
     * Class è una classe già presente in Java che permette di accedere alla classe di tipo sconosciuto (ovvero il ?)
     * il ? sta a indicare che potrebbe essere una qualsiasi classe che estende Portata - nei java generics il ? è una wildcard
     * extends Portata mi serve per specificare che la classe ? è limitata a essere una sottoclasse di portata
     * classToCheck è la classe che passo come input e che va al posto del ?
     *
     * @param titolo é il titolo della sezione delle portate che vengono poi stampate sotto a esso
     * @param classToCheck è la classe da controllare per capire quando stampare il titolo giusto
     */

    public void stampaTitoloEInfoPortata(String titolo, Class<? extends Portata> classToCheck) {
        System.out.println(ColorEnum.WHITE.getAnsiCode()+ "\n" + titolo + ": ");

        for (Portata p : listaPortate) {
            if (classToCheck.isInstance(p)) {
                p.printInfoPortata();
                System.out.println("\n");
            }
        }
    }
}