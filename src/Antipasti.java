import java.util.List;

public class Antipasti extends Portata {
    private boolean isMare;

    public Antipasti(String name, double price, String description, List<String> allergeni) {
        super(name, price, description, allergeni);
    }

//    @Override
//    public void printInfoPortata() {
//        super.printInfoPortata();
//        System.out.println("Inserire i field aggiuntivi");
//    }
}
