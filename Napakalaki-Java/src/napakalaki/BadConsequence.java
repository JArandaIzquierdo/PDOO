package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author Javier Aranda
 */
public class BadConsequence {
    
    //Attrb
    private String text;
    private int levels;
    private int nVisibleTreasures;
    private int nHiddenTreasures;
    private boolean death;
    
    private ArrayList <TreasureKind> specificHiddenTreasures = new ArrayList();
    private ArrayList <TreasureKind> specificVisibleTreasures = new ArrayList();
    
    //Constrctores
    
    public BadConsequence(String text, int levels, int nVisible, int nHidden){
       this.text=text;
       this.levels=levels;
       nVisibleTreasures=nVisible;
       nHiddenTreasures=nHidden;
    }
    
    public BadConsequence(String text, boolean death){
        this.text=text;
        this.death=death;
    }
    
    public BadConsequence(String text, int levels, ArrayList<TreasureKind> tVisible, ArrayList<TreasureKind> tHidden){
        this.text=text;
        this.levels=levels;
        specificVisibleTreasures=tVisible;
        specificHiddenTreasures=tHidden;
    }
    
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




}
