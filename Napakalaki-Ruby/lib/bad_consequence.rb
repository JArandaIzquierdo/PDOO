# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class BadConsequence
  
  initialize(aText, someLevels, someVisibleTreasures, someHiddenTreasures,
    someSpecificVisibleTreasures, someSpecificHiddenTreasures, death)
    @text    # Mensaje de mal rollo
    @levels  # Level que se pierden
    @nVisibleTreasures  # Nº tesoros visibles que se pierden
    @nHiddenTreasures   # Nº tesoros ocultos que se pierden
    @death   # Indica si muere el jugador o no
    
    #private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    #private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
  
  
  #Consultores
  attr_reader:text
  attr_reader:levels
  attr_reader:nVisibleTreasures
  attr_reader:nHiddenTreasures
  attr_reader:death
  
 
end
