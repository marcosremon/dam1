package EjerciciosPOO_Bloque_01.ejercicio6;

public class main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contacto contacto1 = new Contacto("jose", "123456789", "maamsita@gmail.com");
        agenda.anyadirContacto(contacto1);
        agenda.listaDeContactos();
        System.out.println(agenda.buscarContacto("jose"));
        agenda.editarContacto("jose", "josejuan");
        System.out.println(agenda.buscarContacto("josejuan"));
        agenda.listaDeContactos();
        agenda.cerrarAgenda();
    }
}
