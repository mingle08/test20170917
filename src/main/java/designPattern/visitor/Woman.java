package designPattern.visitor;

public class Woman extends Person {
    @Override
    public void accept(Visitor state){
        state.getWomanConclusion(this);
    }
}
