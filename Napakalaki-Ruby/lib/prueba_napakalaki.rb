# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative "bad_consequence"
require_relative "prize"
require_relative "monster"

buen_rollo = Prize.new(2,7)
mal_rollo = BadConsequence.new("Pringao",10,2,3)
cortijo = Monster.new("Cortijo",100,mal_rollo,buen_rollo)


puts "Prueba Prize:"
puts buen_rollo
puts "Prueba BadConsequence:"
puts mal_rollo
puts "Prueba Monstruo"
puts cortijo
