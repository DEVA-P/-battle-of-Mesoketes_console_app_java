package Battle_Of_Mesoketes;

import Battle_Of_Mesoketes.Attacks.Attack;
import Battle_Of_Mesoketes.Attacks.EveryDayAttack;
import Battle_Of_Mesoketes.Databases.BattleDatabase;
import Battle_Of_Mesoketes.Databases.CountryDatabase;
import Battle_Of_Mesoketes.Walls.GroupWalls;

import java.util.ArrayList;

public class StartWar extends Segregator {

    // private static String expandDirection(String direction) {
    // return "";
    // }
    private static void findSuccess(BattleDatabase battle) {
        GroupWalls currentCountry = battle.getDatabase().getGroupWalls();

        for (EveryDayAttack attacks : battle.getAttacks()) {
            GroupWalls newGroupWalls = new GroupWalls();
            for (Attack attack : attacks.getAttack()) {
                // System.out.println()
                if (attack.getDirection().equals("N")) {
                    // newGroupWalls.setFuntion("N", attack.getStrength());
                    if (currentCountry.getNorth().getInitialHeight() < attack.getStrength()) {
                        newGroupWalls.getNorth().setInitialHeight(
                                Math.max(newGroupWalls.getNorth().getInitialHeight(), attack.getStrength()));
                        battle.setSuccessful_attacks();
                    }
                } else if (attack.getDirection().equals("S")) {
                    if (currentCountry.getSouth().getInitialHeight() < attack.getStrength()) {
                        newGroupWalls.getSouth().setInitialHeight(
                                Math.max(newGroupWalls.getSouth().getInitialHeight(), attack.getStrength()));
                        battle.setSuccessful_attacks();
                    }
                } else if (attack.getDirection().equals("E")) {
                    if (currentCountry.getEast().getInitialHeight() < attack.getStrength()) {
                        newGroupWalls.getEast().setInitialHeight(
                                Math.max(newGroupWalls.getEast().getInitialHeight(), attack.getStrength()));
                        battle.setSuccessful_attacks();
                    }
                } else if (attack.getDirection().equals("W")) {
                    if (currentCountry.getWest().getInitialHeight() < attack.getStrength()) {
                        newGroupWalls.getWest().setInitialHeight(
                                Math.max(newGroupWalls.getWest().getInitialHeight(), attack.getStrength()));
                        battle.setSuccessful_attacks();
                    }
                }
            }
            currentCountry.getNorth().setInitialHeight(Math.max(newGroupWalls.getNorth().getInitialHeight(),
                    currentCountry.getNorth().getInitialHeight()));
            currentCountry.getSouth().setInitialHeight(Math.max(newGroupWalls.getSouth().getInitialHeight(),
                    currentCountry.getSouth().getInitialHeight()));
            currentCountry.getEast().setInitialHeight(
                    Math.max(newGroupWalls.getEast().getInitialHeight(), currentCountry.getEast().getInitialHeight()));
            currentCountry.getWest().setInitialHeight(
                    Math.max(newGroupWalls.getWest().getInitialHeight(), currentCountry.getWest().getInitialHeight()));
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
