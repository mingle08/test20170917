package designPattern.visitor;

public class Marriage extends Visitor {
    @Override
    public void getManConclusion(Man man){
        System.out.println("当男人结婚时，感慨道：恋爱游戏终结时，‘有妻徒刑’遥无期。");
    }

    @Override
    public void getWomanConclusion(Woman man){
        System.out.println("当女人结婚时，欣慰道：爱情长跑路漫漫，婚姻保险保平安。");
    }
}
