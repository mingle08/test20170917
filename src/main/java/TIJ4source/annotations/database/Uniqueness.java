//: annotations/database/Uniqueness.java
// Sample of nested annotations
package TIJ4source.annotations.database;

public @interface Uniqueness {
  Constraints constraints()
    default @Constraints(unique=true);
} ///:~
