import Enumerati.ColorEnum;

import java.util.List;

public class SecondoPiatto extends Portata{
    private String origineDellaCarne;

    public SecondoPiatto(String name, Double price, String description, String origineDellaCarne, List<AllergeniEnum> allergeni) {
        super(name, price, description, allergeni);
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