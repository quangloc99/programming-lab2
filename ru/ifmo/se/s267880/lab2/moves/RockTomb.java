package ru.ifmo.se.s267880.lab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class RockTomb extends PhysicalMove {
  public RockTomb() {
    super(Type.ROCK, 60, 0.95);
  }

  @Override
  protected String describe() {
    return "Rock Tomb: Has a 100% chance to lower the target's Speed by one stage";
  }

  @Override
  protected void applyOppEffects(Pokemon opp) {
    opp.setMod(Stat.SPEED, -1);
  }
}
