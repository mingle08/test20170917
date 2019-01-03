package algo.designPattern.visitor;

public class Love extends Visitor {
    @Override
    public void getManConclusion(Man man){
        System.out.println("当男人恋爱时，凡事不懂也要装懂！");
    }

    @Override
    public void getWomanConclusion(Woman man){
        System.out.println("当女人恋爱时，遇事懂也装作不懂！");
    }
}
