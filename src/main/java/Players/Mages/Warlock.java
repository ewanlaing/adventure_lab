package Players.Mages;

import behaviours.IDefender;
import behaviours.ISpell;

public class Warlock extends Mage {
    protected Warlock(String name, int healthValue, ISpell spell, IDefender defender) {
        super(name, healthValue, spell, defender);
    }
    public String strokeBeardInASinisterWay(){
        return "The hour is later than you think";
    }
}
