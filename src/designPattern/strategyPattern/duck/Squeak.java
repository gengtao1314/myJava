package designPattern.strategyPattern.duck;

/**
 * Created by gengtao on 2019/6/29.
 * 定义吱吱叫的叫声
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I call with Squeak");
    }
}
