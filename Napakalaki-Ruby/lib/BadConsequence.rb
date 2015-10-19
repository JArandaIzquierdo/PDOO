# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class BadConsequence
  
  def initialize
    @text    # Mensaje de mal rollo
    @levels  # Level que se pierden
    @nVisibleTreasures  # Nº tesoros visibles que se pierden
    @nHiddenTreasures   # Nº tesoros ocultos que se pierden
    @death   # Indica si muere el jugador o no
    
    #private ArrayList<TreasureKind> specificHiddenTreasures = new ArrayList();
    #private ArrayList<TreasureKind> specificVisibleTreasures = new ArrayList();
  end
  
  #Consultores
  BadConsequence attr_accessor:text
  BadConsequence attr_accessor:levels
  BadConsequence attr_accessor:nVisibleTreasures
  BadConsequence attr_accessor:nHiddenTreasures
  BadConsequence attr_accessor:death
  
  
end
