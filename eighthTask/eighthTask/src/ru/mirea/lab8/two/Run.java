package ru.mirea.lab8.two;

public class Run {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error, file is not found");
            System.exit(0);
        }
        App app = new App(args[0]);
        app.run();
    }
}
