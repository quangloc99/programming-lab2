package ru.ifmo.se.s267880.lab2.moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class NightShade extends SpecialMove {
  public NightShade() {
    super(Type.GHOST, -1, 1);
  }

  @Override
  protected String describe() {
    return "Night Shade: Inflicts damage equal to the user's level";
  }

  @Override
  protected double calcBaseDamage(Pokemon atk, Pokemon def) {
    return atk.getLevel();
  }
}
