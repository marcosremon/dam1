package InterfacesGraficas;

import Metodos.ConexionDatabase;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdministrarCuentas extends JFrame {
    private int idUsuario;
    private Font titulosVisualizarCuentas = new Font("Arial", Font.BOLD, 35);
    private Font textoDefault = new Font("Arial", Font.BOLD, 13);
    private Font textoSecundario = new Font("Arial", Font.BOLD, 13);
    private Font textoBotones = new Font("Arial", Font.BOLD, 20);
    private Border fieldBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
    private JList<String> cuentasList;
    private DefaultListModel<String> cuentasListModel;
    private JPanel crearPanelNegro() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.black);
        return panel;
    }

    public AdministrarCuentas(int idUsuario) {
        this.idUsuario = idUsuario;
        getContentPane().setBackground(Color.black);
        this.setTitle("Cuentas Existentes");
        this.setLayout(new BorderLayout());

        JPanel panelCuentasExistentes = crearPanelNegro();
        panelCuentasExistentes.setLayout(new GridLayout());
        JLabel labelCuentasExistentes = new JLabel("Cuentas Existentes", SwingConstants.CENTER);
        labelCuentasExistentes.setBorder(BorderFactory.createEmptyBorder(25, 0, 0, 0));
        labelCuentasExistentes.setForeground(Color.white);
        labelCuentasExistentes.setFont(titulosVisualizarCuentas);
        panelCuentasExistentes.add(labelCuentasExistentes);
        this.add(panelCuentasExistentes, BorderLayout.NORTH);

        cuentasListModel = new DefaultListModel<>();
        cuentasList = new JList<>(cuentasListModel);
        cuentasList.setFont(textoDefault);
        cuentasList.setForeground(Color.white);
        cuentasList.setBackground(Color.black);
        cuentasList.setBorder(new CompoundBorder(cuentasList.getBorder(),
                new EmptyBorder(0, 0, 0, 45)));

        JScrollPane scrollPanel = new JScrollPane(cuentasList);
        scrollPanel.getViewport().setBackground(Color.black);
        scrollPanel.setBorder(null);

        JPanel panelScroll = new JPanel(new BorderLayout());
        panelScroll.setBackground(Color.black);
        panelScroll.setBorder(BorderFactory.createEmptyBorder(30, 45, 10, 10));
        panelScroll.add(scrollPanel);
        this.add(panelScroll, BorderLayout.CENTER);

        mostrarCuentas();

        JPanel panelBoton = crearPanelNegro();
        panelBoton.setLayout(new GridLayout(1, 3));

        JButton botonSeleccionarCuenta = new JButton("Seleccionar Cuenta");
        botonSeleccionarCuenta.setFont(textoBotones);
        botonSeleccionarCuenta.setBackground(Color.white);
        botonSeleccionarCuenta.setForeground(Color.black);
        botonSeleccionarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cuentaSelecionada(e);
            }
        });
        panelBoton.add(botonSeleccionarCuenta);

        JButton borrarCuenta = new JButton("Borrar Cuenta");
        borrarCuenta.setFont(textoBotones);
        borrarCuenta.setBackground(Color.white);
        borrarCuenta.setForeground(Color.black);
        borrarCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrarCuetna(e);
            }
        });
        panelBoton.add(borrarCuenta);

        JButton AnyadirOtraCuetna = new JButton("Añadir Otra Cuenta");
        AnyadirOtraCuetna.setFont(textoBotones);
        AnyadirOtraCuetna.setBackground(Color.white);
        AnyadirOtraCuetna.setForeground(Color.black);
        AnyadirOtraCuetna.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AnyadirCuentas anyadirCuentas = new AnyadirCuentas(idUsuario);
                anyadirCuentas.setVisible(true);
                AdministrarCuentas.this.setVisible(false);
            }
        });
        panelBoton.add(AnyadirOtraCuetna);

        this.add(panelBoton, BorderLayout.SOUTH);

        this.setSize(900, 500);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void mostrarCuentas() {
        ConexionDatabase conexionDatabase = new ConexionDatabase();
        try (Connection connection = conexionDatabase.connect()) {

            String nombreUsuario = "select nombre from usuarios where id = ?";
            PreparedStatement nombreUsuarioPs = connection.prepareStatement(nombreUsuario);
            nombreUsuarioPs.setInt(1, idUsuario);
            ResultSet nombreUsuarioRs = nombreUsuarioPs.executeQuery();

            String dniUsuario = "select dni from usuarios where id = ?";
            PreparedStatement dniUsuarioPs = connection.prepareStatement(dniUsuario);
            dniUsuarioPs.setInt(1, idUsuario);
            ResultSet dniUsuarioRs = dniUsuarioPs.executeQuery();

            if (dniUsuarioRs.next() && nombreUsuarioRs.next()) {
                String usuario = nombreUsuarioRs.getString("nombre");
                String dni = dniUsuarioRs.getString("dni");

                String obtenerCuentas = "select * from cuentas where id_usuario = ?";
                PreparedStatement obtenerCuentasPs = connection.prepareStatement(obtenerCuentas);
                obtenerCuentasPs.setInt(1, idUsuario);
                ResultSet obtenerCuentasRs = obtenerCuentasPs.executeQuery();

                while (obtenerCuentasRs.next()) {
                    String nombreBanco = obtenerCuentasRs.getString("nombreBanco");
                    String tipoCuenta = obtenerCuentasRs.getString("tipoCuenta");
                    cuentasListModel.addElement("El usuario: " + usuario + " con dni: " + dni + "\nesta asociado " +
                            "a una cuenta de tipo " + tipoCuenta + " la cual pertenece a " + nombreBanco);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar las cuentas.");
        }
    }

    private void cuentaSelecionada(ActionEvent e) {
        String cuentaSeleccionada = cuentasList.getSelectedValue().toLowerCase();
        if (cuentaSeleccionada != null) {
            JOptionPane.showMessageDialog(null, cuentaSeleccionada);

            boolean contieneCuentaCorriente = cuentaSeleccionada.contains("cuenta corriente");
            boolean contieneCuentaAhorro = cuentaSeleccionada.contains("cuenta de ahorro");

            if (contieneCuentaCorriente) {
                CuentaCorriente cuentaCorriente = new CuentaCorriente();
                cuentaCorriente.setVisible(true);
                this.setVisible(false);
            } else if (contieneCuentaAhorro) {
                CuentaAhorros cuentaAhorros = new CuentaAhorros();
                cuentaAhorros.setVisible(true);
                this.setVisible(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, seleccione una cuenta");
        }
    }

    private void borrarCuetna(ActionEvent e) {
        
    }
}