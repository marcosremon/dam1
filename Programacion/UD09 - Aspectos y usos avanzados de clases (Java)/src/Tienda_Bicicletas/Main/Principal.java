package Tienda_Bicicletas.Main;

import Tienda_Bicicletas.Clase.BiciMontanya;
import Tienda_Bicicletas.Clase.BiciPaseo;
import Tienda_Bicicletas.Abstract_Class.Bicicleta;
import Tienda_Bicicletas.Clase.Tandem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        BiciPaseo biciPaseo1 = new BiciPaseo("paseos", "rosa", 1000,35);
        BiciMontanya biciMontanya1 = new BiciMontanya("montaña","marron", 500,-3);
        BiciMontanya biciMontanya2 = new BiciMontanya("montaña","azul", 600,5);
        Tandem tandem1 = new Tandem("tandem","rosa",456,6);
        Tandem tandem2 = new Tandem("tandem","morado",555,2);
        List<Bicicleta> bicicletas = new ArrayList<>(Arrays.asList(biciMontanya1, biciMontanya2, biciPaseo1,
                tandem1, tandem2));

        for (Bicicleta bicicleta : bicicletas) {
            System.out.println("---------------------------");
            if (bicicleta == biciMontanya1){
                bicicleta.mostrarInfo();
                biciMontanya1.aumentarMarcha();
                biciMontanya1.aumentarMarcha();
                biciMontanya1.aumentarMarcha();
                bicicleta.mostrarInfo();
            } else if (bicicleta == biciMontanya2) {
                bicicleta.mostrarInfo();
                biciMontanya2.pintar("peru");
                bicicleta.mostrarInfo();
            } else bicicleta.mostrarInfo();
        }
    }
}
