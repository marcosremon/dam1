package Abstract.Ejercicio3;

public class Senador extends Legislador {
    @Override
    public String getCamaraEnLaQueTrabaja() {
        return "yo no aparezco ni por el senado";
    }
    @Override
    public String toString() {
        return "Senador:\n" +
                super.getNombre() + '\n' +
                super.getDni() + '\n' +
                super.getPartidoPolitico() + nombre + '\n' +
                super.getProvinciaQueRepresenta() + dni + '\n' ;
    }
}