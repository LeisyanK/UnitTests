package seminar2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
* Задание №1
Разработайте модульный тест для проверки, что общая стоимость корзины с разными
товарами корректно рассчитывается
💡 Ожидаемый результат: Стоимость корзины посчиталась корректно
* */
public class CartTest {
    private Cart cart;
    private Product product1; // для задания3
    private Product product2; // для задания3
    private Shop shop4; // для задания4
    private Cart cart4; // для задания4
    private Shop shop5; // для задания5
    private Cart cart5; // для задания5

    @BeforeEach // выполняется перед каждым тестом
    public void setUp() {
        cart = new Cart();
        Product product1 = new Product(1, "Товар 1", 500.0, 1);// для задания3
        Product product2 = new Product(2, "Товар 2", 300.0, 1);// для задания3
        shop4 = new Shop(); // для задания4
        cart4 = new Cart(); // для задания4
        shop5 = new Shop(); // для задания4
        cart5 = new Cart(); // для задания4
    }

    @Test
    public void testCalculateTotalWithMultipleProducts() {
// Создаем несколько продуктов
        Product product1 = new Product(1, "Товар 1", 500.0, 1);
        Product product2 = new Product(2, "Товар 2", 300.0, 1);
        Product product3 = new Product(3, "Товар 3", 200.0, 1);

// Добавляем продукты в корзину
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

// Проверяем, что общая стоимость корзины рассчитывается корректно
        double expectedTotalPrice = 1000.0; // 500 + 300 + 200
        double actualTotalPrice = cart.calculateTotal();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01); // Погрешность 0.01 для сравнения с плавающей точкой
    }

    @Test
    public void testCalculateTotalWithEmptyCart() {
// Проверяем, что общая стоимость пустой корзины равна 0.0
        double expectedTotalPrice = 0.0;
        double actualTotalPrice = cart.calculateTotal();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01);
    }

    @Test
    public void testCalculateTotalWithSingleProduct() {
// Создаем один продукт
        Product product = new Product(1, "Товар 1", 500.0, 1);

// Добавляем продукт в корзину
        cart.addProduct(product);

// Проверяем, что общая стоимость корзины с одним товаром равна цене этого товара
        double expectedTotalPrice = 500.0;
        double actualTotalPrice = cart.calculateTotal();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01);
    }

    /*
    * Задание №2
Создайте модульный тест для проверки, что общая стоимость корзины с множественными
экземплярами одного и того же продукта корректно рассчитывается.
💡 Ожидаемый результат: Стоимость корзины посчиталась корректно
* */
    @Test
    public void testCalculateTotalWithMultipleSameProducts() {
// Создаем несколько продуктов
        Product product1 = new Product(1, "Товар 1", 500.0, 1);
        Product product2 = new Product(2, "Товар 1", 500.0, 1);
        Product product3 = new Product(3, "Товар 3", 200.0, 1);

// Добавляем продукты в корзину
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

// Проверяем, что общая стоимость корзины рассчитывается корректно
        double expectedTotalPrice = 1200.0; // 500 + 500 + 200
        double actualTotalPrice = cart.calculateTotal();
        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01); // Погрешность 0.01 для сравнения с плавающей точкой
    }

    /*Задание №3
Напишите модульный тест для проверки, что при удалении товара из
корзины происходит перерасчет общей стоимости корзины.
💡 Ожидаемый результат: Вызывается метод пересчета стоимости
корзины, стоимость корзины меняется
*/
    @Test
    public void testRecalculateTotalAfterRemovingProduct() {
// Добавляем продукты в корзину
        cart.addProduct(product1);
        cart.addProduct(product2);

// Первоначальная стоимость корзины
        double initialTotalPrice = cart.calculateTotal();

// Удаляем продукт из корзины
        cart.removeProduct(product1);

// Получаем обновленную стоимость корзины после удаления товара
        double updatedTotalPrice = cart.calculateTotal();

// Проверяем, что стоимость корзины изменилась после удаления товара
        assertNotEquals(initialTotalPrice, updatedTotalPrice, 0.01); // Погрешность 0.01 для сравнения с плавающей точкой
    }

    // задания4
    /**
     * Разработайте модульный тест для проверки, что при добавлении определенного количества
     * товара в корзину, общее количество этого товара в магазине соответствующим образом
     * уменьшается.
     * 💡 Ожидаемый результат: Количество товара в магазине
     * уменьшается на число продуктов в корзине пользователя
     */
    @Test
    public void testProductRemoveFromShopOnAddingToCart(){
        shop4.addProduct(product1);
        shop4.addProduct(product2);
        int initialProductInShop = shop4.getProducts().size();
//        System.out.println(initialProductInShop);

        cart.addProduct(product1);
        int productInCart = cart.getItems().size();
//        System.out.println(productInCart);
        shop4.removeProduct(product1);
        int finalProductInShop = shop4.getProducts().size();
//        System.out.println(finalProductInShop);
        // expected, actual
        assertEquals(finalProductInShop, initialProductInShop - productInCart);

//        // Добавляем 3 товара в корзину
//        cart.addProduct(product, 3);
//
//// Проверяем, что количество товара в магазине уменьшилось на 3
//        int expectedQuantityInShop = 2; // 5 - 3
//        int actualQuantityInShop = shop.findProductById(product.getId()).getQuantity();
//        assertEquals(expectedQuantityInShop, actualQuantityInShop);
    }

