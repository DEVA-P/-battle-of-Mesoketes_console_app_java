package Battle_Of_Mesoketes.Walls;

public class Walls {
    private int initialHeight = 0; 
    
    public  int getInitialHeight() {
        return initialHeight;
    }
    public  void setInitialHeight(int initialHeight) {
        this.initialHeight = initialHeight;
    }
    @Override
    public String toString() {
        return "Walls [initialHeight=" + initialHeight + "]";
    } 
}
