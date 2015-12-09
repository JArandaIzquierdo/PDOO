package NapakalakiGame;

import java.util.Random;

/**
 *
 * @author Javier Aranda Izquierdo
 */
public class Dice {
    private static final Dice instance= new Dice();
    
    private Dice(){
        
    }
    
    public static Dice getInstance(){
        return instance;
    }
    
    public int nextNumber(){
        Random r = new Random();
        int valorDado = r.nextInt(6)+1;
        return valorDado;
    }
}
