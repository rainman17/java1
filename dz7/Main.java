
public class Main {
    public static void main(String[] args) {
        Cat cat[] = new Cat[5];
        cat[0] = new Cat("Barsik", 15);
        cat[1] = new Cat("Vasiliy", 5);
        cat[2] = new Cat("Vladimir", 25);
        cat[3] = new Cat("Nikolay", 55);
        cat[4] = new Cat("Nikifor", 15);
        Plate plate = new Plate(100);
        plate.info();
        for (Cat c : cat)  {
            c.eat(plate);
            System.out.println("Cat " + c.getName() + " has eaten ? " + c.getFullness());
        }
        plate.info();
    }
}