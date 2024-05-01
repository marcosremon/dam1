package EjerciciosPOO_Bloque_01.ejercicio3;

public class Alumno {
    String nombre;
    double nota;

    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String calificacion() {
        if (this.nota >= 5) {
            return "el alumno " + this.nombre + " aprobo";
        } else return "el alumno " + this.nombre + " no aprobo";
    }
    public String mostrarInfo() {
        return "Alumno: {" +
                "nombre = '" + nombre + '\'' +
                "nota = " + nota +
                '}';
    }
    @Override
    public String toString(){
        return mostrarInfo();
    }
}
