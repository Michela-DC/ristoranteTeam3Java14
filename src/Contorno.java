import java.util.List;

public class Contorno extends Portata{
    public Contorno(String name, double price, String description, List<String> allergeni) {
        super(name, price, description, allergeni);
    }

    @Override
    public String getClassName() {
        return "Contorni";
    }
}
