import java.util.List;

public class Portata {

    private String name;
    private Double price;
    private String description;

    //TODO usare enumerato
    private List<AllergeniEnum> allergeni;

    public Portata(String name, double price, String description, List<AllergeniEnum> allergeni) {
        this.name = name;
        this.price = price;
        this.description = description;
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

<<<<<<< HEAD
    public void printInfoPortata(){
        System.out.println(ColorEnum.GREEN.getAnsiCode()+getName() + " " + ColorEnum.PURPLE.getAnsiCode()+getPrice()+"€" + "\n" + ColorEnum.CYAN.getAnsiCode()+getDescription() +
                           "\n" +ColorEnum.YELLOW.getAnsiCode()+"Allergeni : " +ColorEnum.RED.getAnsiCode()+getAllergeni());
    }
=======
//    public void printInfoPortata(){
//        System.out.println("Tutti i campi 88888888888");
//    }
>>>>>>> 38ce93793fc635c6e908f96c6d19a7bb11f7886c
}

