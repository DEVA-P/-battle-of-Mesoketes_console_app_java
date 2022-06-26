package Battle_Of_Mesoketes.Walls;

public class GroupWalls { 
    //Grouping four walls to have the entire square area as mentioned in the question
    private NorthWall north;
    private SouthWall south;
    private EastWall east;
    private WestWall west;

    public GroupWalls(){
        setNorth(new NorthWall());
        setSouth(new SouthWall());
        setEast(new EastWall());
        setWest(new WestWall());
    } 

    public NorthWall getNorth() {
        return north;
    }
    public void setNorth(NorthWall north) {
        this.north = north;
    }
    public SouthWall getSouth() {
        return south;
    }
    public void setSouth(SouthWall south) {
        this.south = south;
    }
    public EastWall getEast() {
        return east;
    }
    public void setEast(EastWall east) {
        this.east = east;
    }
    public WestWall getWest() {
        return west;
    }
    public void setWest(WestWall west) {
        this.west = west;
    } 
}
