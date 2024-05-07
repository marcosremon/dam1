package Abstract.Ejercicio2;

public class Diputado extends Legislador {
    @Override
    public String getCamaraEnLaQueTrabaja() {
        return "soy un ladron y mi sede es el congreso";
    }
    @Override
    public String toString() {
        return "Diputado{" +
                "provinciaQueRepresenta='" + provinciaQueRepresenta + '\'' +
                ", partidoPolitico='" + partidoPolitico + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}