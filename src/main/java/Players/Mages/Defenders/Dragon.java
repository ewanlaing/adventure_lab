package Players.Mages.Defenders;

import Enemy.Enemy;
import behaviours.IDefender;

public class Dragon implements IDefender {
    private int damageValue;

    public Dragon(int damageValue) {
        this.damageValue = damageValue;
    }

    public void defend(Enemy enemy) {
        enemy.takeDamage(this.damageValue);
    }
}
