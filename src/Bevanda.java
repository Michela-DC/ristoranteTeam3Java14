import Enumerati.ColorEnum;

import java.util.List;


public class Bevanda extends Portata {
    private Double tassoAlcolico;

    public Bevanda(String name, double price, String description,Double tassoAlcolico, List<AllergeniEnum> allergeni) {
        super(name, price, description, allergeni);
        this.tassoAlcolico = tassoAlcolico;
    }


    public Double getTassoAlcolico() {
        return tassoAlcolico;
        }
        public void setTassoAlcolico(Double tassoAlcolico) {
         this.tassoAlcolico = tassoAlcolico;
         }


    @Override
    public void printInfoPortata() {
        super.printInfoPortata();
        if (tassoAlcolico == null){
            System.out.println(ColorEnum.CYAN.getAnsiCode() + "Tasso alcolico: ");
        }else {
            System.out.println(ColorEnum.CYAN.getAnsiCode() + "Tasso alcolico: " + tassoAlcolico);
        }
    }
}




