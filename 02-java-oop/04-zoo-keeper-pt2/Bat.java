public class Bat extends Mammal {
    
    public Bat(int batEnergy) {

        super(batEnergy);
    }
    public void fly(){

        System.out.println("Bat is fying! -50 Energy");
        energyLevel -= 50;

    }
    public void eatHumans(){

        System.out.println("Bat just ate a human! +25 Energy");
        energyLevel += 25;

    }
    public void attackTown(){

        System.out.println("Bat is attacking Town! -100 Energy");
        energyLevel -=100;
    }
}
