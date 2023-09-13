package PortateEntity;

import Core.Portata;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;

public class PrimoPiatto extends Portata {

private Boolean isStagionale;
    private Integer idPortata;
    private Integer idMenu;


    public PrimoPiatto(String name, Double price, String description, Boolean isStagionale, Integer calories, List<AllergeniEnum> allergeni) {
        super(name, price, description, calories, allergeni);
        this.isStagionale = isStagionale;
    }



    public Boolean getStagionale() {
        return isStagionale;
    }

    public void setStagionale(Boolean stagionale) {
        isStagionale = stagionale;
    }

    @Override
    public void printInfoPortata() {
        super.printInfoPortata();

        if(isStagionale){
            System.out.println(ColorEnum.CYAN.getAnsiCode() + "Prodotto con ingredienti di stagione;");
        } else System.out.println(ColorEnum.CYAN.getAnsiCode() + "Prodotto con ingredienti fuori stagione;");
    }
}





