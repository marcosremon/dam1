package Ejercicio3;
import Metodos.ConexionDataBaseEjercicio3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        ConexionDataBaseEjercicio3 conexionDataBaseEjercicio3 = new ConexionDataBaseEjercicio3();
        ListaProductos listaProductos = new ListaProductos();
        Carro carro = new Carro();
        Producto producto = new Producto();
        Persona persona = new Persona();

        try (Connection connection = conexionDataBaseEjercicio3.connect()) {
            String datosCarros = "select distinct(idCliente) from carros";
            PreparedStatement preparedStatement = connection.prepareStatement(datosCarros);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString(1);

                String datosCliente = "select * from clientes where dni = ?";
                PreparedStatement preparedStatement1 = connection.prepareStatement(datosCliente);
                preparedStatement1.setString(1, id);
                ResultSet resultSet1 = preparedStatement1.executeQuery();
                if (resultSet1.next()) {
                    persona.setDNI(resultSet1.getString(1));
                    persona.setNombre(resultSet1.getString(2));
                    persona.setApellidos(resultSet1.getString(3));
                };
                carro.setCliente(persona);

                String productosCliente = "select idProducto from carros where idCliente = ?";
                PreparedStatement preparedStatement2 = connection.prepareStatement(productosCliente);
                preparedStatement2.setString(1, id);
                ResultSet resultSet2 = preparedStatement2.executeQuery();

                while (resultSet2.next()) {
                    String productoId = resultSet2.getString(1);
                    String infoProducto = "select * from productos where codigo = ?";
                    PreparedStatement preparedStatement3 = connection.prepareStatement(infoProducto);
                    preparedStatement3.setString(1, productoId);
                    ResultSet resultSet3 = preparedStatement3.executeQuery();
                    if (resultSet3.next()) {
                        producto.setCodigo(resultSet3.getString(1));
                        producto.setNombre(resultSet3.getString(2));
                        producto.setDescripcion(resultSet3.getString(3));
                        producto.setMarca(resultSet3.getString(4));
                        producto.setPrecio(resultSet3.getDouble(5));
                    }
                    listaProductos.anadirProducto(producto);
                }
                carro.setProductos(listaProductos);
                System.out.println(carro);
            }
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
