# Author: Carlos

require "singleton"

class Dice
  
  include Singleton
  
  @@instance = Dice.new
  
  def initialize
    
  end
  
  def public getInstance
    @@instance
  end
    
  def public nextNumber
     rand(7)
  end
end
