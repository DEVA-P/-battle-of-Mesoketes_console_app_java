package Battle_Of_Mesoketes.Attacks;

import java.util.ArrayList;

public class EveryDayAttack {
    private String day;
    private ArrayList<Attack> attack;

    public String getDay() {
        return day;
    }

    public ArrayList<Attack> getAttack() {
        return attack;
    }

    public void setAttack(ArrayList<Attack> attack) {
        this.attack = attack;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "EveryDayAttack [attack=" + attack + ", day=" + day + "]";
    }

}
