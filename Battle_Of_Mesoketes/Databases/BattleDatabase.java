package Battle_Of_Mesoketes.Databases;

import Battle_Of_Mesoketes.Attacks.EveryDayAttack; 

import java.util.*;

public class BattleDatabase {
    private int successful_attacks;
    private int failed_attacks;
    private GroupCountryWalls database;
    //ArrayList of Attacks mapped with the day in EveryDayAttack class
    private ArrayList<EveryDayAttack> attacks;

    public GroupCountryWalls getDatabase() {
        return database;
    }

    public void setDatabase(GroupCountryWalls database) {
        this.database = database;
    } 

    public ArrayList<EveryDayAttack> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<EveryDayAttack> attacks) {
        this.attacks = attacks;
    }

    public int getSuccessful_attacks() {
        return successful_attacks;
    }

    public void setSuccessful_attacks() {
        this.successful_attacks++;
    }

    public int getFailed_attacks() {
        return failed_attacks;
    }

    public void setFailed_attacks(int failed_attacks) {
        this.failed_attacks = failed_attacks;
    }

}
