package napakalaki;

/**
 *
 * @author JaviAir
 */
public class Player {
    static final int MAXLEVEL=10;
    private String name;
    private int level;
    private boolean dead=true;
    private boolean canISteal=true;
    


    public Player (String name){
    

    }

    public String getName(){
        return name;
    }
    
    private void bringToLife(){
    
    }
    
    private int getCombatLevel(){
        return 0;
    }
    
    private void incrementLevels(int l){
    
    }
    
    private void decrementLevels(int l){
    
    }
    
    private void setPendingBadConsequence(BadConsequence b){
    
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
    
        return false;
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
    
        return 0;
    }
    
    public Treasure stealTreasure(){
        return null;
    
    }
    
    public void setEnemy(Player enemy){
    
    }
    
        
    
}