//    @Test // dторой вариант задания 4
//    public void func(){
//        shop.addProduct(product);
//
//// Добавляем продукт в корзину пользователя
//        cart.addProduct(product);
//
//// Проверяем, что количество продукта в магазине уменьшилось на количество продуктов в корзине
//        int initialQuantity = shop.getProductQuantity(product);
//        int cartQuantity = cart.getProductQuantity(product);
//
//        shop.decreaseProductQuantity(product, cartQuantity);
//
//        int updatedQuantity = shop.getProductQuantity(product);
//        int expectedQuantity = initialQuantity - cartQuantity;
//
//        assertEquals(expectedQuantity, updatedQuantity);
//    }

//    public void decreaseProductQuantity(Product product, int quantity) {
//        for (int i = 0; i < products.size(); i++) {
//            Product shopProduct = products.get(i);
//            if (shopProduct.getId() == product.getId()) {
//                int currentQuantity = shopProduct.getQuantity();
//                if (currentQuantity >= quantity) {
//                    shopProduct.setQuantity(currentQuantity - quantity);
//                    if (currentQuantity - quantity == 0) {
//// Если количество товара стало равным нулю, удаляем товар из магазина
//                        removeProduct(shopProduct);
//                    }
//                    return; // Завершаем поиск, так как товар найден и обработан
//                } else {
//// Можно выбросить исключение или обработать ситуацию, когда пытаемся уменьшить количество товара,
//// которого нет в достаточном количестве в магазине
//                    throw new IllegalArgumentException("Недостаточное количество товара в магазине");
//                }
//            }
//        }
//    }

    /*
    * Задание №5
Создайте модульный тест для проверки, что если пользователь забирает все имеющиеся
продукты определенного типа из магазина, эти продукты больше не доступны для заказа.
💡 Ожидаемый результат: Больше такой продукт
заказать нельзя, он не появляется на полке*/
    @Test
    public void testWithMultipleProducts() {
// Создаем несколько продуктов
        Product product1 = new Product(1, "Товар 1", 500.0, 2);
        Product product2 = new Product(2, "Товар 2", 300.0, 1);
        Product product3 = new Product(3, "Товар 3", 200.0, 1);
        shop5.addProduct(product1);
        shop5.addProduct(product2);
        shop5.addProduct(product3);


// Добавляем продукты в корзину
        cart5.addProduct(new Product(1, "Товар 1", 500.0, 1));
        cart5.addProduct(new Product(2, "Товар 2", 300.0, 1));
//        cart5.addProduct(product3);

// Проверяем, что нельзя купить закончившийся товар
        int quantityInCart = cart5.getQuantityByID(2);
        int quantityInShop = shop5.getQuantityByID(2);
        // expected, actual
        assertNotEquals(0, quantityInShop - quantityInCart, "Товар закончился");
//        assertEquals(expectedTotalPrice, actualTotalPrice, 0.01); // Погрешность 0.01 для сравнения с плавающей точкой

        // c семинара
        shop5 = new Shop();
        shop5.addProduct(product1);
//        cart5.addProduct(product1);
        cart5.addProductToCartByID(1);
        assertThrows(CartException.class, () -> {
            cart5.addProductToCartByID(1);
        });

        Product product = shop5.getProducts().get(0);
        // Проверяем, что первый продукт больше недоступен для заказа
        assertEquals(product.getQuantity(), 0);
        assertFalse(cart.containsProduct(product1));
    }


}
