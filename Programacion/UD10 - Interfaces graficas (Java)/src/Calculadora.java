import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JFrame frame;
    private JTextField pantalla;
    private double num1, num2;
    private String operacion;
    private boolean nuevaOperacion;

    public Calculadora() {
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(375,500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(5,4));

        String[] botones = {"C", "()", "%", "/", "7", "8", "9", "X", "4", "5", "6", "-", "1", "2", "3",
                "+", "+/-", "0", ",", "="};

        ActionListener opciones = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String comando = e.getActionCommand();
                if (comando.equals("C")) {
                    pantalla.setText("");
                    nuevaOperacion = true;
                } else if (comando.equals("+/-")) {
                    if (nuevaOperacion) {
                        num1 = -num1;
                        pantalla.setText(String.valueOf(num1));
                    } else {
                        num2 = -num2;
                        pantalla.setText(String.valueOf(num2));
                    }
                }
            }
        };

        for (String boton : botones) {
            JButton nuevoBoton = new JButton(boton);
            nuevoBoton.setOpaque(false);
            nuevoBoton.setContentAreaFilled(false);
            nuevoBoton.addActionListener(opciones);
            frame.add(nuevoBoton);
        }
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Calculadora();
    }
}