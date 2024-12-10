package ru.mirea.lab20;

public class RPNCalculatorController {
    private RPNCalculatorView view;
    private RPNCalculator model;

    public RPNCalculatorController(RPNCalculatorView view, RPNCalculator model) {
        this.view = view;
        this.model = model;
    }

    public void start() {
        view = new RPNCalculatorView(model);
    }

    public static void main(String[] args) {
        RPNCalculator model = new RPNCalculator();
        RPNCalculatorView view = new RPNCalculatorView(model);
        RPNCalculatorController controller = new RPNCalculatorController(view, model);
        controller.start();
    }
}