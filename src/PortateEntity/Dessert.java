package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class Dessert extends Portata {
    private String nomePasticceria;
    private Integer idPortata;
    private Integer idMenu;
    private Double percentualeZuccheri;


    public Dessert(String name, double price, String description, Integer calories, List<AllergeniEnum> allergeni, String nomePasticceria, Double percentualeZuccheri) {
        super(name, price, description, calories, allergeni);
        this.nomePasticceria = nomePasticceria;
        this.percentualeZuccheri=percentualeZuccheri;
    }

    public Dessert(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idMenu, String nomePasticceria, Integer idPortata, Integer idMenu1, Double percentualeZuccheri) {
        super(name, price, description, calories, allergeni, idMenu);
        this.nomePasticceria = nomePasticceria;
        this.idPortata = idPortata;
        this.idMenu = idMenu1;
        this.percentualeZuccheri = percentualeZuccheri;
    }

    public double getPercentualeZuccheri() {
        return percentualeZuccheri;
    }

    public void setPercentualeZuccheri(double percentualeZuccheri) {
        this.percentualeZuccheri = percentualeZuccheri;
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

    public String getNomePasticceria() {
        return nomePasticceria;
    }

    public void setNomePasticceria(String nomePasticceria) {
        this.nomePasticceria = nomePasticceria;
    }


    @Override
    public void printInfoPortata() {
        super.printInfoPortata();
         System.out.println(ColorEnum.CYAN.getAnsiCode() + "Semi freddo");
          System.out.println(ColorEnum.CYAN.getAnsiCode()+ "percentuale zuccheri");
    }




}
