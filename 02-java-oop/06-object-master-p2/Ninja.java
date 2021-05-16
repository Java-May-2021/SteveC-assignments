public class Ninja extends Human {
    public Ninja() {

        super(10);
    }

    public void steal(Human target) {
        int targethealth = target.getHealth();
        int damageDone = this.stealth;
        int healthAfterAtt = targethealth - damageDone;
        target.setHealth(healthAfterAtt);
        this.health += damageDone;
        System.out.println("target's health: " + target.getHealth() + " Ninja's health " + this.health);

    }
    public void runAway(){

        int healthAfterRunning = this.health - 10;
        System.out.println("Ninja is running away!! " + "Ninja's health -10, current health: "+healthAfterRunning);

    }
}
