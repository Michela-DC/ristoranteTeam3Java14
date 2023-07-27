import java.util.List;

public class Antipasti extends Portata {

    private boolean isProduzionePropria;

    public Antipasti(String name, double price, String description, Boolean isProduzionePropria, List<String> allergeni) {
        super(name, price, description, allergeni);
        this.isProduzionePropria = isProduzionePropria;
    }


}
