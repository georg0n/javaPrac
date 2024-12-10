package ru.mirea.lab20;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPNCalculatorView {
    private JFrame frame;
    private JTextField textField;
    private JButton[] numberButtons = new JButton[10];
    private JButton[] operatorButtons = new JButton[4];
    private JButton equalButton, clearButton;
    private RPNCalculator controller;

    public RPNCalculatorView(RPNCalculator controller) {
        this.controller = controller;
        frame = new JFrame("RPN Калькулятор");
        textField = new JTextField(20);

        // Настроим окно
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Панель с кнопками
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4)); // 5 строк и 4 столбца

        // Создаём кнопки с цифрами
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(new ButtonClickListener());
            buttonPanel.add(numberButtons[i]);
        }

        // Операторы
        String[] operators = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            operatorButtons[i] = new JButton(operators[i]);
            operatorButtons[i].addActionListener(new ButtonClickListener());
            buttonPanel.add(operatorButtons[i]);
        }

        // Кнопки равенства и очистки
        equalButton = new JButton("=");
        equalButton.addActionListener(new EqualButtonListener());
        clearButton = new JButton("C");
        clearButton.addActionListener(new ClearButtonListener());

        // Добавляем компоненты в интерфейс
        frame.add(textField, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.add(equalButton, BorderLayout.SOUTH);
        frame.add(clearButton, BorderLayout.EAST);

        frame.pack();
        frame.setVisible(true);
    }

    public void appendToTextField(String text) {
        textField.setText(textField.getText() + text);
    }

    public String getTextFromTextField() {
        return textField.getText();
    }

    public void setTextField(String text) {
        textField.setText(text);
    }

    // Логика для обработки нажатия кнопок
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            appendToTextField(command + " ");
        }
    }

    private class EqualButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String expression = getTextFromTextField().trim();
                double result = controller.evaluate(expression);
                setTextField(String.valueOf(result));
            } catch (Exception ex) {
                setTextField("Ошибка");
            }
        }
    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            setTextField("");
        }
    }
}
