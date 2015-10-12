/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author carlos
 */
public class BadConsequence {
    // Atributos privados
    private String text;    // Mensaje de mal rollo
    private int levels;     // Level que se pierden
    private int nVisibleTreasures;  // Nº tesoros visibles que se pierden
    private int nHiddenTreasures;   // Nº tesoros ocultos que se pierden
    private boolean death;     // Indica si muere el jugador o no
    
    private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    //NO LOS ENTIENDO EL FUNCIONAMIENTO
    
    //Constructores
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
        // NO SE COMO RELLENAR
    }
    
    public BadConsequence(String text, boolean death){
        // NO SE COMO RELLENAR
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
    ArrayList<TreasureKind> tHidden){
        // NO ENTIENDO FUNCIONAMIENTO
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
}
