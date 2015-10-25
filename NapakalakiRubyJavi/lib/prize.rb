#Clase para el premio
class Prize
  def initialize (treasures,level)
    @treasures=treasures
    @level=level
  end


  attr_reader :treasures, :level
  
  def to_s
    "Tesoros ganados: #{@treasures} \n Niveles ganados: #{@levels}"
  end
end
