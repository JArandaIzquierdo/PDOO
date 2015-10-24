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
monsters << Monster.new("El gorrón en el umbral",10,price,badConsequence)

# 3 Byakhees de bonanza
price = Prize.new(2,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Pierdes tu armadura
visible y otra oculta",0 , [TreasureKind::ARMOR], [TreasureKind::ARMOR])
monsters << Monster.new("3 Byakhees de bonanza",8,price,badConsequence)

# El sopor de Dunwich
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("El primordial bostezo
contagioso. Pierdes el calzado visible",0 , [TreasureKind::SHOES], 0)
monsters << Monster.new("El sopor de Dunwich",2,price,badConsequence)

# H.P. Munchcraft
price = Prize.new(2,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Pierdes la armadura
visible",0 , [TreasureKind::ARMOR], 0)
monsters << Monster.new("H.P. Munchcraft",6,price,badConsequence)

# La que redacta en las tinieblas
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Toses los pulmones y
pierdes 2 niveles.",2 , 0, 0)
monsters << Monster.new("La que redacta en las tinieblas",2,price,badConsequence)

# Semillas Cthulhu
price = Prize.new(2,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Pierdes 2 niveles y 2
tesoros ocultos.",2 , 0, 2)
monsters << Monster.new("Semillas Cthulhu",4,price,badConsequence)

# Semillas Cthulhu
price = Prize.new(2,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Pierdes 2 niveles y 2
tesoros ocultos.",2 , 0, 2)
monsters << Monster.new("Semillas Cthulhu",4,price,badConsequence)

# Yskhtihyssg-Goth
price = Prize.new(3,1)
badConsequence = BadConsequence.newDeath("No le hace gracia que
pronuncien mal su nombre. Estas muerto")
monsters << Monster.new("Yskhtihyssg-Goth",12,price,badConsequence)

# El espia
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Te asusta en la noche.
Pierdes un casco visible.", 0, [TreasureKind::HELMET],0)
monsters << Monster.new("El espia",5,price,badConsequence)

# El Lenguas
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelNumberOfTreasures("Menudo susto te llevas.
Pierdes 2 niveles y 5 tesoros visibles.", 2, 5,0)
monsters << Monster.new("El Lenguas",20,price,badConsequence)

# Dameargo
price = Prize.new(1,1)
badConsequence = BadConsequence.newLevelSpecificTreasures("Te intentas escaquear.
Pierdes una mano visible.", 0, [TreasureKind::ONEHAND],0)
monsters << Monster.new("Dameargo",20,price,badConsequence)