/* Clase Prize lo utilizaremos para el premio de los monstruos*/

package napakalaki;

/**
 *
 * @author Javier Aranda Izquierdo
 */
public class Prize {
    // Atributos privados
    private int treasures;
    private int levels;
    
    // Constructor y métodos públicos
    public Prize(int t, int l){ 
        treasures=t;    
        levels=l;
    }
    
    
    // Consultores
    public int getTreasures(){  
        return treasures;
    }
    
    public int getLevels(){  //Consultor de Level
        return levels;
    }
    
    // Método toString
    @Override   //Estamos sobreescibribiendo un método padre de Java
    public String toString(){
        return " Levels = " + Integer.toString(levels) + ". Treasures = " + Integer.toString(treasures);
    }
}
