package Battle_Of_Mesoketes.Walls;

public class Walls {
    //parent class for all walls 
    //EastWall 
    //WestWall
    //NorthWall
    //SouthWall
    ///// are the child classes for the Walls class
    private int height ;

    public Walls(){
        //walls.initialHeight is initialized to zero whenever the object is initialized
        this.height = 0;
    }
    
    public  int getInitialHeight() {
        return height;
    }
    public  void setInitialHeight(int height) {
        this.height = height;
    }
    @Override
    public String toString() {
        return "Walls [initialHeight=" + height + "]";
    } 
}
