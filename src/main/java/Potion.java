import Players.Player;
import behaviours.IHeal;

public class Potion implements IHeal {
    private int healingValue;

    public Potion(int healingValue) {
        this.healingValue = healingValue;
    }

    public void heal(Player player) {
        player.restoreHealth(healingValue);
    }

    public int getHealingValue() {
        return healingValue;
    }
}
