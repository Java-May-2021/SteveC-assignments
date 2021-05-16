public class Wizard extends Human {
    public Wizard() {
        super(50, 8);
    }
    public void heal(Human target){
        int healingDone = this.intelligence;
        int targethealth = target.getHealth();
        int healthAfterHeal = targethealth + healingDone;
        target.setHealth(healthAfterHeal);
        System.out.println("target's health: " + target.getHealth());


    }
    public void fireball (Human target) {

        int targethealth = target.getHealth();
        int damageDone = this.intelligence * 3;
        int healthAfterAtt = targethealth - damageDone;
        target.setHealth(healthAfterAtt);
        System.out.println("target's health: " + target.getHealth());


    }

}
