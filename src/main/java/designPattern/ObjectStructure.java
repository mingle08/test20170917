package algo.designPattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Person> list = new ArrayList<Person>();

    public void addPerson(Person person){
        list.add(person);
    }

    public boolean deletePerson(Person person){
        boolean flag = list.remove(person);
        return flag;
    }

    public void display(Visitor state){
        for (Person p : list){
            p.accept(state);
        }
    }
}
