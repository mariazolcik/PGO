import java.util.ArrayList;
public class Category {
    String nazwa;
    ArrayList<Product> products;

    public Category(String nazwa) {
        this.nazwa = nazwa;
    }

    public Category(String nazwa, ArrayList<Product> products) {
        this.nazwa = nazwa;
        this.products = products;
    }
    public void addProducts(Product product){this.products.add(product);}

    public void removeProducts(Product product){this.products.remove(product);}

}
