package Players.Mages.Defenders;

import Enemy.Enemy;
import behaviours.IDefender;

public class Ogre implements IDefender {
    private int damageValue;

    public Ogre(int damageValue) {
        this.damageValue = damageValue;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(damageValue);
    }
}
