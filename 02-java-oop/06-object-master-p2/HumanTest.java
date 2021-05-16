public class HumanTest {
    public static void main (String[] agrs){
        
        Human h = new Human();
        Wizard w = new Wizard();
        Ninja n = new Ninja();
        Samurai s = new Samurai();
        h.attack(w);
        w.heal(n);
        w.fireball(s);
        n.steal(w);
        n.runAway();
        s.deathBlow(w);
        s.medidate();
        



    }
    
}
