package designPattern.strategyPattern.duck;

/**
 * Created by gengtao on 2019/6/29.
 * 定义一只红头鸭
 */
public class RedHeadDuck extends Duck{
    //初始化飞行方式和叫声方式
    public RedHeadDuck(){
        flyBehavior = new FlyWithWings(); //使用翅膀飞行
        quackBehavior = new Quack(); //叫声方式为嘎嘎叫
    }
}
