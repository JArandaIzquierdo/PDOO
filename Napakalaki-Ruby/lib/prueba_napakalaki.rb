#!/usr/bin/env ruby
# encoding: utf-8
# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative "bad_consequence"
require_relative "prize"
require_relative "monster"
require_relative "treasure_kind"

monsters = Array.new  # Array de monstruos

# CREACIÓN DE LOS MONSTRUOS

# El gorrón en el umbral
price = Prize.new(3,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Pierdes todos tus tesoros
visibles",100 , 0, 0)
monsters << Monster.new("El gorrón en el umbral",10,badConsequence,price)

# 3 Byakhees de bonanza
price = Prize.new(2,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Pierdes tu armadura
visible y otra oculta",0 , [TreasureKind::ARMOR], [TreasureKind::ARMOR])
monsters << Monster.new("3 Byakhees de bonanza",8,badConsequence,price)

# El sopor de Dunwich
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("El primordial bostezo
contagioso. Pierdes el calzado visible",0 , [TreasureKind::SHOES], 0)
monsters << Monster.new("El sopor de Dunwich",2,badConsequence,price)

# H.P. Munchcraft
price = Prize.new(2,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Pierdes la armadura
visible",0 , [TreasureKind::ARMOR], 0)
monsters << Monster.new("H.P. Munchcraft",6,badConsequence,price)

# La que redacta en las tinieblas
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Toses los pulmones y
pierdes 2 niveles.",2 , 0, 0)
monsters << Monster.new("La que redacta en las tinieblas",2,badConsequence,price)

# Semillas Cthulhu
price = Prize.new(2,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Pierdes 2 niveles y 2
tesoros ocultos.",2 , 0, 2)
monsters << Monster.new("Semillas Cthulhu",4,badConsequence,price)

# Semillas Cthulhu
price = Prize.new(2,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Pierdes 2 niveles y 2
tesoros ocultos.",2 , 0, 2)
monsters << Monster.new("Semillas Cthulhu",4,badConsequence,price)

# Yskhtihyssg-Goth
price = Prize.new(3,1)
badConsequence = BadConsequence.newDeath("No le hace gracia que
pronuncien mal su nombre. Estas muerto")
monsters << Monster.new("Yskhtihyssg-Goth",12,badConsequence,price)

# El espia
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Te asusta en la noche.
Pierdes un casco visible.", 0, [TreasureKind::HELMET],0)
monsters << Monster.new("El espia",5,badConsequence,price)

# El Lenguas
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Menudo susto te llevas.
Pierdes 2 niveles y 5 tesoros visibles.", 2, 5,0)
monsters << Monster.new("El Lenguas",20,badConsequence,price)

# Dameargo
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Te intentas escaquear.
Pierdes una mano visible.", 0, [TreasureKind::ONEHAND],0)
monsters << Monster.new("Dameargo",20,badConsequence,price)


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

# Monstruos que tengan un mal rollo que suponga la pérdida de un 
# determinado tipo de tesoros ya sea visibles y/o ocultos.
puts "Monstruos que tengan un mal rollo que suponga la pérdida de un
determinado tipo de tesoros ya sea visibles y/o ocultos."
puts  #Salto de línea

for m in monsters
  if m.LoseSpecificTreasures
    puts m.to_s
    puts m.price.to_s
    puts m.bc.to_s
    puts #Salto de línea
  end
end