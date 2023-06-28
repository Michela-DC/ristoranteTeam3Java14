import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, MenuItem> menuPrimi = new HashMap<String, MenuItem>();
        menuPrimi.put("Spaghetti alla carbonara", new MenuItem(10, "Pasta condita con uova, pancetta, pecorino e pepe"));
        menuPrimi.put("Lasagne al Ragù", new MenuItem(15, "Strati di pasta, ragù di carne e besciamella"));
        menuPrimi.put("Penne all'Arrabbiata", new MenuItem(11, "Pasta condita con salsa di pomodoro, peperoncino e aglio"));
        menuPrimi.put("Risotto ai Funghi", new MenuItem(15, "Riso cotto lentamente con funghi porcini e brodo"));
        menuPrimi.put("Gnocchi al Pesto", new MenuItem(8, "Gnocchi di patate conditi con pesto alla genovese"));

        Map<String, MenuItem> menuSecondi = new HashMap<String, MenuItem>();
        menuSecondi.put("Scaloppine al limone", new MenuItem(12, "Fettine di vitello  battute e poi cotte in padella \ncon succo di limone, burro e prezzemolo"));
        menuSecondi.put("Arrosto di maiale", new MenuItem(11, "Arrosto di delizioso filetto di maialino nero"));
        menuSecondi.put("Bistecca alla fiorentina", new MenuItem(24, "Bistecca di carne marchigiana con taglio da fiorentina"));
        menuSecondi.put("Abbacchio alla romana", new MenuItem(16, "Carne di agnello da latte marinata con aglio, rosmarino, pepe nero\n e succo di limone cotta lentamente in padella"));
        menuSecondi.put("Pollo alla cacciatora", new MenuItem(14, "Pollo allevato a terra \ncon  contorno di patate al forno"));

        Map<String, MenuItem> dessert = new HashMap<String, MenuItem>();
        dessert.put("Tiramisu", new MenuItem(6, "Tiramisu con base di savoiardi e inzuppati nel caffè con amaretto e mascarpone"));
        dessert.put("Panna cotta alla fragola", new MenuItem(5, "Vasetto di  panna cotta con aggiunta fragole fresce e succo di fragole"));
        dessert.put("Cheesecake al limone" , new MenuItem(8,"Fetta di ceesecake con limoni di siracusa con base di biscotti"));
        dessert.put("Sorbetto al limone", new MenuItem(4,"Coppa di sorbetto con limoni di Siracusa"));

        Map<String, MenuItem> bevande = new HashMap<>();
        bevande.put("Acqua Naturale", new MenuItem(3, "1l"));
        bevande.put("Acqua Frizzante", new MenuItem(3, "1l"));
        bevande.put("Coca cola/Sprite/Fanta", new MenuItem(3.5, "lattina 33cl"));
        bevande.put("Thé limone/pesca", new MenuItem(3.5, "lattina 33cl"));
        bevande.put("Birra piccola", new MenuItem(4, "25cl, Alc %5,00"));
        bevande.put("Birra media", new MenuItem(6, "40cl, Alc %5,00"));
        bevande.put("Calice di vino", new MenuItem(5.5, "Alc %12,00"));

        System.out.println("Primi piatti:");
        MenuItem.printMenu(menuPrimi);
        System.out.println("\nSecondi:");
        MenuItem.printMenu(menuSecondi);
        System.out.println("\nDessert:");
        MenuItem.printMenu(dessert);
        System.out.println("\nBevande:");
        MenuItem.printMenu(bevande);
    }
}

