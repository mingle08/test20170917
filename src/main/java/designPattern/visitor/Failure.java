package designPattern.visitor;

public class Failure extends Visitor {
    @Override
    public void getManConclusion(Man man){
        System.out.println("当男人失败时，闷头喝酒不用劝！");
    }

    @Override
    public void getWomanConclusion(Woman man){
        System.out.println("当女人失败时，眼泪汪汪谁也劝不了！");
    }
}
