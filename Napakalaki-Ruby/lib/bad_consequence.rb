#Javier Aranda Izquierdo

module NapakalakiGame

class BadConsequence
  
  private_class_method:new
  
  @@MAXTREASURES=10
  
  def initialize(text, levels, nVisibleTreasures, nHiddenTreasures,
    specificVisibleTreasures, specificHiddenTreasures, death)
    @text=text    # Mensaje de mal rollo
    @levels=levels  # Level que se pierden
    @nVisibleTreasures=nVisibleTreasures  # Nº tesoros visibles que se pierden
    @nHiddenTreasures=nHiddenTreasures   # Nº tesoros ocultos que se pierden
    @death=death   # Indica si muere el jugador o no
    
    @specificVisibleTreasures=specificVisibleTreasures #Tesoro especifico visible
    @specificHiddenTreasures=specificHiddenTreasures   #Tesoro especifico invisible
      
  end
  
  #Llama al constructor
  def self.newLevelNumberOfTreasures (text, levels,
    nVisibleTreasures, nHiddenTreasures)
  
    new(text, levels, nVisibleTreasures, nHiddenTreasures, 0, 0, false)
  end
  
  #Llama al constructor
  def self.newLevelSpecificTreasures (text, levels,
    specificVisibleTreasures, specificHiddenTreasures)
  
    new(text, levels, 0, 0, specificVisibleTreasures, specificHiddenTreasures, false)
  end
  
  #Llama al constructor
  def self.newDeath (text)
    
    new(text, 0, 0, 0, 0, 0, true)
  end
  
  def isEmpty
    if((@nVisibleTreasures==0) && (@nHiddenTreasures==0) && (@death==false) && (@specificVisibleTreasures.isEmpty) && (@specificHiddenTreasures.isEmpty))
      true
    else
      false
    end
  end
  
  
  #Consultores
  #getLevels
  attr_reader:levels
  
  #getNVisibleTreasures
  attr_reader:nVisibleTreasures
  
  #getNHiddenTreasures
  attr_reader:nHiddenTreasures
  
  #getSpecificHiddenTreasures
  attr_reader:specificHiddenTreasures
  
  #getSpecificVisibleTreasures
  attr_reader:specificVisibleTreasures
  
  def substractVisibleTreasure(t)
    
  end
  
  def substractHiddenTreasure(t)
    
  end
  
  def adjustToFitTreasureLists(v,h)
    
  end
              
  def to_s
  "Texto: #{@text} \nNiveles perdidos: #{@levels} \nTesoros visibles: #{@nVisibleTreasures} \nTesoros ocultos: #{@nHiddenTreasures}
Tesoro Especifico visible: #{@someVisibleTreasures} \nTesoro Especifico oculto: #{@someHiddenTreasures} \nMuerte: #{@death}"
  end
 
end
end