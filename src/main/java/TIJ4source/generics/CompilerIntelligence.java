package TIJ4source.generics;//: generics/CompilerIntelligence.java
import TIJ4source.initialization.Apple;

import java.util.*;

public class CompilerIntelligence {
  public static void main(String[] args) {
    List<? extends Fruit> flist =
      Arrays.asList(new TIJ4source.initialization.Apple());
    TIJ4source.initialization.Apple a = (TIJ4source.initialization.Apple)flist.get(0); // No warning
    flist.contains(new TIJ4source.initialization.Apple()); // Argument is 'Object'
    flist.indexOf(new TIJ4source.initialization.Apple()); // Argument is 'Object'
  }
} ///:~
