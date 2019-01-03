package designPattern.visitor;

/**
 * javac编译过程中，JavacCompiler相当于client
 * 
 * 抽象访问者（Visitor）:  State
 * 具体访问者（ConcreteVisitor）:  Success, Failure, Love, Marriage
 * 抽象节点元素（Element）:   Person
 * 具体节点元素（ConcreteElement）:   Man, Woman
 * 结构对象（ObjectStructure）：JCCompilationUnit，它持有整个 抽象语法树，它提供一个接口。客户端 调用 访问者 ，通过这个接口就能访问到 节点元素。
 * 客户端（Client）:  JavacCompiler
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
