# Javier Aranda Izquierdo
module NapakalakiGame

class Treasure
  def initialize(name, bonus, type)
    @name=name
    @bonus=bonus
    @type=type
  end
    
    attr_reader:name
    attr_reader:bonus
    attr_reader:type    
    
end
end