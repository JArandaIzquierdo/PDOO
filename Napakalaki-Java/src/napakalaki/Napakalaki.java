package napakalaki;

import java.util.ArrayList;
import java.util.Random;

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
    private ArrayList <Player> players;
    private CardDealer dealer;
    
    private Napakalaki(){
        
    }
    
    private void initPlayers(ArrayList<String> names){
        //Creamos un vector de jugadores
        players=new ArrayList();
        
        //Recorremos el vector names pasado por parametro e insertamos los 
        //nombres en el vector players
        for(String s : names){
            players.add(new Player(s));
        }
    }
    
    private Player nextPlayer(){
        
        int numeroJugadores = players.size();// Numero de jugadores
        int siguienteIndice;// Nos dice el indice del siguiente jugador
        int indiceActual;// Indice del jugador actual
        Player nextPlayer;
        
        // Si es la primera vez que se juaga, el jugador actual no se sabe
        if(currentPlayer == null){
            
            //Creamos una variable random que elija uno aleatoriamente entre los que hay
            Random r = new Random();
            
            siguienteIndice = r.nextInt(numeroJugadores);
           
        }
        else{
            // Obtenemos el indice del jugador actual
            indiceActual=players.indexOf(currentPlayer);
            
            // Si el jugador actual es el ultimo del index volvemos al primero
            if(indiceActual == players.size()-1){
                siguienteIndice=0;
            }
            // si no es el ultimo, el siguiente es el actual +1
            else{
                siguienteIndice=indiceActual + 1;
            }
        }
        
        //Cogemos al jugador correspondiente al indice
        nextPlayer= players.get(siguienteIndice);
        
        //Decimos quien es el siguiente jugador
        this.currentPlayer=nextPlayer;
        
        return this.currentPlayer;
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
    
        return currentPlayer;
    }
     public Monster getCurrentMonster(){
     
         return currentMonster;
    }
    
    public boolean nextTurn(){
    
        return false;
    } 
    
    public boolean endOfGame(CombatResult result){
    
        return false;
    }
}