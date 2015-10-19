# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Monster
  
  def initialize(name,combatLevel,bc,price)
    @name=name
    @combatLevel=combatLevel
    @bc=bc
    @price=price
  end
  
  #Consultores
  Monster attr_accessor:name
  Monster attr_accessor:combatLevel
  Monster attr_accesor:bc
  Monster attr_accesor:price
  
end
