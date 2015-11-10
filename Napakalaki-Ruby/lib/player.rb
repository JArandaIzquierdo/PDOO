# Author: Javier Aranda

class Player
  
  CONST_MAXLEVEL = 10
  @level
  @name
  @dead=true
  @canISteal=true
 
  # Atributos de referencia
  @enemy
  @visibleTreasure
  @hiddenTreasures
  @pendingBadConsequence
  
  # Consultores
  attr_reader :name # Metodo getName()
  attr_reader :hiddenTreasures # Metodo getHiddenTreasure()
  
  # Constructor con el parametro nombre
  def initialize (name)
    @name=name
  end
  
  # ------------ Metodos publicos --------------------
  # Metodo getName
 
  
  # Metodo isDead
  def isDead()
    @dead
  end
  
  
  # Metodo getVisibleTreasures
  def getVisibleTreasures()
    
  end
  
  # Metodo combat
  def combat (m)
    
  end
  
  # Metodo makeTreasureVisible
  def makeTreasureVisible (t)
    
  end
  
  # Metodo discardVisibleTreasure
  def discardVisibleTreasure(t)
    
  end
  
  # Metodo discardHiddenTreasure
  def discardHiddenTreasure(t)
    
  end
  
  # Metodo validState
  def validState()
    
  end
  
  # Metodo initTreaures
  def initTreasures()
    
  end
  
  # Metodo getLevels
  def getLevels ()
    
  end
  
  # Metodo stealTreasure
  def steadTreasure()
    
  end
  
  # Metodo setEnemy
  def setEnemy(enemy)
    
  end
  
  # Metodo canISteal
  def canISteal()
    
  end
  
  # Metodo discardAllTreasures
  def discardAllTreasures()
    
  end
  
  # --------------- Metodos Privados ----------
  
  # Motodo bringToLife
  private def bringToLife()
    
  end
  
  # Motodo getCombatLevel
  private def getCombatLevel()
    
  end
  
  # Metodo incrementLevels
  private def incrementLevels(l)
    level = level + l
    
  end
  
  # Metodo decrementLevels
  private def decrementLevels(l)
    level = level-l
  end
  
  # Metodo setPendingBadConsequence
  private def setPendingBadConsequence(b)
    
  end
  
  # Metodo applyPrize
  private def applyPrize(m)
    
  end
  
  # Metodo applyBadConsequence
  private def applyBadConsequence(m)
    
  end
  
  # Metodo canMakeTreasureVisible
  private def canMakeTreasureVisible(t)
    
  end
  
  # Metodo howManyVisibleTreasures
  private def howManyVisibleTreasures(tKind)
    
  end
  
  # Metodo dieIfNoTreasures
  private def dieIfNoTreasures()
    
  end
  
  # Metodo gifMeATreasure
  private def gifMeATreasure()
    
  end
  
  # Metodo canYouGiveMeATreasure
  private def canYouGiveMeATreasure()
    
  end
  
  # Metodo haveStolen
  private def haveStolen()
    
  end
  
end
