import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Secondi scaloppineAlLimone = new Secondi("Scaloppine al limone", 12, "Fettine di vitello  battute e poi cotte in padella con succo di limone, burro e prezzemolo");
       Secondi arrostoDiMaiale = new Secondi("Arrosto di maiale", 14, "Arrosto di delizioso filetto di maialino nero");
       Secondi bisteccaAllaFiorentina = new Secondi("Bistecca alla fiorentina", 24, "Bistecca di carne marchigiana con taglio da fiorentina");
       Secondi abbacchioAllaRomana = new Secondi("Abbacchio alla romana", 16, "Carne di agnello da latte marinata con aglio, rosmarino, pepe nero e succo di limone cotta lentamente in padella");
       Secondi polloAllaCacciatora = new Secondi("Pollo alla cacciatora", 14, "Pollo allevato a terra con  contorno di patate al forno");


       List<Secondi> secondiList = new ArrayList<Secondi>();
       secondiList.add(scaloppineAlLimone);
       secondiList.add(arrostoDiMaiale);
       secondiList.add(bisteccaAllaFiorentina);
       secondiList.add(abbacchioAllaRomana);
       secondiList.add(polloAllaCacciatora);

        for (Secondi secondi : secondiList) {
            System.out.println("- " + secondi.getDishName().toUpperCase() + " " + secondi.getDishPrice() + "€" );
            System.out.println(secondi.getDishDescription()+ ";");


        }

   }


    }

