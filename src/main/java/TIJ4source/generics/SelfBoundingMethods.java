package TIJ4source.generics;//: generics/SelfBoundingMethods.java

import TIJ4source.initialization.A;

public class SelfBoundingMethods {
  static <T extends SelfBounded<T>> T f(T arg) {
    return arg.set(arg).get();
  }
  public static void main(String[] args) {
    TIJ4source.initialization.A a = f(new TIJ4source.initialization.A());
  }
} ///:~
