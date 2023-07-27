import java.util.List;

public class SecondoPiatto extends Portata{
    String origineDellaCarne;
    public SecondoPiatto(String name, Double price, String description, String origineDellaCarne, List<String> allergeni) {
        super(name, price, description, allergeni);
        this.origineDellaCarne = origineDellaCarne;
    }

    public String getOrigineDellaCarne() {
        return origineDellaCarne;
    }

    public void setOrigineDellaCarne(String origineDellaCarne) {
        this.origineDellaCarne = origineDellaCarne;
    }
}