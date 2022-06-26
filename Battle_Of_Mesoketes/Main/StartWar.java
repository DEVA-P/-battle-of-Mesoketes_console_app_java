package Battle_Of_Mesoketes.Main;

import Battle_Of_Mesoketes.Attacks.Attack;
import Battle_Of_Mesoketes.Attacks.EveryDayAttack;
import Battle_Of_Mesoketes.Databases.BattleDatabase;
import Battle_Of_Mesoketes.Databases.CountryDatabase;
import Battle_Of_Mesoketes.Walls.GroupWalls;

import java.util.ArrayList;

public class StartWar extends Segregator {

    private static void update_Walls_Heights_to_Max(GroupWalls currentCountry, GroupWalls newGroupWalls) {
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

    private static void update_South_Walls_temporary(GroupWalls newGroupWalls, Attack attack, BattleDatabase battle) {
        newGroupWalls.getSouth().setInitialHeight(
                Math.max(newGroupWalls.getSouth().getInitialHeight(), attack.getStrength()));
        battle.setSuccessful_attacks();
    }

    private static void update_North_Walls_temporary(GroupWalls newGroupWalls, Attack attack, BattleDatabase battle) {
        newGroupWalls.getNorth().setInitialHeight(
                Math.max(newGroupWalls.getNorth().getInitialHeight(), attack.getStrength()));
        battle.setSuccessful_attacks();
    }

    private static void update_East_Walls_temporary(GroupWalls newGroupWalls, Attack attack, BattleDatabase battle) {
        newGroupWalls.getEast().setInitialHeight(
                Math.max(newGroupWalls.getEast().getInitialHeight(), attack.getStrength()));
        battle.setSuccessful_attacks();
    }

    private static void update_West_Walls_temporary(GroupWalls newGroupWalls, Attack attack, BattleDatabase battle) {
        newGroupWalls.getWest().setInitialHeight(
                Math.max(newGroupWalls.getWest().getInitialHeight(), attack.getStrength()));
        battle.setSuccessful_attacks();
    }

    private static void findSuccess(BattleDatabase battle) {
        GroupWalls currentWalls = battle.getDatabase().getGroupWalls();

        for (EveryDayAttack attacks : battle.getAttacks()) {
            GroupWalls newGroupWalls = new GroupWalls();
            for (Attack attack : attacks.getAttack()) {
                // System.out.println()
                boolean matchesNorth = equals(attack.getDirection(), "N");
                boolean matchesSouth = equals(attack.getDirection(), "S");
                boolean matchesEast = equals(attack.getDirection(), "E");
                boolean matchesWest = equals(attack.getDirection(), "W");
                boolean northWallBreaks = currentWalls.getNorth().getInitialHeight() < attack.getStrength();
                boolean southWallBreaks = currentWalls.getSouth().getInitialHeight() < attack.getStrength();
                boolean eastWallBreaks = currentWalls.getEast().getInitialHeight() < attack.getStrength();
                boolean westWallBreaks = currentWalls.getWest().getInitialHeight() < attack.getStrength();

                if (matchesNorth && northWallBreaks) {
                    update_North_Walls_temporary(newGroupWalls, attack, battle);
                } else if (matchesSouth && southWallBreaks) {
                    update_South_Walls_temporary(newGroupWalls, attack, battle);
                } else if (matchesEast && eastWallBreaks) {
                    update_East_Walls_temporary(newGroupWalls, attack, battle);
                } else if (matchesWest && westWallBreaks) {
                    update_West_Walls_temporary(newGroupWalls, attack, battle);
                }
            }
            update_Walls_Heights_to_Max(currentWalls, newGroupWalls);
        }
    }

    public static int startWar(String countryName, String attacks) throws Exception {
        ArrayList<EveryDayAttack> attackList = segrator(attacks);
        BattleDatabase newBattle = new BattleDatabase();
        newBattle.setDatabase(CountryDatabase.getEntireCountry(countryName));
        newBattle.setAttacks(attackList);
        findSuccess(newBattle);
        return newBattle.getSuccessful_attacks();
    }
}
