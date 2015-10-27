class BadConsequence
  
  private_class_method:new
  
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
  
    new(aText, someLevels, someVisibleTreasures, someHiddenTreasures, 0, 0, false)
  end
  
  #Llama al constructor
  def self.newLevelSpecificTreasures (aText, someLevels,
    someSpecificVisibleTreasures, someSpecificHiddenTreasures)
  
    new(aText, someLevels, 0, 0, someSpecificVisibleTreasures, someSpecificHiddenTreasures, false)
  end
  
  #Llama al constructor
  def self.newDeath (aText)
    
    new(aText, 0, 0, 0, 0, 0, true)
  end
  
  
  
  #Consultores
  attr_reader:text
  attr_reader:levels
  attr_reader:nVisibleTreasures
  attr_reader:nHiddenTreasures
  attr_reader:someVisibleTreasures
  attr_reader:someHiddenTreasures
  attr_reader:death
              
  def to_s
  "Texto: #{@text} \nNiveles perdidos: #{@levels} \nTesoros visibles: #{@nVisibleTreasures} \nTesoros ocultos: #{@nHiddenTreasures}
Tesoro Especifico visible: #{@someVisibleTreasures} \nTesoro Especifico oculto: #{@someHiddenTreasures} \nMuerte: #{@death}"
  end
 
end
