package ClotheStore;

public class Clothes {
    private String description="";
    private String price="";

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void packing() {
        System.out.println("Wrap it with paper, then put it in box");
    }
}
