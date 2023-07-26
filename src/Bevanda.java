import java.util.List;

public class Bevanda extends Portata{

    public Bevanda(String name, Double price, String description, List<String> allergeni) {
        super(name, price, description, allergeni);
    }

    @Override
    public String getClassName() {
        return "Bevande";
    }
}