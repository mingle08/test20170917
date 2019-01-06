package TIJ4source.generics;//: generics/LimitsOfInference.java
import TIJ4source.typeinfo.Person;
import typeinfo.pets.*;
import java.util.*;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~
