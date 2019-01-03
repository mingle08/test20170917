package algo.designPattern.visitor;

public class Man extends Person {
    @Override
    public void accept(Visitor state){
        state.getManConclusion(this);
    }
}
