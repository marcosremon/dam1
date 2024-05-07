
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrador
 */
public class Principal {

    public static void main(String[] args) {

        Lechon c1 = new Lechon();
        Gallina g1 = new Gallina();
        Vaca v1 = new Vaca();
        Vaca v2 = new Vaca();
        Perro p = new Perro();
        Perro p2 = new Perro();
        ArrayList<Animal> miGranja = new ArrayList();

        miGranja.add(c1);
        miGranja.add(g1);
        miGranja.add(v1);
        miGranja.add(v2);
        miGranja.add(p);
        miGranja.add(p2);

        for (Animal a : miGranja) {
            a.hazRuido();
        }
        System.out.println("chips");
        // mostrar chips perros
        for (Animal a : miGranja) {
            if (a.getClass() == Perro.class) {
                //a.muestraChip();
                Perro miPerro = (Perro) a;
                miPerro.muestraChip();
                Animal miAnimal = miPerro;
                miAnimal.hazRuido();
            }

        }

        for (Animal a : miGranja) {

            a.hazRuido();
        }

    }

    /*
        Animal a = new Animal();
        Animal b = new Gallina();
        a.hazRuido();
        b.hazRuido();
        
        //b = a;
        b.hazRuido();
        
        Gallina g = (Gallina) a;        
        g.hazRuido();
        g.hazCo();
        
        Gallina g2 = new Gallina();
        Animal a2 = g2;
     */
}
