package ru.ifmo.se.s267880.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class EarthPower extends SpecialMove {
  public EarthPower() {
    super(Type.GROUND, 90, 1);
  }

  @Override
  protected String describe() {
    return "Has a 10% chance to lower the target's Special Defense by one stage.";
  }

  @Override
  protected void applyOppEffects(Pokemon opp) {
    if (Math.random() < 0.1) opp.setMod(Stat.SPECIAL_DEFENSE, -1);
  }
}
