package ru.ifmo.se.s267880.lab2.pokemons;

import ru.ifmo.se.s267880.lab2.pokemons.Litwick;
import ru.ifmo.se.s267880.lab2.moves.NightShade;

public class Lampent extends Litwick {
  public Lampent(String name) {
    this(name, 13);
  }

  public Lampent(String name, int level) {
    super(name, level);
    if (level >= 13) addMove(new NightShade());
  }
}
