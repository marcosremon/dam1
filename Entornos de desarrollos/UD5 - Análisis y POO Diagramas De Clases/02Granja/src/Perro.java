/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class Perro extends Animal{
    private String numeroChip = "884324";
    public void hazRuido() {
        System.out.println("GUAU");
    }
    public void muestraChip() {
        System.out.println("Chip n " + numeroChip);
    }
    
    
    
}
