package Players.Fighters;

import behaviours.IWeapon;

public class MythicalDwarf extends Fighter {

    private int beardLength;
    protected MythicalDwarf(String name, int healthValue, IWeapon weapon, int beardLength) {
        super(name, healthValue, weapon);
        this.beardLength = beardLength;
    }

    public int getBeardLength() {
        return beardLength;
    }

    public void setBeardLength(int beardLength) {
        this.beardLength = beardLength;
    }

    public String battleCry(){
        return "You'll have to toss me!";
    }
}
