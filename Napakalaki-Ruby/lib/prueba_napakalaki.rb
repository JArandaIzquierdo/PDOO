# To change this license header, choose License Headers in Project Properties.
# To change this template file, choose Tools | Templates
# and open the template in the editor.

require_relative "bad_consequence"
require_relative "prize"
require_relative "monster"
require_relative "treasure_kind"

buen_rollo = Prize.new(2,7)
mal_rollo = BadConsequence.newDeath(true)
monstruo = Monster.new("Monstruo",100,mal_rollo,buen_rollo)



puts buen_rollo.to_s
puts mal_rollo.to_s
puts monstruo.to_s
