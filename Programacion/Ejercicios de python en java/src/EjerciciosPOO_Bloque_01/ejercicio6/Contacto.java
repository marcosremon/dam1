package EjerciciosPOO_Bloque_01.ejercicio6;

public class Contacto {
    String nombre;
    String telefono;
    String email;

    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "su nombre es: '" + this.getNombre() + "' su telefono es: '" +  this.getTelefono() +
                "' y su email es '" + this.getEmail() + "'";
    }
}
