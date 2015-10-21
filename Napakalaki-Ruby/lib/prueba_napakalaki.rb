# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative "bad_consequence"
require_relative "prize"
require_relative "monster"

buen_rollo = Prize.new(2,7)
mal_rollo = BadConsequence.new("Pringao",10,2,3,Array.new,Array.new,false)
monstruo = Monster.new("Monstruo",100,mal_rollo,buen_rollo)


puts "Prueba Prize:"
print buen_rollo.treasures," "
puts buen_rollo.level
puts "Prueba BadConsequence:"
puts mal_rollo.text
puts "Prueba Monstruo"
puts monstruo.combatLevel
