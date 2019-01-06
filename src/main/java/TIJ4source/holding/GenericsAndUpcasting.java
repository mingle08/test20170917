package TIJ4source.holding;//: holding/GenericsAndUpcasting.java
import TIJ4source.initialization.Apple;

import java.util.*;

class GrannySmith extends TIJ4source.initialization.Apple {}
class Gala extends TIJ4source.initialization.Apple {}
class Fuji extends TIJ4source.initialization.Apple {}
class Braeburn extends TIJ4source.initialization.Apple {}

public class GenericsAndUpcasting {
  public static void main(String[] args) {
    ArrayList<TIJ4source.initialization.Apple> apples = new ArrayList<TIJ4source.initialization.Apple>();
    apples.add(new GrannySmith());
    apples.add(new Gala());
    apples.add(new Fuji());
    apples.add(new Braeburn());
    for(TIJ4source.initialization.Apple c : apples)
      System.out.println(c);
  }
} /* Output: (Sample)
GrannySmith@7d772e
Gala@11b86e7
Fuji@35ce36
Braeburn@757aef
*///:~
