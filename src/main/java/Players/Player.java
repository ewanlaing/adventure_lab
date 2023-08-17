package Players;

public abstract class Player {

    private String name;
    private int healthValue;

    public Player(String name, int healthValue) {
        this.name = name;
        this.healthValue = healthValue;
    }

    public String getName(){
        return this.name;
    }


    public int getHealth() {
        return healthValue;
    }

    public void takeDamage(int damage){
        this.healthValue -= damage;
    }

    public void restoreHealth (int value){
        this.healthValue += value;
    }


}
