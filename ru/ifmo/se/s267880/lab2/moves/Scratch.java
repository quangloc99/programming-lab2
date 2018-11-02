package ru.ifmo.se.s267880.lab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Scratch extends PhysicalMove {
  public Scratch() {
    super(Type.NORMAL, 40, 1);
  }

  @Override
  protected String describe() {
    return "Scratch: Inflicts regular damage with no additional effect";
  }
}
