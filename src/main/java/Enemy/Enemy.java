package Enemy;

import Players.Player;

public abstract class Enemy {

    private int healthValue;
    private int damageValue;

    protected Enemy(int health, int damageValue) {
        this.healthValue = healthValue;
        this.damageValue = damageValue;
    }


    public int getHealthValue() {
        return healthValue;
    }

    public void takeDamage(int damageValue){
        this.healthValue -= damageValue;
    }

   public void attackPlayer(Player player){
        player.takeDamage(damageValue);
   }
}
