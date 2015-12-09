package napakalaki;

import java.util.ArrayList;
import java.util.Random;

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
    private Dice dado;
    private CardDealer cardDealer;
    private CombatResult combatResult;


    public Player (String name){
    
        this.name= name;
    }
    
    /*
    Devuelve el nombre del jugador.
    */
    public String getName(){
        return name;
    }
    
    /*
    Devuelve la vida al jugador, modificando el atributo correspondiente.
    */
    private void bringToLife(){
        dead=false;
    }
    
    /*
    Devuelve el nivel de combate del jugador, que viene dado por su nivel más
    los bonus que le proporcionan los tesoros que tenga equipados, según las 
    reglas del juego.
    */
    private int getCombatLevel(){
        int nivel = level;
        for (Treasure t: visibleTreasures)
            nivel = nivel + t.getBonus();
        
        return nivel;
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
        //Niveles ganados
        int nLevels=m.getLevelsGained();
        
        incrementLevels(nLevels);
        
        //Numero de tesoros ganados
        int nTreasures=m.getTreasuresGained();
        
        if(nTreasures>0){
            CardDealer dealer = CardDealer.getInstance();
            
            for(int i=1;i<=nTreasures;i++){
                Treasure t = dealer.nextTreasure();
                this.hiddenTreasures.add(t);
            }   
        }
    }
    
    private void applyBadConsequence(Monster m){
    
        BadConsequence badConsequence = m.getBadConsequence();
        
        int nLevels=badConsequence.getLevels();
        
        this.decrementLevels(nLevels);
        
        BadConsequence pendingBad = badConsequence.adjustToFitTreasureLists(this.visibleTreasures, this.hiddenTreasures);

        this.setPendingBadConsequence(pendingBad);
    }
    /* Comprueba si un tesoro oculto t puede pasar a se visible
    */
    private boolean canMakeTreasureVisible(Treasure t){
        
        TreasureKind tipo;
        boolean resultado=false;
        
        // Primero comprobamos que no tenga mas de 4 tesoros visibles
        if(visibleTreasures.size() < 4){
            tipo=t.getType();
            
            //-----------------------------------ONEHAND-------------------------- 
            if(tipo == TreasureKind.ONEHAND){
                
                //Si estamos equipado con un tesoro de 2 manos, no se puede agregar
                if (tesoroUtilizandose(TreasureKind.BOTHHANDS)) {
                        resultado = false;
                        
                } else {
                    
                    // Comprobamos cuantos tesoros de una mano tenemos
                    int i = 0;
                    for (Treasure tesoro : this.visibleTreasures) {
                        if (tesoro.getType().equals(TreasureKind.ONEHAND)) {
                            i++;
                        }
                    }
                    if(i==2){
                        resultado=false;
                    }
                    else
                        resultado=true;
                }
            }
            
            // --------------------- LOS DEMAS CASOS---------------------------
            resultado=!tesoroUtilizandose(tipo);
        
        }
        return resultado;
    }
    
    /*
    
    Devuelve el número de tesoros visibles de tipo tKind que tiene el jugador.
    */
    private int howManyVisibleTreasures(TreasureKind tKind){
        int numeroDeTesoros=0;// Variable para guardar el numero de tesoros 
        
        // Recorremos los tesoros visibles con un for
        for(Treasure t: visibleTreasures){
            if(t.getType() == tKind)// Si los tesoros son del tipo tKind
                numeroDeTesoros++;// Añadimos un tesoro
        }
            
        return numeroDeTesoros;
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
    
        return dead;
    }
    
    public Treasure getHiddenTreasures(){
        return null;
    
    }
    
    public Treasure getVisibleTreasure(){
    
        return null;
    }
    
    public CombatResult combat(Monster m){
        
        CombatResult result;
        int myLevel=getCombatLevel();
        int monsterLevel=m.getCombatLevel();
        
        //Si mi nivel es mayor que el del monstruo
        if(myLevel>monsterLevel){
            
            //Aplicamos el premio
            applyPrize(m);
            
            //si mi nivel es mayor que el maximo, he ganado la partida
            if(this.level >MAXLEVEL)
                result=combatResult.WINGAME;
            // Si no, he ganado el turno
            else
                result=combatResult.WIN;
        }
        //Si mi nivel no es mayor que el del monstruo
        else{
            applyBadConsequence(m);
            result=combatResult.LOSE;
        }
        
        return null;
    }
    
    public void makeTreasureVisible(Treasure t){
    
        boolean canI=canMakeTreasureVisible(t);
        
        if(canI){
            visibleTreasures.add(t);
            hiddenTreasures.remove(t);
        }
    }
    
    public void discardVisibleTreasure(Treasure t){
        //Eliminamos el tesoro visible t
        visibleTreasures.remove(t);
        
        //Si el mal rollo pendiente no es null y no esta vacio
        if(pendingBadConsequence!= null && !pendingBadConsequence.isEmpty())
            //Substraemos el tesoto visible del mal rollo pendiente
            pendingBadConsequence.substractVisibleTreasure(t);
        
        //Volvemos a comprobar si no tiene tesoros
        dieIfNoTreasures();
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
        
        Treasure treasure=null;
        boolean canI=this.canISteal();
       
        //Comprobamos si podemos robar un tesoro (solo una vez en la partida)
        if(canI){
            
            boolean canYou=enemy.canYouGiveMeATreasure();
            //Comprobamos que el enemigo tenga tesoros ocultos para robar
            if(canYou){
                //Robamos un tesoro al enemigo 
                treasure=enemy.giveMeATreasure();
                //Lo añadimos a la lista de tesoros ocultos
                hiddenTreasures.add(treasure);
                //Indicamos que ya hemos robado en esta partida
                this.haveStolen();
            }
        }
        return treasure;
    
    }
    /*
    Asigna valor al atributo que referencia al enemigo del jugador.
    */
    public void setEnemy(Player enemy){
        this.enemy=enemy;
    
    }
    
    private Treasure giveMeATreasure(){
        Random r = new Random();
        Treasure tesoro;//Tesoro que devuelve al azar
        int numeroTesorosOcultos=hiddenTreasures.size();//Numero de tesoros que tenemos
        
        tesoro=hiddenTreasures.get(r.nextInt(numeroTesorosOcultos));
        
        return tesoro;
    }
    /*
    Devuelve true si el jugador no ha robado ningún tesoro a su enemigo y false en
    caso contrario.
    */
    public boolean canISteal(){
    
        if(canISteal==true)
            return true;
        else
            return false;
    }
    /*
    Devuelve true si el jugador tiene tesoros para ser robados por otro jugador y false
    en caso contrario.
    */
    private boolean canYouGiveMeATreasure(){
        if(!hiddenTreasures.isEmpty())
            return true;
        else
            return false;
    }
    /*
    Cambia el atributo canISteal a false cuando el jugador roba un tesoro.
    */
    private void haveStolen(){
        
        this.canISteal=false;   
    }
    
    public void discardAllTreasures(){
    
        ArrayList<Treasure> copiavisibleTreasure= new ArrayList(visibleTreasures);
        ArrayList<Treasure> copiahiddenTreasure= new ArrayList(visibleTreasures);
        
        for(Treasure t:copiavisibleTreasure)
            this.discardVisibleTreasure(t);
        
        for(Treasure t:copiahiddenTreasure)
            this.discarHiddenTreasure(t);    
    }
    
    //Metodo que comprueba si un Tipo de Tesoro está en uso
    private boolean tesoroUtilizandose(TreasureKind type) {
        boolean result = false;
        for (Treasure tv : this.visibleTreasures) {

            if (type.equals(tv.getType())) {

                result = true;
                break;

            }

        }
        return result;
    }
        
    
}
