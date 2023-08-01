package Classi.Sottoclassi;

import Classi.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class Dessert extends Portata {


  private String semiFreddo;


    public double getPercentualeZuccheri() {
        return percentualeZuccheri;
    }

    public void setPercentualeZuccheri(double percentualeZuccheri) {
        this.percentualeZuccheri = percentualeZuccheri;
    }

    private double percentualeZuccheri;

private List<Dessert> desserts;


    public Dessert(String name, double price, String description, Integer calories, List<AllergeniEnum> allergeni) {
        super(name, price, description, calories, allergeni);
        this.semiFreddo=semiFreddo;
this.percentualeZuccheri=percentualeZuccheri;
    }


    public String getSemiFreddo() {
        return semiFreddo;
    }

    public void setSemiFreddo(String semiFreddo) {
        this.semiFreddo = semiFreddo;
    }


    @Override
    public void printInfoPortata() {
        super.printInfoPortata();


        System.out.println(ColorEnum.CYAN.getAnsiCode() + "Semi freddo");
System.out.println(ColorEnum.CYAN.getAnsiCode()+ "percentuale zuccheri");
    }




}
