# Author: Javier Aranda
module NapakalakiGame
  class Player

    @@MAXLEVEL = 10
    def initialize(name,level, dead=true, canISteal=true, enemy, visibleTreasures, 
      hiddenTreasures,pendingBadConsequence,dice)
      @level=level
      @name=name
      @dead=dead
      @canISteal=canISteal

      # Atributos de referencia
      @enemy=enemy
      @visibleTreasure=visibleTreasures
      @hiddenTreasures=hiddenTreasures # array.new
      @pendingBadConsequence=pendingBadConsequence
      @dice=dice
    end

     # Constructor con el parametro nombre
    def self.player (name)
      new(name,0,false,false, enemy,0,0 )
    end
    # Consultores
    attr_reader :name # Metodo getName()
    
    # Motodo bringToLife
    private def bringToLife
      @dead = false
    end
    
    # Motodo getCombatLevel
    private def getCombatLevel
      nivel=level
      for t in visibleTreasures
          nivel=nivel+t.bonus
      end

      return nivel

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
      @pendinBadConsequence = b

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
      for t in visibleTreasures
        if(t.getType == tKind)
          @numeroDeTesoros = @numeroDeTesoros+1
        end
      end
      return numeroDeTesoros
    end
    
    # Metodo dieIfNoTreasures
    private def dieIfNoTreasures
      if(visibleTreasure.isEmpty)
        @dead=true
      end

    end
    
    # Metodo isDead
    def isDead
      @dead
    end
    
    # Metodo getHiddenTreasures
    def getHiddenTreasures
      
    end
    
    # Metodo getVisibleTreasures
    def getVisibleTreasures

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
      @pendigBadConsequence.isEmpty && @hiddenTreasures.length<=4
    end
    
    # Metodo initTreaures
    def initTreasures

    end
    
    attr_reader :level # Metodo getLevels()
    
    # Metodo stealTreasure
    def stealTreasure

    end
    
    # Metodo setEnemy
    def setEnemy(enemy)
      @enemy=enemy

    end
    
    # Metodo gifMeATreasure
    private def gifMeATreasure

    end
    
    attr_reader :canIsteal #Merodo canISteal()
    
    # Metodo canYouGiveMeATreasure
    private def canYouGiveMeATreasure
      if(@hiddenTreasures.isEmpty)
        return false
      else 
        return true
      end
    end
    
    # Metodo haveStolen
    private def haveStolen
      @canISteal=false

    end
    
    # Metodo discardAllTreasures
    def discardAllTreasures

    end
    
  end
  
end

