package designPattern.strategyPattern.duck;

/**
 * Created by gengtao on 2019/6/29.
 */
public class Test {
    public static void main(String[] args) {
        Duck redHeardDuck = new RedHeadDuck();
        redHeardDuck.performFly();
        redHeardDuck.performQuack();

        //动态改变飞行方式
        redHeardDuck.setFlyBehavior(new FlyNoWay());
        redHeardDuck.performFly();
    }
}
