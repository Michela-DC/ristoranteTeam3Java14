package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class Dessert extends Portata {
    private String nomePasticceria;
    private Double percentualeZuccheri;
    private Integer idPortata;

    public Dessert(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idPortata, Integer idMenu, String nomePasticceria, Double percentualeZuccheri) {
        super(name, price, description, calories, allergeni, idPortata, idMenu);
        this.nomePasticceria = nomePasticceria;
        this.percentualeZuccheri = percentualeZuccheri;
    }

    public Dessert(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, String nomePasticceria, Double percentualeZuccheri) {
        super(name, price, description, calories, allergeni);
        this.nomePasticceria = nomePasticceria;
        this.percentualeZuccheri = percentualeZuccheri;
    }

    public String getNomePasticceria() {
        return nomePasticceria;
    }

    public void setNomePasticceria(String nomePasticceria) {
        this.nomePasticceria = nomePasticceria;
    }

    public Double getPercentualeZuccheri() {
        return percentualeZuccheri;
    }

    public void setPercentualeZuccheri(Double percentualeZuccheri) {
        this.percentualeZuccheri = percentualeZuccheri;
    }

    @Override
    public void printInfoPortata() {
        super.printInfoPortata();
         System.out.println(ColorEnum.CYAN.getAnsiCode() + "Semi freddo");
          System.out.println(ColorEnum.CYAN.getAnsiCode()+ "percentuale zuccheri");
    }




}
