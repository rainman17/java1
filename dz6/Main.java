/** 1. Создать классы Собака и Кот с наследованием от класса Животное.

2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания),
или высоту (для прыжков).

3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).

4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль.
(Например, dog1.run(150); -> результат: run: true) */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat1 = new Cat("Barsik", "Blue", 5);
        Cat cat2 = new Cat("Kotofei", "Grey", 3);
        Dog dog1 = new Dog("Sharik", "Brown", 7);
        Dog dog2 = new Dog("Laika", "Green", 17);
        cat1.printOut();
        cat2.printOut();
        dog1.printOut();
        dog2.printOut(); 
        System.out.println(cat1.run(300));
        System.out.println(cat2.run(100));        
        System.out.println(cat1.swim(5));       
        System.out.println(cat1.jump(1.5));        
        System.out.println(cat2.jump(3)); 
        
        System.out.println(dog1.run(600));
        System.out.println(dog2.run(100));        
        System.out.println(dog1.swim(5));       
        System.out.println(dog1.jump(0.5));        
        System.out.println(dog2.jump(3));
    }
}
