package Battle_Of_Mesoketes.test;


import Battle_Of_Mesoketes.StartWar;
import Battle_Of_Mesoketes.Databases.CreateCountry;

public class Test extends CreateCountry{
    private static void BattleTest() throws Exception{
        
        /////TestCase 1 : 
        String default_Country_Name = "Mesoketes";
        String default_Builder_Name = "Deva";
        //creating the country and builder by default
        createCountry(default_Country_Name, default_Builder_Name);
        String attackCode_1 = "Day 1$ T1 - S - X - 4: T1 - N - X - 2: T3 - W - X - 3; Day 2$ T2 - S - X - 5: T2 - N - X - 1: T3 - N - X - 3; Day 3$ T1 - W - X - 2: T1 - W - X - 4: T2 - N - X - 3: T2 - S - X - 4";
        if(6 == StartWar.startWar(default_Country_Name, attackCode_1))
            System.out.println("TestCase 1 : success\n\n");
        else 
            System.out.println("TestCase 1 : failure\n\n");

        
        //TestCase 2 : 
        default_Country_Name = "COC";
        default_Builder_Name = "Aathish";
        //creating the country and builder by default
        createCountry(default_Country_Name, default_Builder_Name);
        String attackCode_2 = "Day 1$ T1 - E - X - 4; Day 2$ T1 - W - X - 3 : T2 - E - X - 3; Day 3$ T3 - N - X - 2: T2 - W - X - 4";
        // System.out.println(StartWar.startWar("countryname1", attackCode_2));
        if(4 == StartWar.startWar(default_Country_Name, attackCode_2))
            System.out.println("TestCase 2 : success\n\n");
        else
            System.out.println("TestCase 2 : failure\n\n");
 
    }
    public static void main(String[] args){

        try {
            BattleTest();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
