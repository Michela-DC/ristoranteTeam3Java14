package Core;

import PortateEntity.Bevanda;
import Enumerati.AllergeniEnum;
import Enumerati.ColorEnum;

import java.util.List;
//classe padre
    public class Portata {
    public static final String ALLERGENI = "Allergeni:";
    private String name;
    private Double price;
    private String description;

    private Integer calories;

    private Integer idMenu;

    /*
    *
    * Nella portata la lista di allergeni deve essere
    * di enum e fare listaAllergeni.getDescrizione()
    * per fare la stampa degli allergeni
    * */
    private List<AllergeniEnum> allergeni;

    public Portata(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni, Integer idMenu) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calories = calories;
        this.allergeni = allergeni;
        this.idMenu = idMenu;
    }

    public Portata(String name, Double price, String description, Integer calories, List<AllergeniEnum> allergeni) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.calories = calories;
        this.allergeni = allergeni;
    }

    public List<AllergeniEnum> getAllergeni() {
        return allergeni;
    }

    public void setAllergeni(List<AllergeniEnum> allergeni) {
        this.allergeni = allergeni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(Integer idMenu) {
        this.idMenu = idMenu;
    }

    /*
    * Il metodo di stampa deve essere dentro alla classe Classi.Portata
    *  NON dentro a Classi.Menu,
    *  e poi le classi figlie devono fare override di quel metodo
    * */

    public void printInfoPortata(){
        //verde+ viola:prezzo + azzurro smeraldo _:descrizione
        //blu :calorie
        System.out.print(ColorEnum.GREEN.getAnsiCode()+getName() + " " + ColorEnum.PURPLE.getAnsiCode()+getPrice()+"€" + "\n" + ColorEnum.CYAN.getAnsiCode()+getDescription() + " || " +
            ColorEnum.BLUE.getAnsiCode());

          if (getClass().equals(Bevanda.class)){
              System.out.println(" ");
          } else System.out.println("Calorie: " + getCalories());

              /*
              * giallo :allergeni + rosso :lista allergeni
              * */

          if (!allergeni.isEmpty()){
              System.out.println(ColorEnum.YELLOW.getAnsiCode() + ALLERGENI + " " + ColorEnum.RED.getAnsiCode()+ allergeni);
          } else System.out.println(ColorEnum.YELLOW.getAnsiCode() + ALLERGENI + " non ci sono allergeni");
    }
}
