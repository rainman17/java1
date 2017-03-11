public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food; 
    }
    public boolean decreaseFood(int n) {
        if (food - n >= 0) {
            food -= n; 
            return true;
        } else {
            System.out.println("Your cat tries to eat from almost empty plate");
            return false;
        }
    } 
    
    public void increaseFood(int n) {
        food += n;
    }
    
    public void info() {
        System.out.println("plate: " + food);
    } 
}
