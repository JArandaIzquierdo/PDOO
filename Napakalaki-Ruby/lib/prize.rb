# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Prize
  
  def initialize(treasures, level)
     @treasures=treasures
     @level=level
  end
  
  #Consultores
  attr_reader:treasures
  attr_reader:level
end
