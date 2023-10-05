package seminar2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;
    private double totalPrice;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // Чтобы положить продукт в корзину, его нужно сначала найти в магазтне
//    private  Product getProductBiProductID(int id) {
//        Product product = new Product();
//
//        List<Product> products = shop.getProductsShop();
//        for (Product prod : products) {
//            if (prod.getId() == id) {
//                product = prod;
//                break;
//            }
//        }
//        if (id > shop.getProductsShop().size() || id < 0) {
//            try
//        }
//    }

    // для задания5
    public int getQuantityByID(int id){
        for (Product prod : items) {
            if (prod.getId() == id) {
                return prod.getQuantity();
            }
        }
        return -1;
    }

    public boolean containsProduct(Product product) {
        return items.contains(product);
    }

    public void recalculate() { // метод пересчитывания суммы покупки
        totalPrice = 0.00;
        for (Product prod : items) {
            totalPrice += prod.getPrice() * prod.getQuantity();
        }

    }

    private void addToCart(Product product) throws  CartException {
        throw new CartException("Указать свое сообщение ошибки");
    }

    public void addProductToCartByID(int id){
        // дописать
    }

}
