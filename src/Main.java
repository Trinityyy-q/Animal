public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(5, 100.0, 0.75);
        Product product2 = new Product(3, 250.0, 42.575);
        Product product3 = new Product(10, 80.0, 59.1);

        System.out.println("Результаты для первого товара:");
        product1.calculateTotal();

        System.out.println("\nРезультаты для второго товара:");
        product2.calculateTotal();

        System.out.println("\nРезультаты для третьего товара:");
        product3.calculateTotal();
    }
}