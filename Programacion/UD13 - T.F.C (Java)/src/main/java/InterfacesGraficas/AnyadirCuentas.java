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
    private JComboBox<String> menuTipoCuenta;
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
        JLabel labelTipoCuenta = new JLabel("Tipo De cuenta (cuenta corriente/ahorro)*");
        labelTipoCuenta.setFont(textoSecundario);
        labelTipoCuenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 40));
        labelTipoCuenta.setForeground(Color.white);
        panelTipoCuenta.add(labelTipoCuenta);

        menuTipoCuenta = new JComboBox<>(new String[]{"Cuenta Corriente", "Cuenta de Ahorros"});
        menuTipoCuenta.setFont(textoSecundario);
        menuTipoCuenta.setPreferredSize(nombreBancoField.getPreferredSize());
        menuTipoCuenta.setSelectedIndex(-1);
        panelTipoCuenta.add(menuTipoCuenta);

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

        String nombreBanco = nombreBancoField.getText().toLowerCase().trim();
        String tipoCuenta = String.valueOf(menuTipoCuenta.getSelectedItem());

        try (Connection connection = conexionDatabase.connect()) {
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
                String insertCuetnas = null;
                switch (tipoCuenta.toLowerCase()) {
                    case "cuenta corriente":
                        insertCuetnas = "insert into cuentaCorriente " +
                                "(id_cuenta, saldo, fechaApertura) values (?, ?, curdate())";
                        break;
                    case "cuenta de ahorros":
                        insertCuetnas = "insert into cuentaAhorro (id_cuenta, saldo, fechaApertura) " +
                                "values (?, ?, curdate())";
                        break;
                }
                PreparedStatement insertCuentaCorrientePs = connection.prepareStatement(insertCuetnas);
                insertCuentaCorrientePs.setInt(1, idCuenta);
                insertCuentaCorrientePs.setInt(2, 0); 
                insertCuentaCorrientePs.executeUpdate();
                AdministrarCuentas administrarCuentas = new AdministrarCuentas(idUsuario);
                administrarCuentas.setVisible(true);
                this.setVisible(false);
            }
            JOptionPane.showMessageDialog(null, "Valores introducidos");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al añadir la cuenta: "
                    + ex.getMessage());
        }
    }
}