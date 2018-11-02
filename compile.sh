echo compiling 
javac -classpath Pokemon.jar -d . \
  ru/ifmo/se/s267880/lab2/moves/*.java \
  ru/ifmo/se/s267880/lab2/pokemons/*.java \
  ru/ifmo/se/s267880/lab2/IWannaBeTheVeryBest.java \

echo packing
jar vcfe Lab2.jar ru.ifmo.se.s267880.lab2.IWannaBeTheVeryBest \
  ru/ifmo/se/s267880/lab2/moves/*.class \
  ru/ifmo/se/s267880/lab2/pokemons/*.class \
  ru/ifmo/se/s267880/lab2/IWannaBeTheVeryBest.class \


