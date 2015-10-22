# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative "bad_consequence"
require_relative "prize"
require_relative "monster"
require_relative "treasure_kind"

buen_rollo = Prize.new(2,7)
mal_rollo = BadConsequence.new("Pringao",10,2,3,Array.new,Array.new,false)
monstruo = Monster.new("Monstruo",100,mal_rollo,buen_rollo)


puts "Prueba Prize:"
print buen_rollo.treasures," "
puts buen_rollo.level
puts "Prueba BadConsequence:"
print mal_rollo.text, " ", mal_rollo.levels," ", mal_rollo.nVisibleTreasures," ", mal_rollo.nHiddenTreasures," "
puts mal_rollo.death
puts "Prueba Monstruo"
print monstruo.name," ", monstruo.combatLevel
