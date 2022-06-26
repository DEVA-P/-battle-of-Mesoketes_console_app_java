package Battle_Of_Mesoketes.Walls;

public class GroupWalls { 
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
    
    // public void setFuntion(String direction, int length) {
    //     if(direction == "N")
    //         north.setInitialHeight(length);
    //     else if(direction == "S")
    //         south.setInitialHeight(length);
    //     else if(direction == "W")
    //         west.setInitialHeight(length);
    //     else if(direction == "E")
    //         east.setInitialHeight(length);
    // }
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
