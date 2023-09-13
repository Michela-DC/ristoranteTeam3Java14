package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;


public class Bevanda extends Portata {
    private Double tassoAlcolico;

    public Bevanda(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idPortata, Integer idMenu, Double tassoAlcolico) {
        super(name, price, description, calories, allergeni, idPortata, idMenu);
        this.tassoAlcolico = tassoAlcolico;

    }

    public Bevanda(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Double tassoAlcolico) {
        super(name, price, description, calories, allergeni);
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




