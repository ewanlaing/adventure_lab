package Players;

import Players.Player;
import behaviours.IHeal;

public class Cleric extends Player {

    private IHeal medicine;
    public Cleric(String name, int healthValue, IHeal medicine) {
        super(name, healthValue);
        this.medicine = medicine;
    }

    public IHeal getMedicine() {
        return medicine;
    }

    public void setMedicine(IHeal medicine) {
        this.medicine = medicine;
    }
}
