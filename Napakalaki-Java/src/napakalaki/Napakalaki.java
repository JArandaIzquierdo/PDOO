package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Javier Aranda Izquierdo
 */
public class Napakalaki {
    private static final Napakalaki instance = new Napakalaki();
    private CombatResult result;
    
    //Variables de otras clases
    private Monster currentMonster;
    private Player currentPlayer;
    private ArrayList <Player> players = new ArrayList();
    private CardDealer dealer;
    
    private Napakalaki(){
        
    }
    
    private void initPlayers(ArrayList<String> names){
    
    }
    
    private Player nextPlayer(){
        
        return null;
    }
    
    private boolean nextTurnAllowed(){
    
        return false;
    }
    
    private void setEnemies(){
    
    }
    
    public static Napakalaki getInstance(){
        
        return null;
    }
    
    public CombatResult developCombat(){
        return null;
    }
    
    public void discardVisibleTreasures(ArrayList<Treasure>treasures){
    
    }
    
    public void discardHiddenTreasures(ArrayList<Treasure>treasures){
    
    }
    
    public void makeTreasureVisible(ArrayList<Treasure>treasure){
    
    }
    
    public void initGame(ArrayList<String>players){
    
    }
    

    public Player getCurrentPlayer(){
    
        return null;
    }
     public Monster getCurrentMonster(){
     
         return null;
    }
    
    public boolean nextTurn(){
    
        return false;
    } 
    
    public boolean endOfGame(CombatResult result){
    
        return false;
    }
}