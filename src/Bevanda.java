public class Bevanda {


    //TODO abbiamo su tutte le classi campi uguali, fare una classe padre e poi ognugno di voi inserisce dei campi in più persolazzati sulle vostre classi
    private String name;
    private double price;
    private String description;

    public Bevanda(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //TODO avevamo detto che serviva il metodo print che stampava le info dell'oggetto
    @Override
    public String toString() {
        return name.toUpperCase() +" "+ price +"\n"+ description ;
    }
}