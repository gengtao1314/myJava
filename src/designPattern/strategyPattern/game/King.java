package designPattern.strategyPattern.game;

/**
 * Created by gengtao on 2019/6/29.
 */
public class King extends Character {
    public King(){
        weaponBehavior = new BowAndArrowBehavior();
    }
}
