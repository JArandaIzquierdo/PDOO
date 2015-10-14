/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author JaviAir
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println ("Empezamos la ejecución del programa");
        
        //Declaramos la clase Prize
        Prize buen_rollo = new Prize(3,8);
        //Declaramos la clase BadConsequence
        BadConsequence mal_rollo = new BadConsequence("Prueba de texto de mal rollo", 1, 2, 3);
        //Declaramos la clase Monstruo
        Monster monstruo = new Monster("Frankenstein", 1,mal_rollo,buen_rollo);
        
        //Utilizamos los métodos toString
        System.out.println("Clase Prize: ");
        System.out.println(buen_rollo.toString());
        System.out.println("Clase BadConsequence: ");
        System.out.println(mal_rollo.toString());
        System.out.println("Clase Monstruo: ");
        System.out.println(monstruo.toString());
    }
    
}
