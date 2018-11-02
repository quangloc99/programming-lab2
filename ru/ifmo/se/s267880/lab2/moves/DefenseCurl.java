package ru.ifmo.se.s267880.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DefenseCurl extends StatusMove {
  public DefenseCurl() {
    super(Type.NORMAL, 0, 1);
  }

  @Override
  protected String describe() {
    return "DefenseCurl: Raises user's Defense by one stage";
  }

  @Override
  protected boolean checkAccuracy(Pokemon att, Pokemon def) {
    return true;
  }

  @Override
  protected void applySelfEffects(Pokemon self) {
    self.setMod(Stat.DEFENSE, 1);
  }
}
