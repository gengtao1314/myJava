package designPattern.strategyPattern.game;

/**
 * Created by gengtao on 2019/6/29.
 */
public class Test {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();

        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
    }
}
