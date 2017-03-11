public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;
    
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    } 
    public void eat(Plate p) {
        fullness = p.decreaseFood(appetite);
    } 
    
    String getName() {
        return name;
    }

    boolean getFullness() {
        return fullness;
    }
    
    int getAppetite() {
        return appetite;
    }
}