package napakalaki;

/**
 *
 * @author Javier Aranda
 */
public class Monster {
    
    //Attrb
    private String name;
    private int combatLevel;
    private BadConsequence badConsequence;
    private Prize prize;
    
    //Constrc
    public Monster(String name, int level, BadConsequence bc, Prize prize){
        this.name=name;
        combatLevel=level;
        badConsequence=bc;
        this.prize=prize;
    }
    
    public String getName(){
        return name;
    }
    
    public int getCombatLevel(){
        return combatLevel;
    }
    
    public BadConsequence getBadConsequence(){
        return badConsequence;
    }
    
    public Prize getPrize(){
        return prize;
    }
    
    public String toString(){
        return "Nombre = " + (name) + ", Nivel de combate = " + Integer.toString(combatLevel);
    }
    
}
