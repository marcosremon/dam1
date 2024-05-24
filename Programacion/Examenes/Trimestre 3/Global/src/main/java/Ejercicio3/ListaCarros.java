package Ejercicio3;
import Metodos.ConexionDataBaseEjercicio3;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class ListaCarros {

    private ArrayList<Carro> lista;

    public ListaCarros() {
        lista = new ArrayList();
    }

    public void anadirCarro(Carro p) {
        lista.add(p);
    }

    public void mostrarCarrosPrecio() {
        int i = 0;
        for (Carro c : lista) {
            System.out.println("" + i + " - " + "Cliente: " + c.getCliente() + " Precio: " +  c.precioCarro());
        }
    }
    
    public void mostrarCarros() {
        ConexionDataBaseEjercicio3 conexionDataBase = new ConexionDataBaseEjercicio3();
        try (Connection connection = conexionDataBase.connect()) {
            String mostrarCarros = "";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public int numeroCarros() {
        return (lista.size());
    }

    
  public ArrayList<Carro> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Carro> lista) {
        this.lista = lista;
    }


}
