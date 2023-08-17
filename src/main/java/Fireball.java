import Enemy.Enemy;
import behaviours.ISpell;

public class Fireball implements ISpell {

    private int damageValue;

    public Fireball(int damageValue) {
        this.damageValue = damageValue;
    }

    public void cast(Enemy enemy) {
        enemy.takeDamage(damageValue);
    }

    public int getDamageValue() {
        return this.damageValue;
    }
}
