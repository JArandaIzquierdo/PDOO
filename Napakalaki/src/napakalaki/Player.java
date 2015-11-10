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
    
    /*
    Devuelve el nombre del jugador.
    */
    public String getName(){
        return this.name;
    }
    
    /*
    Devuelve la vida al jugador, modificando el atributo correspondiente.
    */
    private void bringToLife(){
        this.dead=false;
    }
    
    /*
    Devuelve el nivel de combate del jugador, que viene dado por su nivel más
    los bonus que le proporcionan los tesoros que tenga equipados, según las 
    reglas del juego.
    */
    private int getCombatLevel(){
        return this.level
    }
    
    /*
    Incrementa el nivel del jugador en i niveles, teniendo en cuenta 
    las reglas del juego.
    */
    private void incrementLevels(int l){
        level = level + l;
    }
    
    /*
    Decrementa el nivel del jugador en i niveles, teniendo en cuenta
    las reglas del juego.
    */
    private void decrementLevels(int l){
        level = level - l;
    }
    
    /*
    Asigna el mal rollo al jugador, dándole valor a 
    su atributo pendingBadConsequence.
    */
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
    private void dieIfNoTreasures(){
    
        if(visibleTreasures.isEmpty() && hiddenTreasures.isEmpty())
            dead = true;
    }
    /*
    Devuelve true si el jugador está muerto, false en caso contrario.
    */
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
    /*
    Devuelve true cuando el jugador no tiene ningún mal rollo que cumplir y 
    no tiene más de 4 tesoros ocultos, y false en caso contrario. 
    Para comprobar que el jugador no tenga mal rollo que cumplir,
    utiliza el método isEmpty de la clase BadConsequence.
    */
    public boolean validState(){
        if (pendingBadConsequence.isEmpty() && hiddenTreasures.size() < 4)
            return true;
        else
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
    /*
    Asigna valor al atributo que referencia al enemigo del jugador.
    */
    public void setEnemy(Player enemy){
        this.enemy=enemy;
    
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
