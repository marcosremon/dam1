package global.ejercicio6;

public class app {
    public static void main(String[] args) {
        Leon leon = new Leon("mamadu");
        Conejo conejo = new Conejo("paco");
        leon.comunicarse();
        System.out.println(leon.dieta());
        conejo.comunicarse();
        System.out.println(conejo.dieta());
    }
}
