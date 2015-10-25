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
attr_accesor:prize
attr_accesor:badConsequenze

end

def to_s
  "Nombre del monstruo: #{name} \nNivel de combate: #{level}"
end