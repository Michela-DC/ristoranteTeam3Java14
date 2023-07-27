import java.util.List;

public class Antipasti extends Portata {

    public Antipasti(String name, double price, String description, List<String> allergeni) {
        super(name, price, description, allergeni);
    }

    @Override
    public String getClassName() {
        return "Antipasti";
    }
}
