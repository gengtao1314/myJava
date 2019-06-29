package designPattern.strategyPattern.duck;

/**
 * Created by gengtao on 2019/6/29.
 * 定义一个使用翅膀的飞行方式
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly with wings");
    }
}
