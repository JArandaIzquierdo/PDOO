# # Clase para hacer las pruebas del juego
# Autores: Javier Aranda Izquierdo
#          Carlos 

require_relative "bad_consequence"
require_relative "prize"
require_relative "monster"
require_relative "treasure_kind"

monsters = Array.new  # Array de monstruos
handTreasures = Array.new  #Array para los terosoros de las manos de Bicefalo
handTreasures << [TreasureKind::BOTHHANDS,TreasureKind::ONEHAND,TreasureKind::ONEHAND]

# CREACION DE LOS MONSTRUOS

# El gorron en el umbral
prize = Prize.new(3,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Pierdes todos tus tesoros
visibles",100 , 0, 0)
monsters << Monster.new("El gorron en el umbral",10,badConsequence,prize)

# 3 Byakhees de bonanza
prize = Prize.new(2,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Pierdes tu armadura
visible y otra oculta",0 , [TreasureKind::ARMOR], [TreasureKind::ARMOR])
monsters << Monster.new("3 Byakhees de bonanza",8,badConsequence,prize)

# El sopor de Dunwich
prize = Prize.new(1,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("El primordial bostezo
contagioso. Pierdes el calzado visible",0 , [TreasureKind::SHOES], 0)
monsters << Monster.new("El sopor de Dunwich",2,badConsequence,prize)

# H.P. Munchcraft
prize = Prize.new(2,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Pierdes la armadura
visible",0 , [TreasureKind::ARMOR], 0)
monsters << Monster.new("H.P. Munchcraft",6,badConsequence,prize)

# La que redacta en las tinieblas
prize = Prize.new(1,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Toses los pulmones y
pierdes 2 niveles.",2 , 0, 0)
monsters << Monster.new("La que redacta en las tinieblas",2,badConsequence,prize)

# Semillas Cthulhu
prize = Prize.new(2,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Pierdes 2 niveles y 2
tesoros ocultos.",2 , 0, 2)
monsters << Monster.new("Semillas Cthulhu",4,badConsequence,prize)

# Semillas Cthulhu
prize = Prize.new(2,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Pierdes 2 niveles y 2
tesoros ocultos.",2 , 0, 2)
monsters << Monster.new("Semillas Cthulhu",4,badConsequence,prize)

# Yskhtihyssg-Goth
prize = Prize.new(3,1)
badConsequence = BadConsequence.newDeath("No le hace gracia que
pronuncien mal su nombre. Estas muerto")
monsters << Monster.new("Yskhtihyssg-Goth",12,badConsequence,prize)

# El espia
prize = Prize.new(1,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Te asusta en la noche.
Pierdes un casco visible.", 0, [TreasureKind::HELMET],0)
monsters << Monster.new("El espia",5,badConsequence,prize)

# El Lenguas
prize = Prize.new(1,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Menudo susto te llevas.
Pierdes 2 niveles y 5 tesoros visibles.", 2, 5,0)
monsters << Monster.new("El Lenguas",20,badConsequence,prize)

# Dameargo
prize = Prize.new(1,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Te intentas escaquear.
Pierdes una mano visible.", 0, [TreasureKind::ONEHAND],0)
monsters << Monster.new("Dameargo",20,badConsequence,prize)

# El rey de rosa
prize= Prize.new(4,2)
badConsequence= BadConsequence.newLevelNumberOfTreasures("Pierdes 5 niveles y 3
 tesoros visibles ", 5, 3, 0)
monsters << Monster.new("El rey de Rosa", 13, badConsequence, prize)

# Chibithulhu
prize= Prize.new(1,1)
badConsequence= BadConsequence.newLevelSpecificTreasures("Embobados con el lindo
 primigenio te descartas de tu casco visible", 0, [TreasureKind::HELMET],0)
monsters << Monster.new("Chibithulhu", 2, badConsequence, prize)

# Pollipolipo volante
prize= Prize.new(1,1)
badConsequence= BadConsequence.newLevelNumberOfTreasures("Da mucho asquito.
  Pierde 3 niveles", 3, 0, 0)
monsters << Monster.new("Pillipolipo volante", 3, badConsequence, prize)

# Bichgooth
prize= Prize.new(1,1)
badConsequence= BadConsequence.newLevelSpecificTreasures("Sientes bichos bajo la
 ropa. Descarta la armadura visible", 0, [TreasureKind::ARMOR],0)
monsters << Monster.new("Bichgooth", 2, badConsequence, prize)

# Angeles de la noche ibicenca
prize= Prize.new(4,1)
badConsequence= BadConsequence.newLevelSpecificTreasures("Te atrapan para llevarte
 de fiesta y te dejan caer en mitad del vuelo. Descarta 1 mano visible y 1 mano
 oculta", 0, [TreasureKind::ONEHAND], [TreasureKind::ONEHAND])
monsters << Monster.new("Angeles de la noche ibicenca",14, badConsequence, prize)

# Familia Feliz
prize= Prize.new(4, 1)
badConsequence= BadConsequence.newDeath("La familia te atrapa. Estas muerto")
monsters << Monster.new("Familia Feliz", 1, badConsequence, prize)

# Los Hondos
prize= Prize.new(2,1)
badConsequence= BadConsequence.newDeath("Estos monstruos resultan bastante
 superficiales y te aburren mortalmente. Estas muerto")
monsters << Monster.new("Los hondos", 8, badConsequence, prize)

# Roboggoth
prize= Prize.new(2,1)
badConsequence= BadConsequence.newLevelSpecificTreasures("La quinta directiva 
primaria te obliga a perder 2 niveles y un tesoro 2 manos visible",
  2, [TreasureKind::BOTHHANDS], 0)
monsters << Monster.new("Roboggoth", 8, badConsequence, prize)

# Bicefalo
prize= Prize.new(1,1)
badConsequence= BadConsequence.newLevelSpecificTreasures("Te faltan manos para 
tanta cabeza. Pierdes 3 niveles y tus tesoros visibles de las manos.",
  3, handTreasures, 0)
monsters << Monster.new("Bicefalo", 20 , badConsequence, prize)


# CONSULTAS
# Monstruos cuyo nivel de combate supera a 10
puts "Monstruos cuyo nivel de combate supera a 10"
puts  #Salto de línea

for m in monsters
  if m.LevelExceeding10
    puts m.to_s
  end
end

puts  #Salto de línea

# Monstruos cuyo mal rollo solo implica perdida de niveles
puts "Monstruos cuyo mal rollo solo implica perdida de niveles"
puts  #Salto de línea

for m in monsters
  if m.OnlyLevelsBadConsequence
    puts m.to_s
  end
end

puts #Salto de línea

# Monstruos que tengan un buen rollo que indique una ganancia de niveles superior a 1.
puts "Monstruos que tengan un buen rollo que indique una ganancia de niveles superior a 1"
puts  #Salto de línea

for m in monsters
  if m.PrizeLevelsExceeding1
    puts m.to_s
  end
end

# Monstruos que tengan un mal rollo que suponga la perdida de un 
# determinado tipo de tesoros ya sea visibles y/o ocultos.
puts "Monstruos que tengan un mal rollo que suponga la perdida de un
determinado tipo de tesoros ya sea visibles y/o ocultos."
puts  #Salto de línea

for m in monsters
  if m.LoseSpecificTreasures
    puts m.to_s
    puts m.price.to_s
    puts m.badConsequence.to_s
    puts #Salto de línea
  end
end

 #Array de Tesoros
  tesoros = Array.new
        
  #Creación de Tesoro ¡Sí mi amo!
  tesoros << Treasure.new("¡Si mi amo!", 0, 4,TreasureKind.HELMET)
        
  #Creación de Tesoro Capucha de Cthulhu
  tesoros << Treasure.new("Capucha de Cthulhu", 0, 3,TreasureKind.HELMET)
        
  #Creación de Tesoro Botas de lluvia acida
  tesoros << Treasure.new("Botas de lluvia acida", 0, 1,TreasureKind.BOTHHANDS)
        
  #Creación de Tesoro Ametralladora Thompson
  tesoros << Treasure.new("Ametralladora Thompson", 0, 4,TreasureKind.BOTHHANDS)
        
  #Creación de Tesoro Clavo de rail ferroviario
  tesoros << Treasure.new("Clavo de rail ferroviario", 0, 3,TreasureKind.ONEHAND)
        
  #Creación de Tesoro Fez alopodo
  tesoros << Treasure.new("Fez alopodo", 0, 3,TreasureKind.HELMET)    
        
  #Creación de Tesoro El aparato del Pr. Tesla
  tesoros << Treasure.new("El aparato del Pr. Tesla", 0, 4,TreasureKind.ARMOR)
        
  #Creación de Tesoro Insecticida
  tesoros << Treasure.new("Insecticida", 0, 2,TreasureKind.ONEHAND)   
        
  #Creación de Garabato mistico
  tesoros << Treasure.new("Insecticida", 0, 2,TreasureKind.ONEHAND)
        
  #Creación de Lanzallamas
  tesoros << Treasure.new("Lanzallamas", 0, 4,TreasureKind.BOTHHANDS)
        
  #Creación de Necronomicon
  tesoros << Treasure.new("Necronomicon", 0, 5,TreasureKind.BOTHHANDS)
        
  #Creación de Necro-gnomicon
  tesoros << Treasure.new("Necro-gnomicon", 0, 2,TreasureKind.ONEHAND)
        
  #Creación de Mazo de los antiguos
  tesoros << Treasure.new("Mazo de los antiguos", 0, 3,TreasureKind.ONEHAND)
        
  #Creación de Porra preternatural
  tesoros << Treasure.new("Porra preternatural", 0, 2,TreasureKind.ONEHAND)
        
  #Creación de Varita de atizamiento
  tesoros << Treasure.new("Varita de atizamiento", 0, 3,TreasureKind.ONEHAND)
        
  #Creación de Zapato deja-amigos
  tesoros << Treasure.new("Zapato deja-amigos", 0, 1,TreasureKind.SHOES)