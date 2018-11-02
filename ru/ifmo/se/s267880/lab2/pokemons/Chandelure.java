package ru.ifmo.se.s267880.lab2.pokemons;

import ru.ifmo.se.s267880.lab2.pokemons.Lampent;
import ru.ifmo.se.s267880.lab2.moves.Psychic;

public class Chandelure extends Lampent {
  public Chandelure(String name) {
    this(name, 13);
  }
  public Chandelure(String name, int level) {
    super(name, level);

    setStats(60, 55, 90, 145, 90, 80);

    // move learnt by using machine
    addMove(new Psychic());
  }
}
