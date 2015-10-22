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
    
    @someVisibleTreasures=someSpecificVisibleTreasures #Tesoro especifico visible
    @someHiddenTreasures=someSpecificHiddenTreasures   #Tesoro especifico invisible
    
    @death=death   # Indica si muere el jugador o no
    
   
  end
  
  #Llama al constructor
  def self.newLevelNumberOfTreasures (aText, someLevels,
    someVisibleTreasures, someHiddenTreasures)
  
    new(aText, someLevels, someVisibleTreasures, someHiddenTreasures)
  end
  
  #Llama al constructor
  def self.newLevelSpecificTreasures (aText, someLevels,
    someSpecificVisibleTreasures, someSpecificHiddenTreasures)
  
    new(aText, someLevels, someSpecificVisibleTreasures, someSpecificHiddenTreasures)
  end
  
  #Llama al constructor
  def self.newDeath (aText)
    
    new(aText)
  end
  
  #Consultores
  attr_reader:text
  attr_reader:levels
  attr_reader:nVisibleTreasures
  attr_reader:nHiddenTreasures
  attr_reader:someVisibleTreasures
  attr_reader:someHiddenTreasures
  attr_reader:death
  
 
end
