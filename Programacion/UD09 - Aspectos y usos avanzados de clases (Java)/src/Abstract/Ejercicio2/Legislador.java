package Abstract.Ejercicio2;

public abstract class Legislador extends Persona {
    String provinciaQueRepresenta;
    String partidoPolitico;
    public abstract String getCamaraEnLaQueTrabaja();

    public String getProvinciaQueRepresenta() {
        return provinciaQueRepresenta;
    }
    public void setProvinciaQueRepresenta(String provinciaQueRepresenta) {
        this.provinciaQueRepresenta = provinciaQueRepresenta;
    }
    public String getPartidoPolitico() {
        return partidoPolitico;
    }
    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }
    @Override
    public String toString() {
        return "Legislador" +
                "provinciaQueRepresenta='" + provinciaQueRepresenta + '\'' +
                ",partidoPolitico='" + partidoPolitico + '\'' +
                ",nombre='" + nombre + '\'' +
                ",dni='" + dni + '\'';
    }
}