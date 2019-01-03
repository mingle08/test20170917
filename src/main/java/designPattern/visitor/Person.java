package designPattern.visitor;

abstract class Person {
    public abstract void accept(Visitor state);
}
