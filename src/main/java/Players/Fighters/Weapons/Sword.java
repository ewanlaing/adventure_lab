package Players.Fighters.Weapons;

import Enemy.Enemy;
import behaviours.IWeapon;

public class Sword implements IWeapon {
    public void attack(Enemy enemy) {
        enemy.takeDamage(25);
    }
}
