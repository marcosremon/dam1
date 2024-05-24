package InterfacesGraficas;

import Metodos.ConexionDatabase;
import Metodos.EncriptarPassword;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Registrarse extends JFrame {
    private Font titulosRegistros = new Font("Arial", Font.BOLD, 25);
    private Font textoDefault = new Font("Arial", 0, 13);
    private Font textoSecundario = new Font("Arial", Font.BOLD, 15);
    private Font textoBotones = new Font("Arial", Font.BOLD, 20);
    private Border fieldBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    private JTextField fieldDni;
    private JTextField fieldNombre;
    private JTextField fieldPrimerApellido;
    private JTextField fieldSegundoApellido;
    private JPasswordField fieldPasswd;
    private JPasswordField fieldPasswdConfirm;
    private JTextField fieldEmail;
    private JTextField fieldDireccion;
    private JTextField fieldTelefono;
    private JPanel crearPanelNegro() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        return panel;
    }

    public Registrarse() {
        getContentPane().setBackground(Color.black);
        this.setTitle("Registro De Usuarios");
        this.setLayout(new GridLayout(16,1));

        JPanel panelSaltoDeLinea1 = crearPanelNegro();
        this.add(panelSaltoDeLinea1);

        JPanel panelregistro = crearPanelNegro();
        JLabel labelRegistro = new JLabel("Registro De Usuarios");
        labelRegistro.setFont(titulosRegistros);
        labelRegistro.setForeground(Color.white);
        panelregistro.add(labelRegistro);
        this.add(panelregistro);

        JPanel panelVolverAIniciarSesion = crearPanelNegro();
        JLabel labelVolverAIniciarSesion = new JLabel();
        labelVolverAIniciarSesion.setText("<html>¿Qieres Iniciar Sesión? <font color='#33CEFF'>Regresar</font></html>");
        labelVolverAIniciarSesion.setForeground(Color.white);
        labelVolverAIniciarSesion.setFont(textoDefault);
        labelVolverAIniciarSesion.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panelVolverAIniciarSesion.add(labelVolverAIniciarSesion);
        labelVolverAIniciarSesion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                IniciarSesion iniciarSesion = new IniciarSesion();
                Registrarse.this.setVisible(false);
                iniciarSesion.setVisible(true);
            }
        });
        this.add(panelVolverAIniciarSesion);

        JPanel panelSaltoDeLinea2 = crearPanelNegro();
        this.add(panelSaltoDeLinea2);

        JPanel panelDni = crearPanelNegro();
        JLabel labelDni = new JLabel("Dni*");
        labelDni.setForeground(Color.white);
        labelDni.setFont(textoSecundario);
        labelDni.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 185));
        panelDni.add(labelDni);
        fieldDni = new JTextField(20);
        fieldDni.setBorder(fieldBorder);
        fieldDni.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String dni = fieldDni.getText().trim();
                if (!dni.matches("\\d{8}[a-zA-Z]")) {
                    JOptionPane.showMessageDialog(null, "El formato del DNI no es válido. " +
                            "Debe ser 8 números seguidos de una letra.");
                    fieldDni.requestFocus();
                }
            }
        });
        panelDni.add(fieldDni);
        this.add(panelDni);

        JPanel panelEmail = crearPanelNegro();
        JLabel labelEmail = new JLabel("Email*");
        labelEmail.setForeground(Color.white);
        labelEmail.setFont(textoSecundario);
        labelEmail.setBorder(BorderFactory.createEmptyBorder(5,5,5,172));
        panelEmail.add(labelEmail);
        fieldEmail = new JTextField(20);
        fieldEmail.setBorder(fieldBorder);
        fieldEmail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String email = fieldEmail.getText().trim();
                if (!email.matches("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]{2,}$")) {
                    JOptionPane.showMessageDialog(null, "El formato de la direccion email " +
                            "no es válida.");
                    fieldDni.requestFocus();
                }
            }
        });
        panelEmail.add(fieldEmail);
        this.add(panelEmail);

        JPanel panelDireccion = crearPanelNegro();
        JLabel labelDireccion = new JLabel("Direccion*");
        labelDireccion.setForeground(Color.white);
        labelDireccion.setFont(textoSecundario);
        labelDireccion.setBorder(BorderFactory.createEmptyBorder(5,5,5,143));
        panelDireccion.add(labelDireccion);
        fieldDireccion = new JTextField(20);
        fieldDireccion.setBorder(fieldBorder);
        panelDireccion.add(fieldDireccion);
        this.add(panelDireccion);

        JPanel panelTelefono = crearPanelNegro();
        JLabel labelTelefono = new JLabel("Telefono*");
        labelTelefono.setForeground(Color.white);
        labelTelefono.setFont(textoSecundario);
        labelTelefono.setBorder(BorderFactory.createEmptyBorder(5,5,5,147));
        panelTelefono.add(labelTelefono);
        fieldTelefono = new JTextField(20);
        fieldTelefono.setBorder(fieldBorder);
        fieldTelefono.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                String telefono = fieldTelefono.getText().trim();
                if (!telefono.matches("^\\d{9}$")) {
                    JOptionPane.showMessageDialog(null, "El formato de la direccion email " +
                            "no es válida.");
                    fieldDni.requestFocus();
                }
            }
        });
        panelTelefono.add(fieldTelefono);
        this.add(panelTelefono);

        JPanel panelNombre = crearPanelNegro();
        JLabel labelNombre = new JLabel("Nombre*");
        labelNombre.setForeground(Color.white);
        labelNombre.setFont(textoSecundario);
        labelNombre.setBorder(BorderFactory.createEmptyBorder(5,5,5,155));
        panelNombre.add(labelNombre);
        fieldNombre = new JTextField(20);
        fieldNombre.setBorder(fieldBorder);
        panelNombre.add(fieldNombre);
        this.add(panelNombre);

        JPanel panelPrimerApellido = crearPanelNegro();
        JLabel labelPrimerApellido = new JLabel("Primer Apellido*");
        labelPrimerApellido.setForeground(Color.white);
        labelPrimerApellido.setFont(textoSecundario);
        labelPrimerApellido.setBorder(BorderFactory.createEmptyBorder(5,5,5,100));
        panelPrimerApellido.add(labelPrimerApellido);
        fieldPrimerApellido = new JTextField(20);
        fieldPrimerApellido.setBorder(fieldBorder);
        panelPrimerApellido.add(fieldPrimerApellido);
        this.add(panelPrimerApellido);

        JPanel panelSegundoApellido = crearPanelNegro();
        JLabel labelSegundoApellido = new JLabel("Segundo Apellido");
        labelSegundoApellido.setForeground(Color.white);
        labelSegundoApellido.setFont(textoSecundario);
        labelSegundoApellido.setBorder(BorderFactory.createEmptyBorder(5,5,5,90));
        panelSegundoApellido.add(labelSegundoApellido);
        fieldSegundoApellido = new JTextField(20);
        fieldSegundoApellido.setBorder(fieldBorder);
        panelSegundoApellido.add(fieldSegundoApellido);
        this.add(panelSegundoApellido);

        JPanel panelPassword = crearPanelNegro();
        JLabel labelPassword = new JLabel("Password*");
        labelPassword.setForeground(Color.white);
        labelPassword.setFont(textoSecundario);
        labelPassword.setBorder(BorderFactory.createEmptyBorder(5,5,5,143));
        panelPassword.add(labelPassword);
        fieldPasswd = new JPasswordField(20);
        fieldPasswd.setBorder(fieldBorder);
        panelPassword.add(fieldPasswd);
        this.add(panelPassword);

        JPanel panelPasswordConfirm = crearPanelNegro();
        JLabel labelPasswordConfirm = new JLabel("Password*");
        labelPasswordConfirm.setForeground(Color.white);
        labelPasswordConfirm.setFont(textoSecundario);
        labelPasswordConfirm.setBorder(BorderFactory.createEmptyBorder(5,5,5,143));
        panelPasswordConfirm.add(labelPasswordConfirm);
        fieldPasswdConfirm = new JPasswordField(20);
        fieldPasswdConfirm.setBorder(fieldBorder);
        panelPasswordConfirm.add(fieldPasswdConfirm);
        this.add(panelPasswordConfirm);

        JPanel panelSaltoDeLinea3 = crearPanelNegro();
        this.add(panelSaltoDeLinea3);

        JPanel panelBoton = crearPanelNegro();
        JButton botonRegistro = new JButton("Registrarse");
        botonRegistro.setPreferredSize(new Dimension(200, 50));
        botonRegistro.setFont(textoBotones);
        botonRegistro.setBackground(Color.white);
        botonRegistro.setForeground(Color.black);
        panelBoton.add(botonRegistro);
        botonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registro(e);
            }
        });
        this.add(panelBoton);
        
        this.setSize(700, 800);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void registro(ActionEvent e) {
        ConexionDatabase conexionDatabase = new ConexionDatabase();
        IniciarSesion iniciarSesion = new IniciarSesion();

        String dniNuevoUsuario = fieldDni.getText();
        String emailNuevoUsuario = fieldEmail.getText();
        String telefonoNuevoUsuario = fieldTelefono.getText();
        String passwdNuevoUsuario = new String(fieldPasswd.getPassword());
        String passwdNuevoUsuarioConfirm = new String(fieldPasswdConfirm.getPassword());

        if (!passwdNuevoUsuario.equals(passwdNuevoUsuarioConfirm)) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return;
        }

        String passwdNuevoUsuarioEncriptada = EncriptarPassword.getHash(passwdNuevoUsuario);

        try (Connection connection = conexionDatabase.connect()) {
            String buscarDni = "SELECT id FROM usuarios WHERE dni = ?";
            String buscarEmail = "SELECT id FROM usuarios WHERE email = ?";
            String buscarTelefono = "SELECT id FROM usuarios WHERE telefono = ?";
            PreparedStatement buscarDniPs = connection.prepareStatement(buscarDni);
            PreparedStatement buscarEmailPs = connection.prepareStatement(buscarEmail);
            PreparedStatement buscarTelefonoPs = connection.prepareStatement(buscarTelefono);
            buscarDniPs.setString(1, dniNuevoUsuario);
            buscarEmailPs.setString(1, emailNuevoUsuario);
            buscarTelefonoPs.setString(1, telefonoNuevoUsuario);
            ResultSet buscarDniRs = buscarDniPs.executeQuery();
            ResultSet buscarEmailRs = buscarEmailPs.executeQuery();
            ResultSet buscarTelefonoRs = buscarTelefonoPs.executeQuery();

            if (buscarDniRs.next()) {
                JOptionPane.showMessageDialog(null, "Error, el DNI introducido ya está en " +
                        "la base de datos");
            } else if (buscarEmailRs.next()) {
                JOptionPane.showMessageDialog(null, "Error, el email introducido ya está en " +
                        "la base de datos");
            } else if (buscarTelefonoRs.next()) {
                JOptionPane.showMessageDialog(null, "Error, el teléfono introducido ya está " +
                        "en la base de datos");
            } else {
                String introducirUsuario = "INSERT INTO usuarios (dni, nombre, primerapellido, segundoapellido, " +
                        "contrasenya, email, direccion, telefono) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatementInsert = connection.prepareStatement(introducirUsuario);
                preparedStatementInsert.setString(1, dniNuevoUsuario);
                preparedStatementInsert.setString(2, fieldNombre.getText());
                preparedStatementInsert.setString(3, fieldPrimerApellido.getText());
                preparedStatementInsert.setString(4, fieldSegundoApellido.getText());
                preparedStatementInsert.setString(5, passwdNuevoUsuarioEncriptada);
                preparedStatementInsert.setString(6, emailNuevoUsuario);
                preparedStatementInsert.setString(7, fieldDireccion.getText());
                preparedStatementInsert.setString(8, telefonoNuevoUsuario);
                preparedStatementInsert.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
                this.setVisible(false);
                iniciarSesion.setVisible(true);
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}