#Clase BadConsequence para el mal rollo
#Auror: Javier Aranda Izquierdo

class BadConsequence
  
  def initialize(text,levels, nVisibleTreasures, nHiddenTreasures, death,
    specificVisibleTreasure,specificHiddenTreasure)
  
    @text=text  #Mensaje del mal rollo
    @levels=levels # Niveles que pierdes
    @nVisibleTreasures=nVisibleTreasures #Tesoros visibles
    @nHiddenTreasures=nHiddenTreasures  #Tesoros ocultos
    @death=death  #Muerte o no del jugador (vuelve a estado inicial)
    @specificVisibleTreasure=specificVisibleTreasure # Tesoro especifico visible
    @specificHiddenTreasure=specificHiddenTreasure  # Tesoro especidico oculto
  end
  

  
  
 #Conusltores basicos
 attr_accesor:text
 attr_accesor:levels
 attr_accesor:nVisibleTreasure
 attr_accesor:nHiddenTreasure
 attr_accesor:death
end
