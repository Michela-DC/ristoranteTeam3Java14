package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class SecondoPiatto extends Portata {
    private String origineDellaCarne;
    private Integer idPortata;

    public SecondoPiatto(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idPortata, Integer idMenu, String origineDellaCarne) {
        super(name, price, description, calories, allergeni, idPortata, idMenu);
        this.origineDellaCarne = origineDellaCarne;
    }

    public SecondoPiatto(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, String origineDellaCarne) {
        super(name, price, description, calories, allergeni);
        this.origineDellaCarne = origineDellaCarne;
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
    public void printInfoPortata() {
        super.printInfoPortata();

        System.out.println(ColorEnum.CYAN.getAnsiCode() + origineDellaCarne);
    }



}