package Battle_Of_Mesoketes;

import Battle_Of_Mesoketes.Attacks.Attack;
import Battle_Of_Mesoketes.Attacks.EveryDayAttack;
import Battle_Of_Mesoketes.Databases.BattleDatabase;
import Battle_Of_Mesoketes.Databases.CountryDatabase;
import Battle_Of_Mesoketes.Walls.GroupWalls;

import java.util.ArrayList;

public class StartWar extends Segregator { 

    private static void update_Walls_Heights_to_Max(GroupWalls currentCountry, GroupWalls newGroupWalls){
        currentCountry.getNorth().setInitialHeight(Math.max(newGroupWalls.getNorth().getInitialHeight(),
                    currentCountry.getNorth().getInitialHeight()));
            currentCountry.getSouth().setInitialHeight(Math.max(newGroupWalls.getSouth().getInitialHeight(),
                    currentCountry.getSouth().getInitialHeight()));
            currentCountry.getEast().setInitialHeight(
                    Math.max(newGroupWalls.getEast().getInitialHeight(), currentCountry.getEast().getInitialHeight()));
            currentCountry.getWest().setInitialHeight(
                    Math.max(newGroupWalls.getWest().getInitialHeight(), currentCountry.getWest().getInitialHeight()));
    }
    private static boolean equals(String attackDir, String direction) {
        return attackDir.equals(direction);
    }

    private static void findSuccess(BattleDatabase battle) {
        GroupWalls currentCountry = battle.getDatabase().getGroupWalls();

        for (EveryDayAttack attacks : battle.getAttacks()) {
            GroupWalls newGroupWalls = new GroupWalls();
            for (Attack attack : attacks.getAttack()) {
                // System.out.println()
                if (equals(attack.getDirection(), "N") && currentCountry.getNorth().getInitialHeight() < attack.getStrength()) {
                    // newGroupWalls.setFuntion("N", attack.getStrength()); 
                    newGroupWalls.getNorth().setInitialHeight(
                            Math.max(newGroupWalls.getNorth().getInitialHeight(), attack.getStrength()));
                    battle.setSuccessful_attacks();
                } else if (equals(attack.getDirection(), "S") && currentCountry.getSouth().getInitialHeight() < attack.getStrength()) {
                    newGroupWalls.getSouth().setInitialHeight(
                            Math.max(newGroupWalls.getSouth().getInitialHeight(), attack.getStrength()));
                    battle.setSuccessful_attacks();
                    
                } else if (equals(attack.getDirection(), "E") && currentCountry.getEast().getInitialHeight() < attack.getStrength()) {
                    newGroupWalls.getEast().setInitialHeight(
                            Math.max(newGroupWalls.getEast().getInitialHeight(), attack.getStrength()));
                    battle.setSuccessful_attacks(); 
                } else if (equals(attack.getDirection(), "W") && currentCountry.getWest().getInitialHeight() < attack.getStrength()) {
                    newGroupWalls.getWest().setInitialHeight(
                            Math.max(newGroupWalls.getWest().getInitialHeight(), attack.getStrength()));
                    battle.setSuccessful_attacks();
                }
            }
            update_Walls_Heights_to_Max(currentCountry, newGroupWalls);
        }
    }

    public static int startWar(String countryName, String attacks) {
        ArrayList<EveryDayAttack> attackList = segrator(attacks);
        BattleDatabase newBattle = new BattleDatabase();
        newBattle.setDatabase(CountryDatabase.getEntireCountry(countryName));
        newBattle.setAttacks(attackList);
        findSuccess(newBattle);
        return newBattle.getSuccessful_attacks();
    }
}
