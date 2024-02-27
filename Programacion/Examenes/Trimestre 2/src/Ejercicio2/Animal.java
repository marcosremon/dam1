package Ejercicio2;

public class Animal {
    String sexo;

    public Animal(String sexo) {
        this.sexo = sexo;
    }
    public Animal() {
        this.sexo = "macho";
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
