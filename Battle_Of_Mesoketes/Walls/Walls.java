package Battle_Of_Mesoketes.Walls;

public class Walls {
    //parent class for all walls 
    //EastWall 
    //WestWall
    //NorthWall
    //SouthWall
    ///// are the child classes for the Walls class
    private int initialHeight;

    public Walls(){
        //walls.initialHeight is initialized to zero whenever the object is initialized
        this.initialHeight = 0;
    }
    
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
