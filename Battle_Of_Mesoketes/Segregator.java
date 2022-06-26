package Battle_Of_Mesoketes;

import java.util.ArrayList;

//importing files from different packages
import Battle_Of_Mesoketes.Attacks.Attack;
import Battle_Of_Mesoketes.Attacks.EveryDayAttack;
import Battle_Of_Mesoketes.Databases.TribeDatabase;
import Battle_Of_Mesoketes.Models.Tribe;
import Battle_Of_Mesoketes.Databases.GroupCountryWalls;

public class Segregator extends GroupCountryWalls {

    private static Tribe addNewTribe(String tribeName, String weaponName) {
        Tribe newTribe = new Tribe();
        newTribe.setTribeName(tribeName);
        newTribe.setWeaponName(weaponName);
        return newTribe;
    }

    private static Tribe findTribe(String tribe_Details, String weaponName) {
        if (TribeDatabase.existsTribe(tribe_Details))
            return TribeDatabase.getTribeDb(tribe_Details);
        else
            return addNewTribe(tribe_Details, weaponName);
    }

    private static Attack addAttack(String attack) {
        Attack newAttack = new Attack();
        attack = attack.trim();
        String attack_details[] = attack.split("\\ - ");
        Tribe tribe = findTribe(attack_details[0], attack_details[2]);
        newAttack.setTribe(tribe);
        newAttack.setDirection(attack_details[1]);
        newAttack.setStrength(Integer.parseInt(attack_details[3]));
        return newAttack;
    }

    private static ArrayList<Attack> add_Attacks_of_day(String attacks) {
        ArrayList<Attack> attackList = new ArrayList<Attack>();
        String individual_attacks[] = attacks.split("\\:");
        for (String attack : individual_attacks) {
            attackList.add(addAttack(attack));
        }
        return attackList;
    }

    private static EveryDayAttack addNewDayAttack(String day_wise_attack) {
        EveryDayAttack newDay = new EveryDayAttack();
        String individual_attack[] = day_wise_attack.split("\\$");
        newDay.setDay(individual_attack[0].trim());
        ArrayList<Attack> attacks = add_Attacks_of_day(individual_attack[1]);
        newDay.setAttack(attacks);
        return newDay;
    }

    private static ArrayList<EveryDayAttack> seperate_day_and_tribe(String day_Wise_Attack[]) {
        ArrayList<EveryDayAttack> attackList = new ArrayList<EveryDayAttack>();
        for (String day_wise_attack : day_Wise_Attack) {
            attackList.add(addNewDayAttack(day_wise_attack));
        }
        return attackList;
    }

    private static ArrayList<EveryDayAttack> segrators(String attack) {
        attack = attack.trim();
        String split_every_day[] = attack.split("\\;");
        return seperate_day_and_tribe(split_every_day);
    }

    public static ArrayList<EveryDayAttack> segrator(String attack) {
        //calling segrators to segragate the required data and map to their respective classes
        return segrators(attack);
    }
}
