package InterfacesGraficas;


import Metodos.ConexionDatabase;
import Metodos.EncriptarPassword;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InterfazInicioSesion extends JFrame {
    private Font titulosInicioSesion = new Font("Arial", Font.BOLD, 35);
    private Font textoDefault = new Font("Arial", 0, 13);
    private Font textoSecundario = new Font("Arial", Font.BOLD, 13);
    private Font textoBotones = new Font("Arial", Font.BOLD, 20);
    private JTextField usuarioField;
    private JPasswordField passwordField;
    private Border fieldBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);

    private JPanel crearPanelNegro() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        return panel;
    }
    public InterfazInicioSesion() {
        getContentPane().setBackground(Color.black);
        this.setTitle("Inicio De Sesión");
        this.setLayout(new GridLayout(9, 1));

        //panel vacio para salto de liniea
        JPanel panelVacio1 = crearPanelNegro();
        this.add(panelVacio1);

        JPanel panelIniciarSesion = crearPanelNegro();
        JLabel labelIniciarSesion = new JLabel("Iniciar Sesión");
        labelIniciarSesion.setForeground(Color.white);
        labelIniciarSesion.setFont(titulosInicioSesion);
        panelIniciarSesion.add(labelIniciarSesion);
        this.add(panelIniciarSesion);

        JPanel panelRegistrarse = crearPanelNegro();
        JLabel labelRegistrarse = new JLabel();
        labelRegistrarse.setText("<html>¿Es tu primera vez? <font color='#33CEFF'>Registrarse</font></html>");
        labelRegistrarse.setForeground(Color.white);
        labelRegistrarse.setFont(textoDefault);
        labelRegistrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panelRegistrarse.add(labelRegistrarse);
        labelRegistrarse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                InterfazRegistro interfazRegistro = new InterfazRegistro();
                InterfazInicioSesion.this.setVisible(false);
                interfazRegistro.setVisible(true);
            }
        });
        this.add(panelRegistrarse);

        //panel vacio para salto de liniea
        JPanel panelVacio2 = crearPanelNegro();
        this.add(panelVacio2);

        JPanel panelTextoUsuario = crearPanelNegro();
        JLabel labelUsuario = new JLabel("Usuario*");
        labelUsuario.setFont(textoSecundario);
        labelUsuario.setForeground(Color.white);
        labelUsuario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 87));
        panelTextoUsuario.add(labelUsuario);
        usuarioField = new JTextField(20);
        usuarioField.setBorder(fieldBorder);
        panelTextoUsuario.add(usuarioField);
        this.add(panelTextoUsuario);

        JPanel panelTextoPassword = crearPanelNegro();
        JLabel labelPassword = new JLabel("Password*");
        labelPassword.setFont(textoSecundario);
        labelPassword.setForeground(Color.white);
        labelPassword.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 75));
        panelTextoPassword.add(labelPassword);
        passwordField = new JPasswordField(20);
        passwordField.setBorder(fieldBorder);
        panelTextoPassword.add(passwordField);
        this.add(panelTextoPassword);

        //panel vacio para salto de liniea
        JPanel panelVacio3 = crearPanelNegro();
        this.add(panelVacio3);

        JPanel panelBoton = crearPanelNegro();
        JButton botonIniciarSesion = new JButton("Iniciar Sesión");
        botonIniciarSesion.setPreferredSize(new Dimension(200, 50));
        botonIniciarSesion.setFont(textoBotones);
        botonIniciarSesion.setBackground(Color.white);
        botonIniciarSesion.setForeground(Color.black);
        panelBoton.add(botonIniciarSesion);
        botonIniciarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                iniciarSesionDataBase(e);
            }
        });
        this.add(panelBoton);

        this.setSize(650, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void iniciarSesionDataBase(ActionEvent e) {
        ConexionDatabase conexionDatabase = new ConexionDatabase();

        String nombreUsuario = usuarioField.getText().toLowerCase();
        String passwordUsuario = new String(passwordField.getPassword()).toLowerCase();

        if (nombreUsuario.isBlank() || passwordUsuario.isBlank()) {
            JOptionPane.showMessageDialog(null, "Introduce el usuario y la contraseña");
        } else {
            String passwdEncriptada = EncriptarPassword.getHash(passwordUsuario);
            try (Connection connection = conexionDatabase.connect()) {
                String busquedaUsuario = "SELECT id FROM usuarios WHERE nombre = ? AND contrasenya = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(busquedaUsuario);
                preparedStatement.setString(1, nombreUsuario);
                preparedStatement.setString(2, passwdEncriptada);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "Hola, bienvenido");
                } else JOptionPane.showMessageDialog(null, "El usuario introducido no está " +
                            "registrado");
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}