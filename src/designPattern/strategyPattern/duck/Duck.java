package designPattern.strategyPattern.duck;

/**
 * Created by gengtao on 2019/6/29.
 * 定义鸭子的基础类，拥有FlyBehavior和QuackBehavior两个成员变量
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }
    //定义performFly() 和 performQuack()来执行fly()和quack()方法
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }

    //定义set方法来动态改变flyBehavior 和 quackBehavior
    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
