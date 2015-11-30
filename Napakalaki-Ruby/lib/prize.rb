# Javier Aranda Izquierdo
module NapakalakiGame

class Prize
  
  def initialize(treasures, levels)
     @treasures=treasures
     @levels=levels
  end
  
  #Consultores
  attr_reader:treasures # Metodo getTreasures
  attr_reader:level # Metodo getLevels
  
  def to_s
  "Tesoros ganados: #{@treasures} \nNiveles ganados: #{@level}"
  end
    

end

end