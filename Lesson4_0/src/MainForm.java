import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class MainForm extends JFrame
{
    SpringLayout myLayout = new SpringLayout();
    public MainForm() {
        Toolkit tk=Toolkit.getDefaultToolkit(); //Initializing the Toolkit class.
        Dimension screenSize = tk.getScreenSize(); //Get the Screen resolution of our device.

        setTitle("Temperature Converter");
        setSize(305, 230);
        setLocation(screenSize.width/2-400,screenSize.height/2-300);
        setLayout(myLayout);

        // Title Label
        JLabel lblTitle = new JLabel("Type in temperature to convert");
        myLayout.putConstraint(SpringLayout.WEST, lblTitle, 20, SpringLayout.WEST, this); // x axis
        myLayout.putConstraint(SpringLayout.NORTH, lblTitle, 20, SpringLayout.NORTH, this); // y axis

        // Input Label
        JLabel lblInput = new JLabel("Input: ");
        myLayout.putConstraint(SpringLayout.WEST, lblInput, 20, SpringLayout.WEST, this); // x axis
        myLayout.putConstraint(SpringLayout.NORTH, lblInput, 40, SpringLayout.NORTH, lblTitle); // y axis

        // Input TextField
        JTextField txtInput = new JTextField(5);
        myLayout.putConstraint(SpringLayout.WEST, txtInput, 5, SpringLayout.EAST, lblInput); // x axis
        myLayout.putConstraint(SpringLayout.VERTICAL_CENTER, txtInput, 0, SpringLayout.VERTICAL_CENTER, lblInput); // y axis

        // Celsius Button
        JButton btnCelsius = new JButton("Convert to C");
        myLayout.putConstraint(SpringLayout.WEST, btnCelsius, 20, SpringLayout.WEST, this); // x axis
        myLayout.putConstraint(SpringLayout.NORTH, btnCelsius, 20, SpringLayout.SOUTH, lblInput); // y axis

        // Fahrenheit Button
        JButton btnFahrenheit = new JButton("Convert to F");
        myLayout.putConstraint(SpringLayout.WEST, btnFahrenheit, 10, SpringLayout.EAST, btnCelsius); // x axis
        myLayout.putConstraint(SpringLayout.VERTICAL_CENTER, btnFahrenheit, 0, SpringLayout.VERTICAL_CENTER, btnCelsius); // y axis

        // Output Label
        JLabel lblOutput = new JLabel("Output: ");
        myLayout.putConstraint(SpringLayout.WEST, lblOutput, 20, SpringLayout.WEST, this); // x axis
        myLayout.putConstraint(SpringLayout.NORTH, lblOutput, 20, SpringLayout.SOUTH, btnCelsius); // y axis

        // Output TextField
        JTextField txtOutput = new JTextField(10);
        myLayout.putConstraint(SpringLayout.WEST, txtOutput, 5, SpringLayout.EAST, lblOutput); // x axis
        myLayout.putConstraint(SpringLayout.VERTICAL_CENTER, txtOutput, 0, SpringLayout.VERTICAL_CENTER, lblOutput); // y axis

        // Add To Frame
        add(lblTitle);
        add(lblInput);
        add(txtInput);
        add(btnCelsius);
        add(btnFahrenheit);
        add(lblOutput);
        add(txtOutput);

        // Functions
        btnFahrenheit.addActionListener(new ActionListener() { // Celsius Function
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double input = 0;
                try {
                    input = Double.parseDouble(txtInput.getText());
                } catch (NumberFormatException ex) {
                    // Display an error message in the label if the input cannot be parsed to an int
                    txtOutput.setText("Invalid input.");
                    return;
                }
                double result = (input * 9) / 5 + 32;
                DecimalFormat f = new DecimalFormat("##.00");
                // Change the text in the label to display the parsed input
                String _result = f.format(result) + "";
                txtOutput.setText(_result);
            }
        });

        btnCelsius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double input = 0;
                try {
                    input = Double.parseDouble(txtInput.getText());
                } catch (NumberFormatException ex) {
                    // Display an error message in the label if the input cannot be parsed to an int
                    txtOutput.setText("Invalid input");
                    return;
                }
                double result = ((input - 32) * 5) /9;
                DecimalFormat f = new DecimalFormat("##.00");
                // Change the text in the label to display the parsed input
                String _result = f.format(result) + "";
                txtOutput.setText(_result);
            }
        });

        setResizable(true);
        setVisible(true);
    }
}
