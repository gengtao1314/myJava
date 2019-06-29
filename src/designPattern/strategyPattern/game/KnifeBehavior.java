package designPattern.strategyPattern.game;

/**
 * Created by gengtao on 2019/6/29.
 * 使用匕首
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I use knife");
    }
}
