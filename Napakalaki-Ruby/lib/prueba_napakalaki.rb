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

