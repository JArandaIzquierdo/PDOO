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
public class Treasure {
    private String name;
    private int bonus;
    private int gold_coins;
    private TreasureKind treasure;
    
    
    Treasure(String n, int g, int bonus1, TreasureKind t){
        name=n;
        bonus=bonus1;
        gold_coins=g;
        treasure=t;
    }
    
    
    
    private String getName(){
        return name;
    }
    
    private int getBonus(){
        return bonus;
    }
    private TreasureKind getType(){
        return treasure;
    }
}
