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
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        BadConsequence badConsequence;
        Prize prize;
        ArrayList<Monster> monstruos = new ArrayList();
        
        // Creación Monstruo "La que redacta en las tinieblas"
        badConsequence= new BadConsequence("Toses los pulmones y pierdes 2 niveles.",
        2, 0, 0);
        prize= new Prize(1,1);
        monstruos.add(new Monster("La que redacta en las tinieblas", 2, badConsequence, prize));
        
        // Creación Monstruo "El gorrón en el umbral"
        badConsequence= new BadConsequence("Pierdes todos tus tesoros visibles",
        0, 100, 0);
        prize= new Prize(3,1);
        monstruos.add(new Monster("El gorrón en el umbral", 10, badConsequence, prize));
        
        // Creación Monstruo "3 Byakhees de bonanza"
        badConsequence= new BadConsequence("Pierdes tu armadura visible y otra oculta.", 0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)), new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        prize= new Prize(2,1);
        monstruos.add(new Monster("3 Byakhees de bonanza", 10, badConsequence, prize));
        
        /*
        //////////////////////////////////////////////////
        */
        // Consulta Monstruos con nivel igual o superior a 10
        System.out.println("Monstruos con nivel igual o superior a 10");
        for(Monster m: monstruos){
            if(m.getCombatLevel()>9){
                System.out.println(m.toString());
            }
          
        }
        // Consulta Monstruos que tengan un mal rollo que implique sólo pérdida de niveles.
        System.out.println("Monstruos que tengan un mal rollo que implique sólo pérdida de niveles.");
        for(Monster m: monstruos){
            if(m.badConsequence.getxd){
                System.out.println(m.toString());
            }
          
        }
        
    }
    
}
