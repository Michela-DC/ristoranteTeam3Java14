import Enumerati.ColorEnum;

import java.util.List;

public class Antipasti extends Portata {
    private boolean isProduzionePropria;

    public Antipasti(String name, double price, String description, Boolean isProduzionePropria, List<AllergeniEnum> allergeni) {
        super(name, price, description, allergeni);
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
            System.out.println("\n" + ColorEnum.CYAN.getAnsiCode() + "Prodotto di nostra produzione");
        } else System.out.println("\n" + ColorEnum.CYAN.getAnsiCode() + "Prodotto non di nostra produzione");



    }
}
