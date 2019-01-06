package TIJ4source.generics;//: generics/GenericWriting.java
import TIJ4source.initialization.Apple;

import java.util.*;

public class GenericWriting {
  static <T> void writeExact(List<T> list, T item) {
    list.add(item);
  }
  static List<TIJ4source.initialization.Apple> apples = new ArrayList<TIJ4source.initialization.Apple>();
  static List<Fruit> fruit = new ArrayList<Fruit>();
  static void f1() {
    writeExact(apples, new TIJ4source.initialization.Apple());
    // writeExact(fruit, new Apple()); // Error:
    // Incompatible types: found Fruit, required Apple
  }
  static <T> void
  writeWithWildcard(List<? super T> list, T item) {
    list.add(item);
  }	
  static void f2() {
    writeWithWildcard(apples, new TIJ4source.initialization.Apple());
    writeWithWildcard(fruit, new TIJ4source.initialization.Apple());
  }
  public static void main(String[] args) { f1(); f2(); }
} ///:~
