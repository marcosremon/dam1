package EjerciciosPOO_Bloque_01.ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {
    static List<Contacto> contactos = new ArrayList<>();
    boolean estado = true;

    public Agenda() {
    }
    public boolean estado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void anyadirContacto(Contacto contacto) {
        contactos.add(contacto);
    }
    public void listaDeContactos(){
        for (Contacto i : contactos) {
            System.out.println(i);
        }
    }
    public Contacto buscarContacto(String aBuscar) {
        for (Contacto i : contactos) {
            if (i.getNombre().equals(aBuscar)) {
                return i;
            }
            if (i.getTelefono().equals(aBuscar)) {
                return i;
            }
            if (i.getEmail().equals(aBuscar)) {
                return i;
            }
        }
        return null;
    }
    public void editarContacto(String aBuscar, String cambio) {
        Scanner scanner = new Scanner(System.in);
        Contacto cambiar = buscarContacto(aBuscar);
        System.out.println("Nombre, Telefono o Mail: ");
        while (true) {
            switch (scanner.nextLine().toLowerCase()) {
                case "nombre" -> {
                    cambiar.setNombre(cambio);
                    return;
                }
                case "telefono" -> {
                    cambiar.setTelefono(cambio);
                    return;
                }
                case "email" -> {
                    cambiar.setEmail(cambio);
                    return;
                }
                default -> System.out.print("Opcion incorrecta, vuelve a introducir el argumento: ");
            }
        }
    }
    public void cerrarAgenda(){
        if (this.estado){
            this.estado = false;
            System.out.println("se cerro la agenda");
        } else System.out.println("la agenda ya estaba cerrada");
    }
}
