package ru.ifmo.se.s267880.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Coil extends StatusMove {
  public Coil() {
    super(Type.POISON, 0, 1);
  }

  @Override
  protected String describe() {
    // yep, strong one
    return "Raises the user's Attack, Defense, and accuracy by one stage each.";
  }

  @Override
  protected boolean checkAccuracy(Pokemon att, Pokemon def) {
    return true;
  }

  @Override
  protected void applySelfEffects(Pokemon self) {
    self.setMod(Stat.ATTACK, 1);
    self.setMod(Stat.DEFENSE, 1);
    self.setMod(Stat.ACCURACY, 1);
  }
}
