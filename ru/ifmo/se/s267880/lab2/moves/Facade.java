package ru.ifmo.se.s267880.lab2.moves;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
  public Facade() {
    super(Type.NORMAL, 70, 1);
  }

  @Override
  protected String describe() {
    return "Power doubles if user is burned, paralyzed, or poisoned.";
  }

  @Override
  protected double calcBaseDamage(Pokemon att, Pokemon def) {
    double dam = super.calcBaseDamage(att, def);
    Status defSt = def.getCondition();
    if (defSt == Status.BURN || defSt == Status.PARALYZE || defSt == Status.POISON) {
      dam *= 2;
    }
    return dam;
  }
}
