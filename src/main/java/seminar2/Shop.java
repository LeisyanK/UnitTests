package seminar2;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    // для задания5
    public int getQuantityByID(int id){
        for (Product prod : products) {
            if (prod.getId() == id) {
                return prod.getQuantity();
            }
        }
        return -1;
    }
}
