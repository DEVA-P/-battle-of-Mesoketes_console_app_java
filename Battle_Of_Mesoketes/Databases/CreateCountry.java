package Battle_Of_Mesoketes.Databases;

import Battle_Of_Mesoketes.Models.Country;
import Battle_Of_Mesoketes.Walls.GroupWalls;

public class CreateCountry extends CountryDatabase {

    private static void give_Warning_To_Builder(Country country) {
        System.out.println("Welcome Chief,  " + country.getBuilderName() + "______");
        System.out.println("________OUR COUNTRY IS UNDER ATTACK_______Make BIG WALLS TO PROTECT!!!");
    }

    private static Country setCountry(String countryName, String builderName) {
        Country country = new Country();
        country.setCountryName(countryName);
        country.setBuilderName(builderName);
        // setCountryDetails(country, countryName);
        return country;
    }

    private static void create_Country(String countryName, String builderName) {
        Country newCountry = setCountry(countryName, builderName);
        GroupCountryWalls groupCountryWalls = new GroupCountryWalls();
        groupCountryWalls.setCountry(newCountry);
        groupCountryWalls.setGroupWalls(new GroupWalls());
        setEntireCountry(groupCountryWalls, countryName);
        give_Warning_To_Builder(newCountry);
    }

    public static void createCountry(String countryName, String builderName) {
        create_Country(countryName, builderName);
    }
}
