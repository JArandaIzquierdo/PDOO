# Javier Aranda Izquierdo

require_relative "prize"
require_relative "bad_consequence"

class Monster
  
  def initialize(name,combatLevel,badConsequence,prize)
    @name=name
    @combatLevel=combatLevel
    @badConsequence=badConsequence
    @prize=prize
  end
  
  #Consultores
  #getName()
  attr_reader:name
  
  #getCombatLevel
  attr_reader:combatLevel
  
  #getBadConsequence
  attr_reader:badConsequence
    
  
  def getLevelsGained
    @prize.level
  end
    
  
  def getTreasuresGained
    @prize.treasures
  end
  # Metodo to_s
  def to_s
  "Nombre monstruo: #{@name} \nNivel de combate: #{@combatLevel}"
  end  
end
