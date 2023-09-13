package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class SecondoPiatto extends Portata {
    private String origineDellaCarne;

    private Integer idPortata;
    private Integer idMenu;

    public SecondoPiatto(String name, double price, String description, String origineDellaCarne, Integer calories, List<AllergeniEnum> allergeni) {
        super(name, price, description, calories, allergeni);
        this.origineDellaCarne = origineDellaCarne;
    }

    public SecondoPiatto(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idMenu, String origineDellaCarne, Integer idPortata, Integer idMenu1) {
        super(name, price, description, calories, allergeni, idMenu);
        this.origineDellaCarne = origineDellaCarne;
        this.idPortata = idPortata;
        this.idMenu = idMenu1;
    }

    public SecondoPiatto(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, String origineDellaCarne, Integer idPortata, Integer idMenu) {
        super(name, price, description, calories, allergeni);
        this.origineDellaCarne = origineDellaCarne;
        this.idPortata = idPortata;
        this.idMenu = idMenu;
    }

    public String getOrigineDellaCarne() {
        return origineDellaCarne;
    }

    public void setOrigineDellaCarne(String origineDellaCarne) {
        this.origineDellaCarne = origineDellaCarne;
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

    @Override
    public void printInfoPortata() {
        super.printInfoPortata();

        System.out.println(ColorEnum.CYAN.getAnsiCode() + origineDellaCarne);
    }



}