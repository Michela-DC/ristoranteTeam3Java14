import java.util.List;

<<<<<<< HEAD
public class Bevanda extends Portata {

    //TODO che la facciamo a fare è uguale a portata? le classi figlio devono estendere comportamenti e avere altri field: grado alcolico

    public Bevanda(String name, Double price, String description, List<AllergeniEnum> allergeni) {
=======
public class Bevanda extends Portata{
    private Double tassoAlcolemico;


    //TODO che la facciamo a fare è uguale a portata? le classi figlio devono estendere comportamenti e avere altri field: grado alcolico

    public Bevanda(String name, Double price, String description, Double tassoAlcolemico, List<String> allergeni) {
>>>>>>> 38ce93793fc635c6e908f96c6d19a7bb11f7886c
        super(name, price, description, allergeni);
        this.tassoAlcolemico = tassoAlcolemico;
    }

<<<<<<< HEAD
=======

    public Double getTassoAlcolemico() {
        return tassoAlcolemico;
    }

    public void setTassoAlcolemico(Double tassoAlcolemico) {
        this.tassoAlcolemico = tassoAlcolemico;
    }
>>>>>>> 38ce93793fc635c6e908f96c6d19a7bb11f7886c
}