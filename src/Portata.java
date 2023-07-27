import java.util.List;

public class Portata {

    private String name;
    private Double price;
    private String description;

    //TODO usare enumerato
    private List<String> allergeni;

    public Portata(String name, double price, String description, List<String> allergeni) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.allergeni = allergeni;
    }

    public List<String> getAllergeni() {
        return allergeni;
    }

    public void setAllergeni(List<String> allergeni) {
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

//    public void printInfoPortata(){
//        System.out.println("Tutti i campi 88888888888");
//    }
}

