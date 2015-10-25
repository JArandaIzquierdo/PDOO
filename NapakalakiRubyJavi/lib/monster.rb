#Clase Monster
#Autor: Javier Aranda Izquierdo
require relative "prize"
require relative "bad_consequence"

class Monster
  def initialize(name,combarLevel,prize,badConsequence)
    @name=name
    @combarLevel=combarLevel
    @prize=prize
    @badConsequence=badConsequence
    
  end
  
# Consulores basicos
attr_accesor:name
attr_accesor:combatLEvel

end
