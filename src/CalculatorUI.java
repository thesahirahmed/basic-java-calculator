import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorUI {
    private JFrame frame;
    private JTextField display;
    private String expression;
    private CalculatorLogic calculatorLogic;

    public CalculatorUI() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        display.setBackground(Color.YELLOW);
        display.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.RED),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("SansSerif", Font.PLAIN, 24));
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));
        addButton(buttonPanel, "7");
        addButton(buttonPanel, "8");
        addButton(buttonPanel, "9");
        addButton(buttonPanel, "/");
        addButton(buttonPanel, "4");
        addButton(buttonPanel, "5");
        addButton(buttonPanel, "6");
        addButton(buttonPanel, "*");
        addButton(buttonPanel, "1");
        addButton(buttonPanel, "2");
        addButton(buttonPanel, "3");
        addButton(buttonPanel, "-");
        addButton(buttonPanel, "0");
        addButton(buttonPanel, ".");
        addButton(buttonPanel, "%");
        addButton(buttonPanel, "+");
        addButton(buttonPanel, "C");
        addButton(buttonPanel, "00");
        addButton(buttonPanel, "=");
        addButton(buttonPanel, "Design by");
        frame.add(buttonPanel, BorderLayout.CENTER);

        calculatorLogic = new CalculatorLogic();

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void addButton(JPanel panel, String buttonText) {
        JButton button = new JButton(buttonText);
        button.setForeground(Color.BLACK);
        button.setBackground(Color.PINK);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.addActionListener(new ButtonListener());
        panel.add(button);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String buttonText = event.getActionCommand();
            if ("0123456789.".indexOf(buttonText) >= 0) {
                expression += buttonText;
                display.setText(expression);
            } else if ("+-*/%".indexOf(buttonText) >= 0) {
                expression += " " + buttonText + " ";
                display.setText(expression);
            } else if ("C".equals(buttonText)) {
                expression = "";
                display.setText("");
            } else if ("=".equals(buttonText)) {
                String result = calculatorLogic.calculate(expression);
                display.setText(result);
                expression = "";
            } else if ("00".equals(buttonText)) {
                expression += "00";
                display.setText(expression);
            } else if ("Design by".equals(buttonText)) {
                display.setText("Pratham & Sahir");
            }
        }
    }

    public static void main(String[] args) {
        new CalculatorUI();
    }

	public void createUI() {
		// TODO Auto-generated method stub
		
	}
}
