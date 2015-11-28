package napakalaki;

/**
 *
 * @author Javier Aranda Izquierdo
 */
public class Treasure {
    private String name;
    private int bonus;
    private TreasureKind type;
    
    
    Treasure(String n, int bonus, TreasureKind t){
        name=n;
        this.bonus=bonus;
        type=t;
    }
    
    
    public String getName(){
        return name;
    }
    
    public int getBonus(){
        return bonus;
    }
    public TreasureKind getType(){
        return type;
    }
}
