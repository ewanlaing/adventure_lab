package Players.Cleric;

import Players.Player;
import behaviours.IHeal;

public class Herb implements IHeal {


    private int healingValue;

    public Herb(int healingValue) {
        this.healingValue = healingValue;
    }

    public void heal(Player player) {
        player.restoreHealth(healingValue);
    }

    public int getHealingValue() {
        return healingValue;
    }
}
