package Players.Fighters.Weapons;

import Enemy.Enemy;
import behaviours.IWeapon;

public class Axe implements IWeapon {




    public void attack(Enemy enemy) {
        enemy.takeDamage(30);
    }
}
