import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO inseriri i campi per il menù, titolo descr tipo
    private List<PrimoPiatto> primiPiatti;
    private List<SecondoPiatto> secondiPiatti;
    private List<Dessert> dessert;
    private List<Bevanda> bevande;

    public Menu() {
        primiPiatti = new ArrayList<>();
        secondiPiatti = new ArrayList<>();
        dessert = new ArrayList<>();
        bevande = new ArrayList<>();
    }

    public void aggiungiPrimoPiatto(PrimoPiatto primoPiatto) {
        primiPiatti.add(primoPiatto);
    }

    public void aggiungiSecondoPiatto(SecondoPiatto secondoPiatto) {
        secondiPiatti.add(secondoPiatto);
    }

    public void aggiungiDessert(Dessert dessert) {
        this.dessert.add(dessert);
    }

    public void aggiungiBevanda(Bevanda bevanda) {
        bevande.add(bevanda);
    }

    //TODO fare un metodo che stampa tutto il menu

    public void stampaPrimiPiatti() {
        System.out.println("PRIMI PIATTI:");
        for (PrimoPiatto primoPiatto : primiPiatti) {
            System.out.println(primoPiatto);
        }
    }

    public void stampaSecondiPiatti() {
        System.out.println("SECONDI PIATTI:");
        for (SecondoPiatto secondoPiatto : secondiPiatti) {
            System.out.println(secondoPiatto);
        }
    }

    public void stampaDessert() {
        System.out.println("DESSERT :");
        for (Dessert dessert : dessert) {
            System.out.println(dessert);
        }
    }

    public void stampaBevande() {
        System.out.println("BEVANDE :");
        for (Bevanda bevanda : bevande) {
            System.out.println(bevanda);
        }
    }
}

