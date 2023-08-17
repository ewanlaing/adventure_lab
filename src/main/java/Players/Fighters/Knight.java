package Players.Fighters;

import behaviours.IWeapon;

public class Knight extends Fighter {

    protected Knight(String name, int healthValue, IWeapon weapon) {
        super(name, healthValue, weapon);
    }

    public String battleCry(){
        return "'tis but a scratch!";
    }
}
