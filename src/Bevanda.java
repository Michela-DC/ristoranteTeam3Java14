import java.util.List;

public class Bevanda extends Portata{
    private Double tassoAlcolemico;

    public Bevanda(String name, Double price, String description, Double tassoAlcolemico, List<String> allergeni) {
        super(name, price, description, allergeni);
        this.tassoAlcolemico = tassoAlcolemico;
    }

    @Override
    public String getClassName() {
        return "Bevande";
    }

    public Double getTassoAlcolemico() {
        return tassoAlcolemico;
    }

    public void setTassoAlcolemico(Double tassoAlcolemico) {
        this.tassoAlcolemico = tassoAlcolemico;
    }
}