package ru.ifmo.se.s267880.lab2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FireBlast extends SpecialMove {
  public FireBlast() {
    super(Type.FIRE, 110, 0.85);
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
