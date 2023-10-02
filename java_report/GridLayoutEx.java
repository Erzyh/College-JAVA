package gui_report;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GridLayoutEx extends JFrame {
    private JPanel gridPanel;
    private List<JButton> buttons;
    private int checkedNumber = 1;

    public GridLayoutEx() {
        setTitle("GridLayout Test");
        setSize(300, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPanel = new JPanel(new BorderLayout());

        // 요구사항 #1
        initializeGridPanel();

        // 요구사항 #2
        setResizable(false);

        // 요구사항 #3
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.GRAY);
        JButton restartButton = new JButton("Restart");

        // 요구사항 #4
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shuffleNumbers();
            }
        });

        buttonPanel.add(restartButton);

        contentPanel.add(gridPanel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(contentPanel);
        setVisible(true);
    }

    private void initializeGridPanel() {
        gridPanel = new JPanel(new GridLayout(5, 5, 5, 5));
        buttons = new ArrayList<>();

        for (int i = 1; i <= 25; i++) {
            JButton button = new JButton(Integer.toString(i));
            buttons.add(button);

            // 요구사항 #5
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int clickedNumber = Integer.parseInt(button.getText());
                    if (clickedNumber == checkedNumber) {
                        button.setEnabled(false);
                        checkedNumber++;
                    }
                }
            });

            gridPanel.add(button);
        }

        shuffleNumbers();
    }

    private void shuffleNumbers() {
        Collections.shuffle(buttons);

        gridPanel.removeAll();

        for (JButton button : buttons) {
            gridPanel.add(button);
            button.setEnabled(true);
        }

        checkedNumber = 1;
        gridPanel.revalidate();
    }

    public static void main(String[] args) {
        new GridLayoutEx();
    }
}
