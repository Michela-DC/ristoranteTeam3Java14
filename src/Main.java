import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("RISTORANTE GLI ORSI BRUNI");
        System.out.println("Contemporary and classic italian cuicine");

        Bevanda acquaNaturale = new Bevanda("Acqua naturale", 3, "1l");
        Bevanda acquaFrizzante = new Bevanda("Acqua frizzante", 3, "1l");
        Bevanda cocaCola = new Bevanda("Coca Cola", 3.5, "lattina 33cl");
        Bevanda sprite = new Bevanda("Sprite", 3.5, "lattina 33cl");
        Bevanda fanta = new Bevanda("Fanta", 3.5, "lattina 33cl");
        Bevanda theLimone = new Bevanda("Thé al limone", 3.5, "lattina 33cl");
        Bevanda birraPiccola = new Bevanda("Birra piccola", 4, "25cl, Alc %5,00");
        Bevanda birraMedia = new Bevanda("Birra media", 6, "40cl, Alc %5,00");
        Bevanda caliceVino = new Bevanda("Calice di vino", 5.50, "Alc %12,00");

        List<Bevanda> listaBevande = new ArrayList<>();
        listaBevande.add(acquaNaturale);
        listaBevande.add(acquaFrizzante);
        listaBevande.add(cocaCola);
        listaBevande.add(sprite);
        listaBevande.add(fanta);
        listaBevande.add(theLimone);
        listaBevande.add(birraPiccola);
        listaBevande.add(birraMedia);
        listaBevande.add(caliceVino);

        for(Bevanda drink : listaBevande) {
            System.out.println("- " + drink.getNome().toUpperCase() + " " + drink.getPrezzo() + "€");
            System.out.println("  " + drink.getDescrizione());
        }
    }
}

