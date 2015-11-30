# Javier Aranda Izquierdo
module NapakalakiGame
  
  require "singleton"

  class Napakalaki

    include Singleton

    def initialize(resultado,currentMonster,dealer,currentPlayer,players)
      @result=resultado
      @currentMonster=currentMonster
      @dealer=dealer
      @currentPlayer=currentPlayer
      @players=players

    end

      private def Napakalaki

      end

      private def initPlayers(names)

      end

      private def nextPlayer

      end

      private def nextTurnAllowed

      end

      private def setEnemies

      end

      def developCombat

      end

      def discardVisibleTreasures(treasures)

      end

      def discardHiddenTreasures(treasures)

      end

      def makeTreasuresVisible(treasures)

      end

      def initGame(players)

      end

      def getCurrentPlayer

      end

      def getCurrentMonster

      end

      def nextTurn

      end

      def endOfGame(result)

      end
  end
end