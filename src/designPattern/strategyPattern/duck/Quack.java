package designPattern.strategyPattern.duck;

/**
 * Created by gengtao on 2019/6/29.
 * 定义嘎嘎叫的叫声
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I call with quack");
    }
}
