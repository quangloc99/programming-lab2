package ru.ifmo.se.s267880.lab2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Flamethrower extends SpecialMove {
  public Flamethrower() {
    super(Type.FIRE, 90, 1);
  }

  @Override
  protected String describe() {
    return "Has a 10% chance to burn the target.";
  }

  @Override
  protected void applyOppEffects(Pokemon opp) {
    if (Math.random() < 0.1) Effect.burn(opp);
  }
}
