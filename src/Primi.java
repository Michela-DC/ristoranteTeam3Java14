public class Primi {
    private String name;
    private double price;
    private String description;


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

    public Primi ( String name , double price , String description ){
        this.name=name;
        this.price=price;
        this.description=description;
    }

//    @Override
//    public String toString() {
//        return  name.toUpperCase() + "  " + price + "€" +"\n" + description ;
//    }
}
