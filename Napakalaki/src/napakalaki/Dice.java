package napakalaki;

/**
 *
 * @author carlos
 */
public class Dice {
    private static final Dice instance= new Dice();
    
    private Dice(){
        
    }
    
    public static Dice getInstance(){
        return instance;
    }
    
    public int nextNumber();
}
