package Players.Fighters;

import Players.Player;
import behaviours.IWeapon;

public abstract class Fighter extends Player {

    private IWeapon weapon;
    protected Fighter(String name, int healthValue, IWeapon weapon) {
        super(name, healthValue);
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public String battleCry(){
        return "Argh!";
    }
}
