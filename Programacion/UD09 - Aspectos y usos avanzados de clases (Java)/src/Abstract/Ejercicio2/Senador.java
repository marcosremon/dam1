package Abstract.Ejercicio2;

public class Senador extends Legislador {
    @Override
    public String getCamaraEnLaQueTrabaja() {
        return "yo no aparezco ni por el senado";
    }
    @Override
    public String toString() {
        return "Senador{" +
                "provinciaQueRepresenta='" + provinciaQueRepresenta + '\'' +
                ", partidoPolitico='" + partidoPolitico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}