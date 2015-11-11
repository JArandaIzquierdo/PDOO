# Autor Javier Aranda

require Singleton

class CardDealer
  def initialize (unusedMonsters, usedMonsters, unusedTreasures, usedTreasures)
    @intance=CardDealer.new
    @unusedMonsters=unusedMonsters
    @usedMonster=usedMonsters
    @unusedTreasures=unusedTreasures
    @usedTreasures=usedTreasures
    
  end
  
  # ----------------- Metodos Publicos --------------------
  
  # Metodo getInstance
  def getInstance()
    
  end
  
  # Metodo nextTreasure
  def nextTreasure()
    
  end
  
  # Metodo nextMonster
  def nextMonster()
    
  end
  
  # Metodo giveTreasureBack
  def giveTreasureBack(t)
    
  end
  
  # Metodo giveMonsterBack
  def giveMonsterBack(m)
    
  end
  
  # Metodo 
  def initCards()
    
  end
  
  # ------------------ Metodos privados -----------------
  # Constructor
  private def CardDelaer()
    
  end
  
  # Metodo initTreasureCardDeck
  private def initTreasureCardDeck()
    #Creacion de Tesoro ¡Sí mi amo!
  unusedTreasures << Treasure.new("¡Si mi amo!", 0, 4,TreasureKind.HELMET)
        
  #Creacion de Tesoro Capucha de Cthulhu
  unusedTreasures << Treasure.new("Capucha de Cthulhu", 0, 3,TreasureKind.HELMET)
        
  #Creacion de Tesoro Botas de lluvia acida
  unusedTreasures << Treasure.new("Botas de lluvia acida", 0, 1,TreasureKind.BOTHHANDS)
        
  #Creacion de Tesoro Ametralladora Thompson
  unusedTreasures << Treasure.new("Ametralladora Thompson", 0, 4,TreasureKind.BOTHHANDS)
        
  #Creacion de Tesoro Clavo de rail ferroviario
  unusedTreasures << Treasure.new("Clavo de rail ferroviario", 0, 3,TreasureKind.ONEHAND)
        
  #Creacion de Tesoro Fez alopodo
  unusedTreasures << Treasure.new("Fez alopodo", 0, 3,TreasureKind.HELMET)    
        
  #Creacion de Tesoro El aparato del Pr. Tesla
  unusedTreasures << Treasure.new("El aparato del Pr. Tesla", 0, 4,TreasureKind.ARMOR)
        
  #Creacion de Tesoro Insecticida
  unusedTreasures << Treasure.new("Insecticida", 0, 2,TreasureKind.ONEHAND)   
        
  #Creacion de Garabato mistico
  unusedTreasures << Treasure.new("Insecticida", 0, 2,TreasureKind.ONEHAND)
        
  #Creacion de Lanzallamas
  unusedTreasures << Treasure.new("Lanzallamas", 0, 4,TreasureKind.BOTHHANDS)
        
  #Creacion de Necronomicon
  unusedTreasures << Treasure.new("Necronomicon", 0, 5,TreasureKind.BOTHHANDS)
        
  #Creacion de Necro-gnomicon
  unusedTreasures << Treasure.new("Necro-gnomicon", 0, 2,TreasureKind.ONEHAND)
        
  #Creacion de Mazo de los antiguos
  unusedTreasures << Treasure.new("Mazo de los antiguos", 0, 3,TreasureKind.ONEHAND)
        
  #Creacion de Porra preternatural
  unusedTreasures << Treasure.new("Porra preternatural", 0, 2,TreasureKind.ONEHAND)
        
  #Creacion de Varita de atizamiento
  unusedTreasures << Treasure.new("Varita de atizamiento", 0, 3,TreasureKind.ONEHAND)
        
  #Creacion de Zapato deja-amigos
  unusedTreasures << Treasure.new("Zapato deja-amigos", 0, 1,TreasureKind.SHOES)
  
  #Creacion de Botas de investigacion
  unusedTreasures << Treasure.new("Botas de investigacion", 0, 3,TreasureKind.SHOES)
  
  #Creacion de A prueba de babas
  unusedTreasures << Treasure.new("A prueba de babas", 0, 2,TreasureKind.ARMOR)
  
  #Creacion de Casco minero
  unusedTreasures << Treasure.new("Casco minero", 0, 2,TreasureKind.HELMET)
  
  #Creacion de Camiseta de la UGR
  unusedTreasures << Treasure.new("Camiseta de la UGR", 0, 1,TreasureKind.ARMOR)
  
  #Creacion de Cuchillo de sushi arcano
  unusedTreasures << Treasure.new("Cuchillo de sushi arcano", 0, 2,TreasureKind.ONEHAND)
  
  #Creacion de Hacha prehistorica
  unusedTreasures << Treasure.new("Hacha prehistorica", 0, 2,TreasureKind.ONEHAND)
  
  #Creacion de Gaita
  unusedTreasures << Treasure.new("Gaita", 0, 4,TreasureKind.BOTHHANDS)
  
  #Creacion de Escopeta de 3 caniones
  unusedTreasures << Treasure.new("Escopeta de 3 caniones", 0, 4,TreasureKind.BOTHHANDS)
  
  #Creacion de La rebeca metalica
  unusedTreasures << Treasure.new("La rebeca metalica", 0, 2,TreasureKind.ARMOR)
  
  #Creacion de Necro-comicon
  unusedTreasures << Treasure.new("Necro-comicon", 0, 1,TreasureKind.ONEHAND)
  
  #Creacion de Linterna a 2 manos
  unusedTreasures << Treasure.new("Linterna a 2 manos", 0, 3,TreasureKind.BOTHHANDS)
  
  #Creacion de Necrotelecom
  unusedTreasures << Treasure.new("Necrotelecom", 0, 2,TreasureKind.HELMET)
  
  #Creacion de Necro-playboycon
  unusedTreasures << Treasure.new("Necro-playboycon", 0, 3,TreasureKind.ONEHAND)
  
  #Creacion de Shogulador
  unusedTreasures << Treasure.new("Shogulador", 0, 1,TreasureKind.BOTHHANDS)
  
  #Creacion de Tentaculo de pega
  unusedTreasures << Treasure.new("Tentaculo de pega", 0, 2,TreasureKind.HELMET)
    
  end
  
  # Metodo initMonsterCardDeck
  private def initMonsterCardDeck()
    
  end
  
  # Metodo shuffleTreasures
  private def shuffleTreasures()
    
  end
  
  # Metodo shuffleMonsters
  def shuffleMonsters()
    
  end
end
