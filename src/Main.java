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
    }
}
