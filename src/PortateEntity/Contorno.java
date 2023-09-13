package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class Contorno extends Portata {
    private Boolean olioAlPeperoncino;
    private String note;
    private Integer idPortata;
    private Integer idMenu;


    public Contorno(String name, double price, String description, Integer calories, List<AllergeniEnum> allergeni, Boolean olioAlPeperoncino, String note) {
        super(name, price, description, calories, allergeni);
        this.olioAlPeperoncino = olioAlPeperoncino;
        this.note = note;
    }

    public Contorno(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idMenu, Boolean olioAlPeperoncino, String note, Integer idPortata, Integer idMenu1) {
        super(name, price, description, calories, allergeni, idMenu);
        this.olioAlPeperoncino = olioAlPeperoncino;
        this.note = note;
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
