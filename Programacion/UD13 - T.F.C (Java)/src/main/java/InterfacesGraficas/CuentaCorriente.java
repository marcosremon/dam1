package InterfacesGraficas;

import javax.swing.*;

public class CuentaCorriente extends JFrame {
    public CuentaCorriente() {
        this.setTitle("Cuenta Corriente");

        this.setSize(800, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}