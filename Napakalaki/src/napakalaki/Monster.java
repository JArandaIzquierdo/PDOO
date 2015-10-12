/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author carlos
 */
public class Monster {
    // Atributos privados
    private String name;
    private int combatLevel;
    private BadConsequence bc;
    private Prize price;
    
    //Consultores
    public String getName(){  //Consultor de Name
        return name;
    }
    
    public int getCombatLevel(){  //Consultor de CombatLevel
        return combatLevel;
    }
    
    //Constructor
    Monster(String name, int level, BadConsequence bc, Prize price){
        // NO SE COMO RELLENAR
    }
}
