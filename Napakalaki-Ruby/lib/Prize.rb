# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

class Prize
  
  def initialize(treasures, level)
     @treasures=treasures
     self.level=level    #¿Cual de los dos?
  end
  
  #Consultores
  Prize attr_reader:treasures #Prize attr_reader:treasures, :level
  Prize attr_reader:level
end
