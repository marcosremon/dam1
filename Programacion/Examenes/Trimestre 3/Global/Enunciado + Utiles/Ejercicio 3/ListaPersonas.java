package org.iesch;
import java.util.ArrayList;

/*
 * Clase gestión de lista de Personas
 */
/**
 *
 * @author admin 
 */
public class ListaPersonas {

    private ArrayList<Persona> lista;

    public ListaPersonas() {
        lista = new ArrayList();
    }

    public void anadirPersona(Persona p) {
        lista.add(p);
    }

    public void mostrarPersonas() {
        int i = 0;
        for (Persona p : lista) {
            System.out.println(i + "-" + p);
            i++;
        }

    }

    public int numeroPersonas() {
        return (lista.size());
    }

    public void mostrarPersonasNombre(String nombre) {
        for (Persona p : lista) {
            if (p.getNombre().equals(nombre)) {
                System.out.println(p);
            }
        }
    }

    public Persona personaPosicionI(int i) {
        return (lista.get(i));
    }

    public Persona buscarPersonaDNI(String dni) {
        Persona resultado = null;
        for (Persona p : lista) {
            if (p.getDNI().equals(dni)) {
                resultado = p;
            }
        }
        return resultado;
    }

}
