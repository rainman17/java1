public class Animal {
    protected String type;
    protected String name;
    protected String color;
    protected int age;
        
    public Animal() {
        
    }

    public Animal(String name) {
        this.name = name;
    }
    
    public Animal(String type, String name, String color, int age) {
        this.name = name; 
        this.color = color; 
        this.age = age;
        this.type = type;
    }
    
    public void printOut() {
        System.out.println(toString());
    }
    
    @Override
    public String toString() {
       return ("Animal " + type + " name is " + name + " color is " + color + " age is " + age + " years");
    }
    
    public boolean run(int length) {
        if (type == "Cat" && length <= 200) return true;
        if (type == "Dog" && length <= 500) return true;
        return false;
    }
    
    public boolean swim(int length) {
        if (type == "Dog" && length <= 50) return true;  
        return false;
    }
    
    
    public boolean jump(double length) {
        if (type == "Cat" && length <= 2) return true;
        if (type == "Dog" && length <= 0.5) return true;
        return false;  
    }
}    

