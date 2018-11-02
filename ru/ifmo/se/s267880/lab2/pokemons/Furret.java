package ru.ifmo.se.s267880.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.s267880.lab2.pokemons.Sentret;
import ru.ifmo.se.s267880.lab2.moves.Coil;

public class Furret extends Sentret {
  public Furret(String name) {
    this(name, 4);
  }

  public Furret(String name, int level) {
    super(name, level);
    setStats(85, 76, 64, 45, 55, 90);
    
    // no level required
    addMove(new Coil());
  }
}


