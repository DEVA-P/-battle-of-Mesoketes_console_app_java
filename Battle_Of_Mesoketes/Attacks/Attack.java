package Battle_Of_Mesoketes.Attacks;

import Battle_Of_Mesoketes.Models.Tribe;

public class Attack {

    private Tribe tribe;
    private int strength;
    private String Direction;

    @Override
    public String toString() {
        return "Attack [Direction=" + Direction + ", strength=" + strength + ", tribe=" + tribe + "]";
    }

    public Tribe getTribe() {
        return tribe;
    }

    public void setTribe(Tribe tribe) {
        this.tribe = tribe;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }
}