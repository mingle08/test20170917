package TIJ4source.generics;//: generics/SuperTypeWildcards.java
import TIJ4source.initialization.Apple;

import java.util.*;

public class SuperTypeWildcards {
  static void writeTo(List<? super TIJ4source.initialization.Apple> apples) {
    apples.add(new TIJ4source.initialization.Apple());
    apples.add(new Jonathan());
    // apples.add(new Fruit()); // Error
  }
} ///:~
