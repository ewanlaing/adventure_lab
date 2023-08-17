package Players.Mages;

import Players.Player;
import behaviours.IDefender;
import behaviours.ISpell;
public abstract class Mage extends Player {

    private ISpell spell;

    private IDefender defender;

    public Mage(String name, int healthValue, ISpell spell, IDefender defender) {
        super(name, healthValue);
        this.spell = spell;
        this.defender = defender;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void setDefender(IDefender defender) {
        this.defender = defender;
    }
}
