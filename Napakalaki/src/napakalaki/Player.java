package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class Player {
    static final int MAXLEVEL=10;
    private String name;
    private int level;
    private boolean dead=true;
    private boolean canISteal=true;
    
    // Atributos obtenidos de otras clases
    private BadConsequence pendingBadConsequence;
    private ArrayList <Treasure> hiddenTreasures = new ArrayList();
    private ArrayList <Treasure> visibleTreasures = new ArrayList();
    private Player enemy;
    


    public Player (String name){
    

    }

    public String getName(){
        return this.name;
    }
    
    private void bringToLife(){
        this.dead=false;
    }
    
    // Por comprobar mas cosas
    private int getCombatLevel(){
        return this.level;
    }
    
    private void incrementLevels(int l){
        level = level + l;
    }
    
    private void decrementLevels(int l){
        level = level - l;
    }
    
    private void setPendingBadConsequence(BadConsequence b){
        pendingBadConsequence=b;
    }
    
    private void applyPrize(Monster m){
    
    }
    
    private void applyBadConsequence(Monster m){
    
    }
    
    private boolean canMakeTreasureVisible(Treasure t){
        
        return false;
    }
    
    private int howManyVisibleTreasures(TreasureKind tKind){
    
        return 0;
    }
    
    /*
    Cambia el estado de jugador a muerto,modificando el correspondiente atributo.
    Esto ocurre cuando el jugador, por algún motivo, ha perdido todos sus tesoros.
    */
    private void dielfNoTreasures(){
    
        if(visibleTreasures.isEmpty() && hiddenTreasures.isEmpty())
            dead = true;
    }
    
    public boolean isDead(){
    
        return this.dead;
    }
    
    public Treasure getHiddenTreasures(){
        return null;
    
    }
    
    public Treasure getVisibleTreasure(){
    
        return null;
    }
    
    public CombatResult combat(Monster m){
        
        return null;
    }
    
    public void makeTreasureVisible(Treasure t){
    
    }
    
    public void discardVisibleTreasure(Treasure t){
    
    }
    
    public void discarHiddenTreasure(Treasure t){
    
    }
    
    public boolean validState(){
        
        return false;
    }
    
    public void initTreasures(){
    
    }
    
    public int getLevels(){
    
        return level;
    }
    
    public Treasure stealTreasure(){
        return null;
    
    }
    
    public void setEnemy(Player enemy){
    
    }
    
    private Treasure giveMeATreasure(){
        
        return null;
    }
    
    public boolean canISteal(){
    
        return false;
    }
    
    private boolean canYouGiveMeATreasure(){
    
        return false;
    }
    
    private void haveStolen(){
    
    }
    
    public void discardAllTreasures(){
    
    
    }
        
    
}
