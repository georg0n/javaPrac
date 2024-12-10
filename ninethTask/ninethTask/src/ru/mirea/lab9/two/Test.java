package ru.mirea.lab9.two;

public class Test {
    public static void main(String[] args) {
        Priceable product = new Product("Laptop", 1200.50);
        Priceable service = new Service("Web Design", 50.0, 10);
        Priceable subscription = new Subscription("Premium", 9.99);

        // Выводим цены
        System.out.println("Цена товара " + ((Product) product).getName() + ": $" + product.getPrice());
        System.out.println("Цена услуги " + ((Service) service).getName() + ": $" + service.getPrice());
        System.out.println("Цена абонемента " + ((Subscription) subscription).getType() + ": $" + subscription.getPrice());
    }
}
