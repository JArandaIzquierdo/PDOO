# Author: Carlos

require "singleton"

class Dice
  
  include Singleton
    
  def public nextNumber
     rand(7)
  end
end
