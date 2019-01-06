package TIJ4source.typeinfo;//: typeinfo/Position.java

import TIJ4source.initialization.Person;

class Position {
  private String title;
  private TIJ4source.initialization.Person person;
  public Position(String jobTitle, TIJ4source.initialization.Person employee) {
    title = jobTitle;
    person = employee;
    if(person == null)
      person = TIJ4source.initialization.Person.NULL;
  }
  public Position(String jobTitle) {
    title = jobTitle;
    person = TIJ4source.initialization.Person.NULL;
  }	
  public String getTitle() { return title; }
  public void setTitle(String newTitle) {
    title = newTitle;
  }
  public TIJ4source.initialization.Person getPerson() { return person; }
  public void setPerson(TIJ4source.initialization.Person newPerson) {
    person = newPerson;
    if(person == null)
      person = TIJ4source.initialization.Person.NULL;
  }
  public String toString() {
    return "Position: " + title + " " + person;
  }
} ///:~
