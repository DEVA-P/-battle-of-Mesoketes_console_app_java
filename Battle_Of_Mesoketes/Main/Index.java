package Battle_Of_Mesoketes.Main;

import java.util.Scanner;

import Battle_Of_Mesoketes.Databases.CreateCountry;

public class Index extends CreateCountry {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String default_Country_Name = "Mesoketes";
        String default_Builder_Name = "Deva";
        try {
            createCountry(default_Country_Name, default_Builder_Name);
            System.out.print("Attack-Code :");
            String attacks = scanner.nextLine();
            int successful_attacks = StartWar.startWar(default_Country_Name, attacks);
            System.out.println(successful_attacks);
            
        } catch (Exception e) {
            System.out.println("Exception caught :"+ e.getMessage());
        }
    }
}
