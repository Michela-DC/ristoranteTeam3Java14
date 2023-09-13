package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;


public class Bevanda extends Portata {
    private Double tassoAlcolico;

    private Integer idPortata;
    private Integer idMenu;


    public Bevanda(String name, double price, String description,Double tassoAlcolico, Integer calories, List<AllergeniEnum> allergeni) {
        super(name, price, description, calories, allergeni);
        this.tassoAlcolico = tassoAlcolico;
    }

    public Bevanda(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idMenu, Double tassoAlcolico, Integer idPortata, Integer idMenu1) {
        super(name, price, description, calories, allergeni, idMenu);
        this.tassoAlcolico = tassoAlcolico;
        this.idPortata = idPortata;
        this.idMenu = idMenu1;
    }

    public Integer getIdPortata() {
        return idPortata;
    }

    public void setIdPortata(Integer idPortata) {
        this.idPortata = idPortata;
    }

    @Override
    public Integer getIdMenu() {
        return idMenu;
    }

    @Override
    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
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




