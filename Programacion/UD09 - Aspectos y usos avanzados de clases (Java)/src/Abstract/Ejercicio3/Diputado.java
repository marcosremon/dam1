package Abstract.Ejercicio3;

public class Diputado extends Legislador {
    @Override
    public String getCamaraEnLaQueTrabaja() {
        return "soy un ladron y mi sede es el congreso";
    }
    @Override
    public String toString() {
        return "Diputado:\n" +
                super.getNombre() + '\n' +
                super.getDni() + '\n' +
                super.getPartidoPolitico() + nombre + '\n' +
                super.getProvinciaQueRepresenta() + dni + '\n' ;
    }
}