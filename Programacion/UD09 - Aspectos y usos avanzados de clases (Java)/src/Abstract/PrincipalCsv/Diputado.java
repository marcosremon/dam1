package Abstract.PrincipalCsv;

public class Diputado {
    String nombre;
    String grupo;
    String lista;
    String provincia;
    String fechaAlta;
    String fechaBaja;

    public Diputado(String nombre, String grupo, String lista, String provincia, String fechaAlta, String fechaBaja) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.lista = lista;
        this.provincia = provincia;
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getLista() {
        return lista;
    }

    public void setLista(String lista) {
        this.lista = lista;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    @Override
    public String toString() {
        return "Diputado{" +
                "nombre='" + nombre + '\'' +
                ", grupo='" + grupo + '\'' +
                ", lista='" + lista + '\'' +
                ", provincia='" + provincia + '\'' +
                ", fechaAlta='" + fechaAlta + '\'' +
                ", fechaBaja='" + fechaBaja + '\'' +
                '}';
    }
}