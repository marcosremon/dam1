package parcial1.Animales;

import java.util.Random;

public class Gato {
    boolean sexo; //true --> male, false --> female
    public Gato() {
    }
    public Gato(boolean sexo) {
        this.sexo = sexo;
    }


    public boolean isSexo() {
        return sexo;
    }
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }
    public void mostrarInfo() {
        System.out.println( "Gato: {" +
                "sexo = " + sexo +
                '}');
    }

    public void apareamiento(Gato gato) throws losGaysNoFollan {
        Random random = new Random();
        boolean sexoAleatorio = random.nextBoolean();
        if (this.sexo != gato.isSexo()) {
            Gato gatete = new Gato(sexoAleatorio);
            System.out.println("el nuevo gatete es:");
            gatete.mostrarInfo();
        } else {
            throw new losGaysNoFollan("los gays no se reproducen");
        }
    }
}