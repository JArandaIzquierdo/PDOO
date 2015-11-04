# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

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
