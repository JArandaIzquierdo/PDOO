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
    
    //Constructor
    Monster(String name, int level, BadConsequence bc, Prize price){
        setName(name);
        setCombatLevel(level);
        setBadConsequence(bc);
        setPrize(price);
    }
    
    // Modificadores
    private void setName(String name_1){
        name = name_1;
    }
    
    private void setCombatLevel(int combat_level){
        combatLevel = combat_level;
    }
    
    private void setBadConsequence(BadConsequence Bad_c){
        bc = Bad_c;
    }
    
    private void setPrize(Prize price_1){
        price = price_1;
    }
    
    //Consultores
    public String getName(){  //Consultor de Name
        return name;
    }
    
    public int getCombatLevel(){  //Consultor de CombatLevel
        return combatLevel;
    }
    
    
}
