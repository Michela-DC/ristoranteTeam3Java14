package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class Antipasto extends Portata {
    private boolean isProduzionePropria;
    private Integer idPortata;
    private Integer idMenu;

    public Antipasto(String name, double price, String description, Integer calories, Boolean isProduzionePropria, List<AllergeniEnum> allergeni) {
        super(name, price, description, calories, allergeni);
        this.isProduzionePropria = isProduzionePropria;
    }

    public Antipasto(String name, double price, String description, Integer calories, Boolean isProduzionePropria, List<AllergeniEnum> allergeni, Integer idPortata, Integer idMenu) {
        super(name, price, description, calories, allergeni);
        this.isProduzionePropria = isProduzionePropria;
        this.idPortata = idPortata;
        this.idMenu = idMenu;
    }

    public boolean isProduzionePropria() {
        return isProduzionePropria;
    }

    public void setProduzionePropria(boolean produzionePropria) {
        isProduzionePropria = produzionePropria;
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
        if(isProduzionePropria){
            System.out.println(ColorEnum.CYAN.getAnsiCode() + "Prodotto di nostra produzione");
        } else System.out.println(ColorEnum.CYAN.getAnsiCode() + "Prodotto non di nostra produzione");
    }
}
