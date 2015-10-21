# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class BadConsequence
  
  def initialize(aText, someLevels, someVisibleTreasures, someHiddenTreasures,
    someSpecificVisibleTreasures, someSpecificHiddenTreasures, death)
    @text=aText    # Mensaje de mal rollo
    @levels=someLevels  # Level que se pierden
    @nVisibleTreasures=someVisibleTreasures  # Nº tesoros visibles que se pierden
    @nHiddenTreasures=someHiddenTreasures   # Nº tesoros ocultos que se pierden
    @someVisibleTreasures=someSpecificVisibleTreasures
    @someHiddenTreasures=someSpecificHiddenTreasures
    @death=death   # Indica si muere el jugador o no
    
    
    #private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    #private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
    #Array.new
  end
  
  #Consultores
  attr_reader:text
  attr_reader:levels
  attr_reader:nVisibleTreasures
  attr_reader:nHiddenTreasures
  attr_reader:death
  
 
end
