package TIJ4source.generics;//: generics/NonCovariantGenerics.java
// {CompileTimeError} (Won't compile)
import TIJ4source.initialization.Apple;

import java.util.*;

public class NonCovariantGenerics {
  // Compile Error: incompatible types:
  List<Fruit> flist = new ArrayList<TIJ4source.initialization.Apple>();
} ///:~
