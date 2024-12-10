package ru.mirea.lab16;

public class ThrowsDemo {

    // Метод для вывода сообщения
    public void printMessage(String key) {
        try {
            // Вызов метода getDetails и вывод результата
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            // Обработка исключения: вывод сообщения об ошибке
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    // Метод для получения деталей
    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    // Точка входа программы
    public static void main(String[] args) {
        // Создаем объект класса ThrowsDemo
        ThrowsDemo demo = new ThrowsDemo();

        // Вызов метода printMessage с null (что приведет к выбросу исключения)
        demo.printMessage(null);

        // Вызов метода printMessage с обычным значением
        demo.printMessage("Hello");
    }
}
