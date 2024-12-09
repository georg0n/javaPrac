package ru.mirea.lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Prac6 extends JFrame {
    private int milan;
    private int madrid;

    private JButton milan_btn;
    private JButton madrid_btn;

    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    private JPanel scoringPanel;
    private JPanel resultPanel;

    Prac6() {
        milan = 0;
        madrid = 0;
        this.setTitle("Match!");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(450, 200);

        milan_btn = new JButton("AC Milan");
        madrid_btn = new JButton("Real Madrid");
        resultLabel = new JLabel("Result: 0 X 0");
        lastScorerLabel = new JLabel("Last Scorer: N/A");
        winnerLabel = new JLabel("Winner: DRAW");

        milan_btn.setFont(new Font("Arial", Font.PLAIN, 16));
        madrid_btn.setFont(new Font("Arial", Font.PLAIN, 16));

        resultLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        lastScorerLabel.setFont(new Font("Times new roman", Font.BOLD, 18));
        winnerLabel.setFont(new Font("Times new roman", Font.BOLD, 18));

        scoringPanel = new JPanel();
        scoringPanel.add(milan_btn);
        scoringPanel.add(resultLabel);
        scoringPanel.add(madrid_btn);

        resultPanel = new JPanel();
        resultPanel.add(lastScorerLabel);
        resultPanel.add(winnerLabel);

        ActionListener actionHandler = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent action) {
                String comand;
                if (action.getActionCommand().equals("AC Milan")) {
                    milan++;
                    comand = "AC Milan";
                } else {
                    madrid++;
                    comand = "Real Madrid";
                }
                resultLabel.setText("Result: " + milan + " X " + madrid);
                lastScorerLabel.setText("Last Scorer: " + comand);
                winnerLabel.setText("Winner: " + (milan == madrid ? "DRAW" : (milan > madrid ? "AC Milan" : "Real Madrid")));
            }
        };
        milan_btn.addActionListener(actionHandler);
        madrid_btn.addActionListener(actionHandler);
    }

    public void run() {
        getContentPane().add(BorderLayout.NORTH, scoringPanel);
        getContentPane().add(BorderLayout.SOUTH, resultPanel);

        this.setResizable(false);
        this.setVisible(true);
    }
}
