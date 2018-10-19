package ru.ifmo.se.s267880.lab2.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DreamEater extends SpecialMove {
  public DreamEater() {
    super(Type.PSYCHIC, 100, 1);
  }

  @Override
  protected String describe() {
    return "Dream Eater only works if the target is asleep. Dream Eater inflicts damage and 50% of the damage dealt (rounded up) is restored to the user as HP.";
  }

  @Override
  protected double calcBaseDamage(Pokemon att, Pokemon def) {
    if (def.getCondition() == Status.SLEEP) {
      return super.calcBaseDamage(att, def);
    }
    return 0;
  } 

  @Override
  protected void applySelfDamage(Pokemon self, double dam) {
    self.setMod(Stat.HP, (int)Math.ceil(dam / 2));
  }
}

