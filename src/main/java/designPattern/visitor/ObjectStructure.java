package designPattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * javac编译过程中，JCCompilationUnit相当于结构对象，持有整个语法树
 */
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
