package ru.ifmo.se.s267880.lab2;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.s267880.lab2.pokemons.*;

public class IWannaBeTheVeryBest {
  public static void main(String[] args) {
    String names[] = {
      "Pankratiy Andrei",
      "Maryana Uliana",
      "Dorofei Anisim",
      "Sveta Igor",
      "Diana Gavriil",
      "Yuliy Vitaliya",
    };
    Battle bt = new Battle();
    bt.addAlly(new Sentret(names[2]));
    bt.addAlly(new Lampent(names[0]));
    bt.addAlly(new Landorus(names[5]));
    bt.addFoe(new Furret(names[3]));
    bt.addFoe(new Litwick(names[4]));
    bt.addFoe(new Chandelure(names[1]));
    bt.go();
  }
}
