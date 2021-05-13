public class Gorilla extends Mammal {

    public Gorilla(int energy) {
        energyLevel = energy;

    }

    public void throwSomething() {
        System.out.println("Gorilla has thrown something! -5 Energy");
        energyLevel -= 5;

    }

    public void eatBanana() {
        System.out.println("Gorilla is eating bananas! +10 Energy");
        energyLevel += 10;
    }

    public void climb() {
        System.out.println("Gorilla has climbed a tree! -10 Energy");
        energyLevel -= 10;

    }

}
