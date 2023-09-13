package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class Antipasto extends Portata {
    private boolean isProduzionePropria;

    public Antipasto(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idPortata, Integer idMenu, Boolean isProduzionePropria) {
        super(name, price, description, calories, allergeni, idPortata, idMenu);
        this.isProduzionePropria = isProduzionePropria;
    }

    public Antipasto(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Boolean isProduzionePropria) {
        super(name, price, description, calories, allergeni);
        this.isProduzionePropria = isProduzionePropria;
    }

    public boolean isProduzionePropria() {
        return isProduzionePropria;
    }

    public void setProduzionePropria(boolean produzionePropria) {
        isProduzionePropria = produzionePropria;
    }

    @Override
    public void printInfoPortata() {
        super.printInfoPortata();
        if(isProduzionePropria){
            System.out.println(ColorEnum.CYAN.getAnsiCode() + "Prodotto di nostra produzione");
        } else System.out.println(ColorEnum.CYAN.getAnsiCode() + "Prodotto non di nostra produzione");
    }
}
