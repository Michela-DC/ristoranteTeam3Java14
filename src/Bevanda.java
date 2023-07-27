import java.util.List;

public class Bevanda extends Portata{
    private Double tassoAlcolemico;


    //TODO che la facciamo a fare è uguale a portata? le classi figlio devono estendere comportamenti e avere altri field: grado alcolico

    public Bevanda(String name, Double price, String description, Double tassoAlcolemico, List<String> allergeni) {
        super(name, price, description, allergeni);
        this.tassoAlcolemico = tassoAlcolemico;
    }


    public Double getTassoAlcolemico() {
        return tassoAlcolemico;
    }

    public void setTassoAlcolemico(Double tassoAlcolemico) {
        this.tassoAlcolemico = tassoAlcolemico;
    }
}