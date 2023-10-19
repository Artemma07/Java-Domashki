import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    private JFrame frame;
    private JPanel panel;
    private JTextField inputField;
    private double num1 = 0;
    private char operator = ' ';
    private boolean newInput = true;

    public CalculatorGUI() {
        frame = new JFrame("Калькулятор");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4));

        inputField = new JTextField();
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setFont(new Font("Arial", Font.PLAIN, 20));
        inputField.setEditable(false);

        frame.add(inputField, BorderLayout.NORTH);
        frame.add(panel);

        addButtons();

        frame.setVisible(true);
    }

    private void addButtons() {
        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            panel.add(button);

            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String buttonText = ((JButton) e.getSource()).getText();
                    handleButtonInput(buttonText);
                }
            });
        }
    }

    private void handleButtonInput(String input) {
        if (newInput) {
            inputField.setText("");
            newInput = false;
        }

        if (Character.isDigit(input.charAt(0))) {
            inputField.setText(inputField.getText() + input);
        } else if (input.equals("C")) {
            clear();
        } else if (input.equals("=")) {
            calculate();
        } else {
            if (operator != ' ') {
                calculate();
            }
            num1 = Double.parseDouble(inputField.getText());
            operator = input.charAt(0);
            newInput = true;
        }
    }

    private void clear() {
        inputField.setText("");
        num1 = 0;
        operator = ' ';
    }

    private void calculate() {
        if (operator != ' ') {
            double num2 = Double.parseDouble(inputField.getText());
            switch (operator) {
                case '+':
                    inputField.setText(String.valueOf(num1 + num2));
                    break;
                case '-':
                    inputField.setText(String.valueOf(num1 - num2));
                    break;
                case '*':
                    inputField.setText(String.valueOf(num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        inputField.setText(String.valueOf(num1 / num2));
                    } else {
                        inputField.setText("Ошибка: деление на ноль");
                    }
                    break;
            }
            operator = ' ';
            newInput = true;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI();
            }
        });
    }
}
