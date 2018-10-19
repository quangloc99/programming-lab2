package ru.ifmo.se.s267880.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.s267880.lab2.moves.DreamEater;
import ru.ifmo.se.s267880.lab2.moves.FireBlast;

public class Litwick extends Pokemon {
  public Litwick(String name) {
    this(name, 1); // required level
  }

  public Litwick(String name, int level) {
    super(name, level);
    
    // moves learnt by using machines
    addMove(new DreamEater());
    addMove(new FireBlast());
  }
}
