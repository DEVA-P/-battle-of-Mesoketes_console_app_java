package Battle_Of_Mesoketes.Databases;

import Battle_Of_Mesoketes.Models.Country;
import Battle_Of_Mesoketes.Walls.GroupWalls;

public class CreateCountry {

    private static void give_Warning_To_Builder(Country country) {
        System.out.println("Welcome Chief  " + country.getBuilderName() + "______");
        System.out.println("________OUR COUNTRY IS UNDER ATTACK");
    }

    private static Country setCountry(String countryName, String builderName) {
        Country country = new Country();
        country.setCountryName(countryName);
        country.setBuilderName(builderName);
        CountryDatabase.setCountryDetails(country, countryName);
        return country;
    }

    private static void create_Country(String countryName, String builderName) {
        Country newCountry = setCountry(countryName, builderName);
        GroupCountryWalls groupCountryWalls = new GroupCountryWalls();
        groupCountryWalls.setCountry(newCountry);
        groupCountryWalls.setGroupWalls(new GroupWalls());
        CountryDatabase.setEntireCountry(groupCountryWalls, countryName);
        give_Warning_To_Builder(newCountry);
    }

    public static void createCountry(String countryName, String builderName) {
        create_Country(countryName, builderName);
    }
}