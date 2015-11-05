# Author: Javier Aranda

class Player
  
  CONST_MAXLEVEL = 10
  def initialize(nom,nivel,muerte=true,robar=true)
    @nombre=nom
    @level=nivel
    @dead=muerte
    @canISteal=robar
  end
end
