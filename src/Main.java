
import java.sql.Array;
import java.util.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Secondi scaloppineAlLimone = new Secondi("Scaloppine al limone", 12, "Fettine di vitello  battute e poi cotte in padella con succo di limone, burro e prezzemolo");
        Secondi arrostoDiMaiale = new Secondi("Arrosto di maiale", 14, "Arrosto di delizioso filetto di maialino nero");
        Secondi bisteccaAllaFiorentina = new Secondi("Bistecca alla fiorentina", 24, "Bistecca di carne marchigiana con taglio da fiorentina");
        Secondi abbacchioAllaRomana = new Secondi("Abbacchio alla romana", 16, "Carne di agnello da latte marinata con aglio, rosmarino, pepe nero e succo di limone cotta lentamente in padella");
        Secondi polloAllaCacciatora = new Secondi("Pollo alla cacciatora", 14, "Pollo allevato a terra con  contorno di patate al forno");

        Bevanda acquaNaturale = new Bevanda("Acqua naturale", 3, "1l");
        Bevanda acquaFrizzante = new Bevanda("Acqua frizzante", 3, "1l");
        Bevanda cocaCola = new Bevanda("Coca Cola", 3.5, "lattina 33cl");
        Bevanda sprite = new Bevanda("Sprite", 3.5, "lattina 33cl");
        Bevanda fanta = new Bevanda("Fanta", 3.5, "lattina 33cl");
        Bevanda theLimone = new Bevanda("Thé al limone", 3.5, "lattina 33cl");
        Bevanda birraPiccola = new Bevanda("Birra piccola", 4, "25cl, Alc %5,00");
        Bevanda birraMedia = new Bevanda("Birra media", 6, "40cl, Alc %5,00");
        Bevanda caliceVino = new Bevanda("Calice di vino", 5.50, "Alc %12,00");

        Primi spaghettiAllaCarbonara = new Primi("Spaghetti alla carbonara" , 10.50,"Spaghetti conditi con uova, pancetta, pecorino romano e pepe nero");
        Primi risottoAiFunghi = new Primi("Risotto ai funghi" , 12.50,"Risotto cremoso preparato con funghi porcini freschi e parmigiano reggiano");
        Primi lasagneAlRagu = new Primi("Lasagne al ragù" , 12.00,"Strati di pasta all'uovo, ragù di carne, besciamella e formaggio gratinato");
        Primi penneAllArrabbiata = new Primi("Penne all'arrabbiata" , 9.00,"Penne condite con salsa piccante al pomodoro, aglio, peperoncino e prezzemolo");
        Primi gnocchiAlPesto = new Primi("Gnocchi al pesto" , 8.50,"Gnocchi di patate freschi serviti con salsa al basilico, pinoli, parmigiano e olio d'oliva");

        List<Primi> sezionePrimi = new LinkedList<>();
        sezionePrimi.add(spaghettiAllaCarbonara);
        sezionePrimi.add(risottoAiFunghi);
        sezionePrimi.add(lasagneAlRagu);
        sezionePrimi.add(penneAllArrabbiata);
        sezionePrimi.add(gnocchiAlPesto);

        List<Secondi> secondiList = new ArrayList<Secondi>();
        secondiList.add(scaloppineAlLimone);
        secondiList.add(arrostoDiMaiale);
        secondiList.add(bisteccaAllaFiorentina);
        secondiList.add(abbacchioAllaRomana);
        secondiList.add(polloAllaCacciatora);

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

        System.out.println("RISTORANTE GLI ORSI BRUNI");
        System.out.println("Contemporary and classic italian cuicine");
        System.out.println(" ");

        for (Primi primi : sezionePrimi) {
            System.out.println("- " + primi.getName().toUpperCase() + " " + primi.getPrice() + "€");
            System.out.println(primi.getDescription());
        }

//        for ( int i=0 ; i<sezionePrimi.size(); i++){
//            System.out.println(sezionePrimi.get(i));
//        }

        System.out.println("\n \n \n");

        for (Secondi secondi : secondiList) {
            System.out.println("- " + secondi.getDishName().toUpperCase() + " " + secondi.getDishPrice() + "€");
            System.out.println(secondi.getDishDescription() + ";");
        }

        System.out.println("\n\n\n");

        for (Bevanda drink : listaBevande) {
            System.out.println("- " + drink.getNome().toUpperCase() + " " + drink.getPrezzo() + "€");
            System.out.println("  " + drink.getDescrizione());
        }
    }
}

