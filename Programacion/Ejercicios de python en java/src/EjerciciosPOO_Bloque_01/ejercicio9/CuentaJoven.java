package EjerciciosPOO_Bloque_01.ejercicio9;

public class CuentaJoven extends Cuenta {
    double bonificacion;
    int edad;

    public CuentaJoven(String titular, double cantidad, double bonificacion, int edad) {
        super(titular, cantidad);
        this.bonificacion = bonificacion;
        this.edad = edad;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean esTitularValido() {
        if (edad > 18 && edad < 25) {
            return true;
        } return false;
    }

    @Override
    public double retirarDinero(double cantidad) {
        if (esTitularValido()) {
            super.retirarDinero(cantidad);
        }
        return cantidad;
    }

    @Override
    public String toString() {
        return "CuentaJoven: {" +
                "bonificacion = " + bonificacion +
                "edad = " + edad +
                "titular = '" + titular + '\'' +
                "cantidad = " + cantidad +
                '}';
    }
}