# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative "prize"
require_relative "bad_consequence"

class Monster
  
  def initialize(name,combatLevel,bc,price)
    @name=name
    @combatLevel=combatLevel
    @bc=bc
    @price=price
  end
  
  #Consultores
  attr_reader:name
  attr_reader:combatLevel
  attr_reader:bc
  attr_reader:price
  
  
  # Metodo to_s
  def to_s
  "Nombre monstruo: #{@name} \nNivel de combate: #{@combatLevel}"
  end
  
  # Metodo Consultor nivel de combate superior a 10
  def LevelExceeding10
    if combatLevel>10
      true
    end
  end
  
  # Metodo Consultor de mal rollo que solo implique perdida de niveles
  def OnlyLevelsBadConsequence
    if (bc.levels>0) && (bc.nVisibleTreasures==0) && (bc.nHiddenTreasures==0)
      true
    end
  end
  
  # Metodo Consultor de buen rollo con nivel superior a 1
  def PrizeLevelsExceeding1
    if price.level>1
      true
    end
  end
  
  # Metodo Consultor mal rollo que suponga la pérdida de un 
  # determinado tipo de tesoros ya sea visibles y/o ocultos
  def LoseSpecificTreasures
    if (bc.someVisibleTreasures!=0) || (bc.someHiddenTreasures!=0)
      true
    end
  end
  
end
