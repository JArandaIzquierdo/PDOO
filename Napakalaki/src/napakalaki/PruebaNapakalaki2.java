/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JaviAir
 */
public class PruebaNapakalaki2 {
    
    /**
     * @param args the command line arguments
     */
    
     // Declaracion de variables
        static BadConsequence badConsequence; //Variable para el mal rollo 
        static Prize prize; // Premio 
    
    
    public static void main(String[] args) {
        //asnfoadfn
        
        // Array para los monstruos
        ArrayList<Monster> monstruos = new ArrayList();
        
        
        /* Creacion de los monstruos */
        
        // Creacion de "El rey de rosa"
        
        //Mal rollo 
        badConsequence = new BadConsequence ("Pierder 5 niveles y tres tesoros visibles",5,3,0);
        
        //Premio
        prize= new Prize (4,2);
        
        //Añadimos el monstruo
        monstruos.add(new Monster("El rey de rosa",13,badConsequence,prize));
        
        //Creacion "Angeles de la noche ibicenca"
        
        //Mal rollo
        badConsequence = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer en mitad del vuelo. Descarta una "
                + "mano visible y una mano oculta", 0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)), 
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
         //Premio
        prize = new Prize(4, 1);
        
        //Añadimos el monstruo
        monstruos.add(new Monster("Angel de la noche ibicenca",14,badConsequence,prize));
        
        
    
    }
}
