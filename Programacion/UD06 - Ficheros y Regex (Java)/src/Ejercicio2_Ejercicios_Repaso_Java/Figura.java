package Ejercicio2_Ejercicios_Repaso_Java;

class Figura {
    String nombre;
    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double area() {
        return 0;
    }
    public double perimetro() {
        return 0;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void mostrarInfo(){
        System.out.print("el nombre de la figura es " + this.nombre);
    }
}




