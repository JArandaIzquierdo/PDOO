package napakalaki;

/**
 *
 * @author Javier Aranda Izquierdo
 */
public class Monster {
    // Atributos privados
    private String name;
    private int combatLevel;
    private BadConsequence badConsequnece;
    private Prize prize;
    
    //Constructor
    Monster(String n, int l, BadConsequence b, Prize p){
        name=n;
        combatLevel=l;
        badConsequnece=b;
        prize=p;
    }
        
    //Consultores
    public String getName(){  //Consultor de Name
        return name;
    }
    
    public int getCombatLevel(){  //Consultor de CombatLevel
        return combatLevel;
    }
    
    public BadConsequence getBadConsequence(){  //Consultor de BadConsequence
        return badConsequnece;
    }
    
    public int getLevelsGained(){
        return 0;
    }
    
    public int getTreasuresGained(){
        return 0;
    }
    
    // Método toString
    @Override   //Estamos sobreescibribiendo un método padre de Java
    public String toString(){
        return " Name = " + name + ". Levels = " + Integer.toString(combatLevel);
    }
    
    
}
