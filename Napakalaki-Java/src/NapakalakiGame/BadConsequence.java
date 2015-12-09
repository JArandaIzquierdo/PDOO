package NapakalakiGame;
import java.util.ArrayList;

/**
 *
 * @author Javier Aranda Izquierdo
 */
public class BadConsequence {
    static final int MAXTREASURES=10;
    
    // Atributos privados
    private String text;    // Mensaje de mal rollo
    private int levels;     // Level que se pierden
    private int nVisibleTreasures;  // Nº tesoros visibles que se pierden
    private int nHiddenTreasures;   // Nº tesoros ocultos que se pierden
    private boolean death;     // Indica si muere el jugador o no
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    
    
    //Constructores de mal rollo
    
    //Constructor para mal rollo que especifica cuantos tesoros visibles y ocultos pierdes
    public BadConsequence(String t, int l, int nVisible, int nHidden){
        levels=l;
        text=t;
        nVisibleTreasures=nVisible;
        nHiddenTreasures=nHidden;
    }
    
    // Constructor del mal rollo si mueres
    public BadConsequence(String t, boolean death){
        text=t;
        this.death=death;
    }
    
    //Constructor para mal rollo que te quita los tipos de tesoros
    public BadConsequence(String t, int l, ArrayList<TreasureKind> v,
    ArrayList<TreasureKind> h){
        text=t;
        levels=l;
        specificVisibleTreasures=v;
        specificHiddenTreasures=h;
        
    }
       
    // Consultores
    public String getText(){
        return text;
    }
    
    public int getLevels(){
        return levels;
    }
    
    public int getNVisibleTreasures(){
        return nVisibleTreasures;
    }
    
    public int getNHiddenTreasures(){
        return nHiddenTreasures;
    }
    
    public boolean getDeath(){
        return death;
        
    }
    public TreasureKind getSpecificVisibleTreasures(){
        return null;
        
    }
    public TreasureKind getSpecificHiddenTreasures(){
        return null;
    }
    
    public void substractVisibleTreasure(Treasure t){
    
            
    }
    
    public void substractHiddenTreasure(Treasure t){
    
    }
    
    public BadConsequence adjusToFitTreasureLists(ArrayList<Treasure>v,ArrayList<Treasure>h){
        
        //variable de mal rollo que vamos a devolver segun nuestros tesoros
        BadConsequence malRollo;
        
        if(nVisibleTreasures!=0 || nHiddenTreasures!=0){    // Caso de que quiten nº de tesoros
            int nV;
            int nH;
            
            
            //Ajustamos segun el tamaño de los visibles
            if(nVisibleTreasures>v.size())
                nV=v.size();
            else
                nV=nVisibleTreasures;
            
            //Ajustamos segun el tamaño de los no visibles
            if(nHiddenTreasures>h.size())
                nH=h.size();
            else
                nH=nHiddenTreasures;
            
            
            malRollo=new BadConsequence(this.text, 0, nV, nH);
            
        }else{  //Caso de que quiten tesoros especificos
                ArrayList<TreasureKind> arr_nV= new ArrayList();
                ArrayList<TreasureKind> arr_nH= new ArrayList();
                
                for(Treasure t: v){
                    arr_nV.add(t.getType());   
                }
                
                for(Treasure t: h){
                    arr_nH.add(t.getType());
                }
                
                arr_nV.retainAll(specificVisibleTreasures);
                    
                arr_nH.retainAll(specificHiddenTreasures);
                
                
                malRollo=new BadConsequence(this.text, 0, arr_nV, arr_nH);
            }
    
        return malRollo;
    }
    
    // Metodo que 
    public boolean isEmpty(){
        boolean vacio=false;
        if((nHiddenTreasures==0) && (nVisibleTreasures==0)&& (death==false)
                && (specificHiddenTreasures.isEmpty()) && (specificVisibleTreasures.isEmpty()))
            vacio=true;
        
        return vacio;
    }
    
    // Método toString
    @Override   //Estamos sobreescibribiendo un método padre de Java
    public String toString(){
        return " Text = " + text + ". Levels = " + Integer.toString(levels)
                + ". NVisibleTreasures = " + Integer.toString(nVisibleTreasures)
                + ". NHiddenTreasures = " + Integer.toString(nHiddenTreasures)
                + ". Death = " + death;
    }
}
