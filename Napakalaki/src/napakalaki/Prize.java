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
public class Prize {
    // Atributos privados
    private int treasures;
    private int level;
    
    // Constructor y métodos públicos
    public Prize(int treasures, int level){ //Clase Premio
        setTreasures(treasures);    
        setLevel(level);
    }
    
    // Modificadores
    private void setTreasures(int tr){   //Modificador de Treasures
        treasures = tr;
    }
    
    private void setLevel(int lv){   //Modificador de Level
        level = lv;
    }
    
    // Consultores
    public int getTreasure(){   //Consultor de Treasures
        return treasures;
    }
    
    public int getLevel(){  //Consultor de Level
        return level;
    }
    
    // Método toString
    @Override   //Estamos sobreescibribiendo un método padre de Java
    public String toString(){
        return " levels = " + Integer.toString(level) + " Treasures = " + Integer.toString(treasures);
    }
}
