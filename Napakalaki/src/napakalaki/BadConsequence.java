/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

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
        setText(text);
        setLevels(levels);
        setNVisibleTreasures(nVisible);
        setNHiddenTreasures(nHidden);
    }
    
    public BadConsequence(String text, boolean death){
        setText(text);
        setDeath(death);
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible,
    ArrayList<TreasureKind> tHidden){
        setText(text);
        setLevels(levels);
        setSpecificVisibleTreasures(tVisible);
        setSpecificHiddenTreasures(tHidden);
        
    }
    
    // Modificadores
    private void setText(String txt){
        text = txt;
    }
    
    private void setLevels(int lv){
        levels = lv;
    }
    
    private void setNVisibleTreasures(int nvt){
        nVisibleTreasures = nvt;
    }
    
    private void setNHiddenTreasures(int nht){
        nHiddenTreasures = nht;
    }
    
    private void setDeath(boolean dth){
        death = dth;
    }
    
    private void setSpecificHiddenTreasures(ArrayList<TreasureKind> tHidden){
        specificHiddenTreasures = tHidden;
    }
    
    private void setSpecificVisibleTreasures(ArrayList<TreasureKind> tVisible){
        specificVisibleTreasures = tVisible;
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
