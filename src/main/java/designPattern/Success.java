package algo.designPattern.visitor;

public class Success extends Visitor {
    @Override
    public void getManConclusion(Man man){
        System.out.println("当男人成功时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman man){
        System.out.println("当女人成功时，背后大多有一个不成功的男人");
    }
}
