public class Human {
    protected int strength = 3;
    protected int intelligence = 3;
    protected int stealth = 3;
    protected int health = 100;

    public Human() {
    }

    public int getHealth() {

        return health;

    }

    public void setHealth(int number) {

        health = number;

    }

    public void attack (Human target, int damage) {

        int targethealth = target.getHealth();
        int damageDone = this.strength * damage;
        int healthAfterAtt = targethealth - damageDone;
        target.setHealth(healthAfterAtt);
        System.out.println(target.getHealth());


    }

}
