package designPattern.strategyPattern.game;

/**
 * Created by gengtao on 2019/6/29.
 * 角色类
 */
public abstract class Character {
    WeaponBehavior weaponBehavior;
    public Character(){

    }
    public void fight(){
        weaponBehavior.useWeapon();
    }
    public void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
}
