package designPattern.visitor;

/**
 * javac编译过程中，JavacCompiler相当于client
 */
public class client {
    public static void main(String[] args){
        ObjectStructure obj = new ObjectStructure();
        obj.addPerson(new Man());
        obj.addPerson(new Woman());
        Marriage marriage = new Marriage();
        Success suc = new Success();
        obj.display(marriage);
        obj.display(suc);
    }

}
