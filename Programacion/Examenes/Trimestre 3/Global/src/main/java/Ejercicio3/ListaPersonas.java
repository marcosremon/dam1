package Ejercicio3;
import Metodos.ConexionDataBaseEjercicio3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Clase gestión de lista de Personas
 */
/**
 *
 * @author admin 
 */
public class ListaPersonas {

    private ArrayList<Persona> lista;

    public ListaPersonas() {
        lista = new ArrayList();
    }

    public void anadirPersona(Persona p) {
        lista.add(p);
    }

    public void mostrarPersonas() {
        ConexionDataBaseEjercicio3 conexionDataBaseEjercicio3 = new ConexionDataBaseEjercicio3();
        Persona cliente = new Persona();

        try (Connection connection = conexionDataBaseEjercicio3.connect()) {
            String listarClientes = "select * from clientes";
            PreparedStatement listarClientesPs = connection.prepareStatement(listarClientes);
            ResultSet listarClientesRs = listarClientesPs.executeQuery();

            while (listarClientesRs.next()) {
                String dni = listarClientesRs.getString(1);
                String nombre = listarClientesRs.getString(2);
                String apellidos = listarClientesRs.getString(3);

                lista.add(cliente = new Persona(dni, nombre, apellidos));
                System.out.println(cliente);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public int numeroPersonas() {
        return (lista.size());
    }

    public void mostrarPersonasNombre(String nombre) {
        for (Persona p : lista) {
            if (p.getNombre().equals(nombre)) {
                System.out.println(p);
            }
        }
    }

    public Persona personaPosicionI(int i) {
        return (lista.get(i));
    }

    public Persona buscarPersonaDNI(String dni) {
        Persona resultado = null;
        for (Persona p : lista) {
            if (p.getDNI().equals(dni)) {
                resultado = p;
            }
        }
        return resultado;
    }


}
