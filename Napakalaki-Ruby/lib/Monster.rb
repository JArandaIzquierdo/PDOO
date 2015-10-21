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
  Monster attr_reader:name
  Monster attr_reader:combatLevel
  Monster attr_reader:bc
  Monster attr_reader:price
  
end
