package ru.mirea.lab16;

public class ThrowsDemo6 {

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

        // Вызов метода printMessage с правильным значением ключа
        demo.printMessage("Hello");

        // Вызов метода printMessage с null (что приведет к выбросу исключения)
        demo.printMessage(null);
    }
}
/*блок try-catch позволяет программе продолжить выполнение, даже если возникает исключение. В данном случае программа не "ломается", а вместо этого выводит сообщение об ошибке, информируя пользователя о проблеме. Это делает программу более устойчивой и предотвращает ее аварийное завершение.*/