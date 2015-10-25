#Clase Monster
#Autor: Javier Aranda Izquierdo
require relative "prize"
require relative "bad_consequence"

class Monster
  def initialize(name,combarLevel)
    @name=name
    @combarLevel=combarLevel
    
  end
  
# Consulores basicos
attr_accesor:name
attr_accesor:combatLEvel

end
