import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtNumUno;
    private JPanel Calculadora;
    private JTextField txtNumDos;
    private JButton butSumar;
    private JButton butRest;
    private JButton butMulti;
    private JButton butDiv;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Practica 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(600, 500);
        frame.setContentPane(new Calculadora().Calculadora);
        frame.setBounds(40,40,1000,1000);

        frame.pack();
        frame.setVisible(true);
    }
    public Calculadora() {



        butSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtNumUno.getText());
                int b = Integer.parseInt(txtNumDos.getText());
                JOptionPane.showMessageDialog(null, "la sumataria total es: " + (a + b));
                txtNumUno.setText("");
                txtNumDos.setText("");

            }
        });
        butRest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtNumUno.getText());
                int b = Integer.parseInt(txtNumDos.getText());
                JOptionPane.showMessageDialog(null, "la resta total es: " + (a - b));
                txtNumUno.setText("");
                txtNumDos.setText("");
            }
        });
        butDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtNumUno.getText());
                int b = Integer.parseInt(txtNumDos.getText());
                JOptionPane.showMessageDialog(null,"la division total es: " + (a / b));
                txtNumUno.setText("");
                txtNumDos.setText("");
            }
        });
        butMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtNumUno.getText());
                int b = Integer.parseInt(txtNumDos.getText());
                JOptionPane.showMessageDialog(null, "la multiplicacion total es: " + (a * b));
                txtNumUno.setText("");
                txtNumDos.setText("");
            }
        });
    }

// Jose Samuel Cortinas De la Cruz 22130555
}