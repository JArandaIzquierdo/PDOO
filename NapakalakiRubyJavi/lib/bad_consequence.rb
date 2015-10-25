#Clase BadConsequence para el mal rollo
#Auror: Javier Aranda Izquierdo

class BadConsequence



  def initialize(text,levels, nVisibleTreasures, nHiddenTreasures,
    specificVisibleTreasure,specificHiddenTreasure, death)
  
    @text=text  #Mensaje del mal rollo
    @levels=levels # Niveles que pierdes
    @nVisibleTreasures=nVisibleTreasures #Tesoros visibles
    @nHiddenTreasures=nHiddenTreasures  #Tesoros ocultos
    @specificVisibleTreasure=specificVisibleTreasure # Tesoro especifico visible
    @specificHiddenTreasure=specificHiddenTreasure  # Tesoro especidico oculto
    @death=death  #Muerte o no del jugador (vuelve a estado inicial)
  end

private_class_method:new

# Funcion que llama al constructor para los que pierden tesoros visibles u ocultos
def self.newLevelNomberOfTreasures (text,levels,nVisibleTreasure,nHiddenTreasure)
  
  new(text, levels,nVisibleTreasure,nHiddenTreasure,0,0,false)
  
end

# Funcion que llama al constructor para los que especifican los tesoros que se pierden
def self.newLevelSpecificTreasures(text, levels, specificVisibleTreasure, specificHiddenTreasure)

  new(text, levels, 0, 0,specificVisibleTreasure,specificHiddenTreasure,false)

end

# Funcion que llama al constructor para los que mueren
def self.newDeath(text)

new(text,0,0,0,0,true)
  
end
 #Conusltores basicos
 attr_accesor:text
 attr_accesor:levels
 attr_accesor:nVisibleTreasure
 attr_accesor:nHiddenTreasure
 attr_accesor:specificVisibleTreasure
 attr_accesor:specificHiddenTreasure
 attr_accesor:death
 
del to_s
"Texto: #{@text} \nNiveles perdidos: #{levels} \nNumero de Tesoros visibles perdidos: 
#{nVisibleTreasures} \nNumero de tesoros ocultos perdidos: #{nHiddenTreasures}
\nTipo de tesoro visible perdido: #{specificVisibleTreasure}
\nTipo de tesoro oculto perdido: #{specificHiddenTreasure}
\El jugador muere: #{death}" 
end
