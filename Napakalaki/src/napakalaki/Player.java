package napakalaki;

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
    private Treasure hiddenTreasures;
    private Treasure visibleTreasures;
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
    
    private void dielfNoTreasures(){
    
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
