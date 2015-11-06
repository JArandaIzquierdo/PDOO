package napakalaki;

/**
 *
 * @author JaviAir
 */
public class CardDealer {
    private static final CardDealer instance= new CardDealer();
    
    // Constructor de la clase
    private CardDealer(){
    
    }
    
    private void initTreasureCardDeck(){
    
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
