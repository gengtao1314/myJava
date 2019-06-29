package designPattern.strategyPattern.game;

/**
 * Created by gengtao on 2019/6/29.
 * 使用弓箭
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I use bowAndArrow");
    }
}
