package Players.Mages;

public class Wizard extends Mage {
    protected Wizard(String name, int healthValue, ISpell spell, IDefender defender) {
        super(name, healthValue, spell, defender);
    }

    public String strokeBeard(){
        return "I have no memory of this place...";
    }
}
