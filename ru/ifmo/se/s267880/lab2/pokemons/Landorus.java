package ru.ifmo.se.s267880.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.s267880.lab2.moves.Facade;
import ru.ifmo.se.s267880.lab2.moves.FocusBlast;
import ru.ifmo.se.s267880.lab2.moves.RockTomb;
import ru.ifmo.se.s267880.lab2.moves.EarthPower;

public class Landorus extends Pokemon {
  public Landorus(String name) {
    this(name, 43); // required level
  }

  public Landorus(String name, int level) {
    super(name, level);
    setStats(89, 125, 90, 115, 80, 101);
    
    // Moves learnt by machine
    addMove(new Facade());
    addMove(new FocusBlast());

    // this move and be learnt using machine or pokemon is at the level 0
    addMove(new RockTomb());

    if (level >= 43) {
      // actually this move can be taught by an NPC anytime :v
      addMove(new EarthPower());
    }
  }
}
