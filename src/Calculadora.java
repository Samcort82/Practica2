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

    public Calculadora() {
        int a = Integer.parseInt(txtNumUno.getText());
        int b = Integer.parseInt(txtNumDos.getText());
        butSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, (a + b));
                txtNumUno.setText("");
                txtNumDos.setText("");

            }
        });
        butRest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, (a - b));
                txtNumUno.setText("");
                txtNumDos.setText("");
            }
        });
        butDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, (a / b));
                txtNumUno.setText("");
                txtNumDos.setText("");
            }
        });
        butMulti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, (a* b));
                txtNumUno.setText("");
                txtNumDos.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Practica 2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setContentPane(new Calculadora().Calculadora);
        frame.pack();
        frame.setVisible(true);
    }
}