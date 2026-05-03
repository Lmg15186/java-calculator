import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class Calculation extends JFrame implements ActionListener {

    private final JTextField inputField1;
    private final JTextField inputField2;
    private final JTextField resultField;
    private final JButton addButton;
    private final JButton subtractButton;
    private final JButton multiplyButton;
    private final JButton divideButton;
    private final JButton clearButton;
    private final JButton exitButton;


    public Calculation() {
        super("Java Calculator Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); 
        setSize(350, 300); 
        setResizable(false); 

        inputField1 = new JTextField(30);
        inputField2 = new JTextField(30);
        resultField = new JTextField(30);
        resultField.setEditable(false); 

        add(new JLabel("Number 1:"));
        add(inputField1);
        add(new JLabel("Number 2:"));
        add(inputField2);
        add(new JLabel("Result:"));
        add(resultField);

        addButton = new JButton("Add (+)");
        subtractButton = new JButton("subtract (-)");
        multiplyButton = new JButton("multiply (*)");
        divideButton = new JButton("divide (/)");
        clearButton = new JButton("clear");
        exitButton = new JButton("exit");

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(clearButton);
        add(exitButton);

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        clearButton.addActionListener(this);
        exitButton.addActionListener(this);

        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == exitButton) {
            System.exit(0);
            return;
        }

   
        if (e.getSource() == clearButton) {
            inputField1.setText("");
            inputField2.setText("");
            resultField.setText("");
            return;
        }

        try {
            double num1 = Double.parseDouble(inputField1.getText());
            double num2 = Double.parseDouble(inputField2.getText());
            double result = 0;

            if (e.getSource() == addButton) {
                result = num1 + num2;
            } else if (e.getSource() == subtractButton) {
                result = num1 - num2;
            } else if (e.getSource() == multiplyButton) {
                result = num1 * num2;
            } else if (e.getSource() == divideButton) {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this, "Error: Division by zero not allowed.", "Calculation Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                result = num1 / num2;
            }

            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "Error: Division by zero not allowed.", "Calculation Error", JOptionPane.ERROR_MESSAGE);
            resultField.setText("Error");
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculation::new);
    }
}