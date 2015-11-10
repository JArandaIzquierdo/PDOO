package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author JaviAir
 */
public class CardDealer {
    private static final CardDealer instance= new CardDealer();
    
    // Atributos de otras clases
    private ArrayList <Monster> usedMonster;
    private ArrayList <Monster> unusedMonster;
    private ArrayList <Treasure> usedTreasures;
    private ArrayList <Treasure> unusedTreasures;
    
    // Constructor de la clase
    private CardDealer(){
    
    }
    /*
    Inicializa el mazo de cartas de Tesoros (unusedTreasures) con todas las 
    cartas de tesoros proporcionadas en el documento de cartas de tesoros.
    */
    private void initTreasureCardDeck(){
        unusedTreasures = new ArrayList();// Inicializamos el array
        
        //Creamos los tesoros
    }
    
    private void initMonsterCardDeck(){
    
    }
    
    private void shuffleTreasures(){
    
    }
    
    private void shuffleMonsters(){
    
    }
    
    public static CardDealer getInstance(){
    
        return instance;
    }
    
    public Treasure nextTreasure(){
  
        return treasure;
    }
    
    public Monster nextMonster(){
    
        return monster;
    }
    
    public void giveTreasureBack(Treasure t){
    
    }
    
    public void giveMonsterBack(Monster m){
    
    }
    
    public void initCards(){
    
    }
    
    
    
}
