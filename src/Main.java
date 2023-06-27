import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Piatto> menuPrimi = new HashMap<String, Piatto>();
        menuPrimi.put("Spaghetti alla carbonara", new Piatto(10, "Pasta condita con uova, pancetta, pecorino e pepe"));
        menuPrimi.put("Lasagne al Ragù", new Piatto(15, "Strati di pasta, ragù di carne e besciamella"));
        menuPrimi.put("Penne all'Arrabbiata", new Piatto(11, "Pasta condita con salsa di pomodoro, peperoncino e aglio"));
        menuPrimi.put("Risotto ai Funghi", new Piatto(15, "Riso cotto lentamente con funghi porcini e brodo"));
        menuPrimi.put("Gnocchi al Pesto", new Piatto(8, "Gnocchi di patate conditi con pesto alla genovese"));

        Piatto.printMenu(menuPrimi);
   
        Map<String, Piatto> menuSecondi = new HashMap<String, Piatto>();
        menuSecondi.put("Scaloppine al limone", new Piatto(12, "Fettine di vitello  battute e poi cotte in padella \ncon succo di limone, burro e prezzemolo"));
        menuSecondi.put("Arrosto di maiale", new Piatto(11, "Arrosto di delizioso filetto di maialino nero"));
        menuSecondi.put("Bistecca alla fiorentina", new Piatto(24, "Bistecca di carne marchigiana con taglio da fiorentina"));
        menuSecondi.put("Abbacchio alla romana", new Piatto(16, "Carne di agnello da latte marinata con aglio, rosmarino, pepe nero\n e succo di limone cotta lentamente in padella"));
        menuSecondi.put("Pollo alla cacciatora", new Piatto(14, "Pollo allevato a terra \ncon  contorno di patate al forno"));




        Piatto.printMenu(menuSecondi);
   
   
   
   
   
   
   
   
    }
}
