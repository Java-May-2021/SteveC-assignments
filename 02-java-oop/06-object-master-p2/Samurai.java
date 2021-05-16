public class Samurai extends Human{
    private static int totalSamurai = 0;
    public int howMany(){

        return Samurai.totalSamurai;
    }
    
    public Samurai(){
        this.health = 200;
        totalSamurai += 1;

    }
    public void deathBlow(Human target){

        target.health = 0;
        this.health = (this.health/2);
        System.out.println("DeathBlow!! Target's health is now ZERO!!! " + "Decrease Samurai's health by half. Current Health: "+this.health);
    }
    public void medidate(){
        int healAmount = (this.health/2);
        this.setHealth(this.health+healAmount);
        System.out.println("Samurai is Medidating, Heal: "+healAmount +" Current Health: " + this.health);


    }
    
}
