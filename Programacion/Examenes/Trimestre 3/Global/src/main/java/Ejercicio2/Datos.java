package Ejercicio2;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Datos {
    private List<Estudios> datos = new ArrayList<>();

    public Datos() {
    }

    public Datos(List<Estudios> datos) {
        this.datos = datos;
    }

    public List<Estudios> getDatos() {
        return datos;
    }

    public void setDatos(Estudios estudios) {
        datos.add(estudios);
    }

    @Override
    public String toString() {
        return "Datos{" +
                "datos=" + datos +
                '}';
    }
}