package napakalaki;

/**
 *
 * @author Javier Aranda
 */
public class Prize {
    // Atributos
    private int treasures; //
    private int level;
    
    //Constructor
    public Prize(int treasures, int level){
        this.treasures=treasures;
        this.level=level;
    };
    
    public int getTreasures(){
        return treasures;
    }
    
    public int getLevel(){
        return level;
    }
    
}
