package Players.Mages.Spells;

import Enemy.Enemy;
import behaviours.ISpell;

public class LightningBolt implements ISpell {

    private int damageValue;

    public LightningBolt(int damageValue) {
        this.damageValue = damageValue;
    }

    public void cast(Enemy enemy) {
        enemy.takeDamage(damageValue);
    }

    public int getDamageValue() {
        return this.damageValue;
    }
}
