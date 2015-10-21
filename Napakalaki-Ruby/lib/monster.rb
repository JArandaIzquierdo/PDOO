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
  
end
