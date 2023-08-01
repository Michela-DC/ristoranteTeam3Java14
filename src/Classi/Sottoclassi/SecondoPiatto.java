package Classi.Sottoclassi;

import Classi.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class SecondoPiatto extends Portata {
    private String origineDellaCarne;

    public SecondoPiatto(String name, double price, String description, String origineDellaCarne, Integer calories, List<AllergeniEnum> allergeni) {
        super(name, price, description, calories, allergeni);
        this.origineDellaCarne = origineDellaCarne;
    }

    public String getOrigineDellaCarne() {
        return origineDellaCarne;
    }

    public void setOrigineDellaCarne(String origineDellaCarne) {
        this.origineDellaCarne = origineDellaCarne;
    }

    @Override
    public void printInfoPortata() {
        super.printInfoPortata();
        System.out.println(ColorEnum.CYAN.getAnsiCode() + origineDellaCarne);
    }
}