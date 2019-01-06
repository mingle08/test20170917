package TIJ4source.holding;//: holding/ApplesAndOrangesWithGenerics.java
import TIJ4source.initialization.Apple;

import java.util.*;

public class ApplesAndOrangesWithGenerics {
  public static void main(String[] args) {
    ArrayList<TIJ4source.initialization.Apple> apples = new ArrayList<TIJ4source.initialization.Apple>();
    for(int i = 0; i < 3; i++)
      apples.add(new TIJ4source.initialization.Apple());
    // Compile-time error:
    // apples.add(new Orange());
    for(int i = 0; i < apples.size(); i++)
      System.out.println(apples.get(i).id());
    // Using foreach:
    for(TIJ4source.initialization.Apple c : apples)
      System.out.println(c.id());
  }
} /* Output:
0
1
2
0
1
2
*///:~
