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

        Map<String, Piatto> dessert = new HashMap<String, Piatto>();
        dessert.put("Tiramisu", new Piatto(6, "Tiramisu con base di savoiardi e inzuppati nel caffè con amaretto e mascarpone"));
        dessert.put("Panna cotta alla fragola", new Piatto(5, " Vasetto di  panna cotta con aggiunta fragole fresce e succo di fragole"));
        dessert.put("Cheesecake al limone" , new Piatto(8,"Fetta di ceesecake con limoni di siracusa con base di biscotti"));
        dessert.put("Sorbetto al limone", new Piatto(4,"Coppa di sorbetto con limoni di Siracusa"));

        Piatto.printMenu(dessert);




        Piatto.printMenu(menuSecondi);
   
   
   
   
   
   
   
   
    }
}
