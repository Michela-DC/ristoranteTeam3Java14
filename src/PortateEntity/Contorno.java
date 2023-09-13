package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class Contorno extends Portata {
    private Boolean olioAlPeperoncino;
    private String note;
    private Integer idPortata;

    public Contorno(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idPortata, Integer idMenu, Boolean olioAlPeperoncino, String note) {
        super(name, price, description, calories, allergeni, idPortata, idMenu);
        this.olioAlPeperoncino = olioAlPeperoncino;
        this.note = note;
    }

    public Contorno(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Boolean olioAlPeperoncino, String note) {
        super(name, price, description, calories, allergeni);
        this.olioAlPeperoncino = olioAlPeperoncino;
        this.note = note;
    }

    public Boolean getOlioAlPeperoncino() {
        return olioAlPeperoncino;
    }

    public void setOlioAlPeperoncino(Boolean olioAlPeperoncino) {
        this.olioAlPeperoncino = olioAlPeperoncino;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public void printInfoPortata() {
        super.printInfoPortata();

        System.out.println(ColorEnum.CYAN.getAnsiCode() + getNote());

        if(getOlioAlPeperoncino()){
            System.out.println(ColorEnum.CYAN.getAnsiCode() + "Su richiesta condimento con olio al peperoncino.");
        }
    }

}
