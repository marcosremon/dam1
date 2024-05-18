package InterfacesGraficas;


import Metodos.ConexionDatabase;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnyadirCuentas extends JFrame {
    private int idUsuario;
    private Font titulosRegistros = new Font("Arial", Font.BOLD, 35);
    private Font textoDefault = new Font("Arial", 0, 13);
    private Font textoSecundario = new Font("Arial", Font.BOLD, 13);
    private Font textoBotones = new Font("Arial", Font.BOLD, 20);
    private JTextField nombreBancoField;
    private JTextField tipoCuentaField;
    private Border fieldBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    private JPanel crearPanelNegro() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        return panel;
    }
    public AnyadirCuentas(int idUsuario) {
        this.idUsuario = idUsuario;
        getContentPane().setBackground(Color.black);
        this.setTitle("Anyadir Cuentas");
        this.setLayout(new GridLayout(8, 1));

        JPanel panelSaltoLinea1 = crearPanelNegro();
        this.add(panelSaltoLinea1);

        JPanel panelAnyadirCuentas = crearPanelNegro();
        JLabel labelAnyadirCuentas = new JLabel("Añadir Cuentas");
        labelAnyadirCuentas.setForeground(Color.white);
        labelAnyadirCuentas.setFont(titulosRegistros);
        panelAnyadirCuentas.add(labelAnyadirCuentas);
        this.add(panelAnyadirCuentas);

        JPanel panelSaltoLinea2 = crearPanelNegro();
        this.add(panelSaltoLinea2);

        JPanel panelNombreBanco = crearPanelNegro();
        JLabel labelNombreBanco = new JLabel("Nombre Entidad Bancaria*");
        labelNombreBanco.setFont(textoSecundario);
        labelNombreBanco.setForeground(Color.white);
        labelNombreBanco.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 135));
        panelNombreBanco.add(labelNombreBanco);
        nombreBancoField = new JTextField(20);
        nombreBancoField.setBorder(fieldBorder);
        panelNombreBanco.add(nombreBancoField);
        this.add(panelNombreBanco);

        JPanel panelTipoCuenta = crearPanelNegro();
        JLabel labelTipoCuenta = new JLabel("Tipo De cuenta (cuenta corrirente/ahorro)*");
        labelTipoCuenta.setFont(textoSecundario);
        labelTipoCuenta.setForeground(Color.white);
        labelTipoCuenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 37));
        panelTipoCuenta.add(labelTipoCuenta);
        tipoCuentaField = new JTextField(20);
        tipoCuentaField.setBorder(fieldBorder);
        panelTipoCuenta.add(tipoCuentaField);
        this.add(panelTipoCuenta);

        JPanel panelSaltoLinea3 = crearPanelNegro();
        this.add(panelSaltoLinea3);

        JPanel panelBoton = crearPanelNegro();
        JButton botonAnyadirCuenta = new JButton("Añadir Cuenta");
        botonAnyadirCuenta.setPreferredSize(new Dimension(200, 50));
        botonAnyadirCuenta.setFont(textoBotones);
        botonAnyadirCuenta.setBackground(Color.white);
        botonAnyadirCuenta.setForeground(Color.black);
        panelBoton.add(botonAnyadirCuenta);
        botonAnyadirCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anyadirCuenta(e);
            }
        });
        this.add(panelBoton);

        this.setSize(700, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void anyadirCuenta(ActionEvent e) {
        ConexionDatabase conexionDatabase = new ConexionDatabase();
        VisualizarCuentas visualizarCuentas = new VisualizarCuentas(idUsuario);

        String nombreBanco = nombreBancoField.getText().toLowerCase().trim();
        String tipoCuenta = tipoCuentaField.getText().toLowerCase().trim();

        try (Connection connection = conexionDatabase.connect()) {
            if (tipoCuenta.equals("cuenta corriente") || tipoCuenta.equals("cuenta de ahorros")) {
                String anyadirCuenta = "insert into cuentas (id_usuario, nombreBanco, tipoCuenta) values (?, ?, ?)";
                PreparedStatement anyadirCuentaPs = connection.prepareStatement(
                        anyadirCuenta, PreparedStatement.RETURN_GENERATED_KEYS);
                anyadirCuentaPs.setInt(1, idUsuario);
                anyadirCuentaPs.setString(2, nombreBanco);
                anyadirCuentaPs.setString(3, tipoCuenta);
                anyadirCuentaPs.executeUpdate();
                ResultSet obtenerIdCuentasRs = anyadirCuentaPs.getGeneratedKeys();
                if (obtenerIdCuentasRs.next()) {
                    int idCuenta = obtenerIdCuentasRs.getInt(1);
                    if (tipoCuenta.equals("cuenta corriente")) {
                        String anyadirCuentaCorriente = "insert into cuentaCorriente " +
                                "(id_cuenta, saldo, fechaApertura) values (?, ?, curdate())";
                        PreparedStatement insertCuentaCorrinetePs = connection.prepareStatement(anyadirCuentaCorriente);
                        insertCuentaCorrinetePs.setInt(1, idCuenta);
                        insertCuentaCorrinetePs.setInt(2, 0);
                        insertCuentaCorrinetePs.executeUpdate();
                        visualizarCuentas.setVisible(true);
                        this.setVisible(false);
                    } else if (tipoCuenta.equals("cuenta de ahorros")) {
                        String anyadirCuentaAhorros = "insert into cuentaAhorro (id_cuenta, saldo, fechaApertura) " +
                                "values (?, ?, curdate())";
                        PreparedStatement insertCuentaAhorros = connection.prepareStatement(anyadirCuentaAhorros);
                        insertCuentaAhorros.setInt(1, idCuenta);
                        insertCuentaAhorros.setInt(2, 0);
                        insertCuentaAhorros.executeUpdate();
                        visualizarCuentas.setVisible(true);
                        this.setVisible(false);
                    }
                } JOptionPane.showMessageDialog(null, "Valores introducidos");
            } else JOptionPane.showMessageDialog(null, "Error, introduzca correctamente " +
                    "los valores");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir la cuenta: "
                    + ex.getMessage());
        }
    }
}