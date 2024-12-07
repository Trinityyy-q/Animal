
public class Product {
    // Количество товаров
    int quantity;

    // Цена за единицу товара
    double price;

    // Скидка на товар в процентах
    double discount;

    /**
     * quantity Количество товаров
     * price Цена за единицу товара
     * discount Скидка на товар в процентах
     */
    public Product(int quantity, double price, double discount) {
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    /**
     * Метод для расчета общей суммы покупки.
     * Выводит общую сумму без скидки и со скидкой, округленную до 2 знаков после запятой.
     */
    public void calculateTotal() {
        double totalWithoutDiscount = quantity * price; // Общая сумма без скидки
        double totalWithDiscount = totalWithoutDiscount * (1 - discount / 100); // Общая сумма со скидкой

        // Округляем до 2 знаков после запятой
        totalWithoutDiscount = Math.round(totalWithoutDiscount * 100.0) / 100.0;
        totalWithDiscount = Math.round(totalWithDiscount * 100.0) / 100.0;

        System.out.println("Общая сумма без скидки: " + totalWithoutDiscount);
        System.out.println("Общая сумма со скидкой: " + totalWithDiscount);
    }
}