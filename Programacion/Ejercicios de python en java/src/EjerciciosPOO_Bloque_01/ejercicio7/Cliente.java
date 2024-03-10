package EjerciciosPOO_Bloque_01.ejercicio7;

public class Cliente {
    String nombre;
    double cantidad;

    public Cliente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double extraerDinero(double retirada) {
        return this.cantidad - retirada;
    }
    public double depositarDinero(double ingreso) {
        return this.cantidad + ingreso;
    }
    @Override
    public String toString() {
        return "Clientes: {" +
                "nombre = '" + nombre + '\'' +
                "cantidad = " + cantidad +
                '}';
    }
}
