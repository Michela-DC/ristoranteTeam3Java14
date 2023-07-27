import java.util.List;

public class Bevanda extends Portata {

    //TODO che la facciamo a fare è uguale a portata? le classi figlio devono estendere comportamenti e avere altri field: grado alcolico

    public Bevanda(String name, Double price, String description, List<AllergeniEnum> allergeni) {
        super(name, price, description, allergeni);
    }

}