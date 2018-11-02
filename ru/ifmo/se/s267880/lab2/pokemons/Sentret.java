package ru.ifmo.se.s267880.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.s267880.lab2.moves.Flamethrower;
import ru.ifmo.se.s267880.lab2.moves.DefenseCurl;
import ru.ifmo.se.s267880.lab2.moves.Scratch;

public class Sentret extends Pokemon {
  public Sentret(String name) {
    this(name, 4);
  }

  public Sentret(String name, int level) {
    super(name, level);
    setStats(35, 46, 34, 35, 45, 20);
    
    // moves learnt by using machine
    addMove(new Flamethrower());

    // no level require
    addMove(new Scratch());

    if (level >= 4) addMove(new DefenseCurl());
    
  }
}
