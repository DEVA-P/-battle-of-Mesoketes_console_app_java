package Battle_Of_Mesoketes.Databases;

import java.util.*;

import Battle_Of_Mesoketes.Models.Country;

public class CountryDatabase {
    //mapping country with countryname with the class [to group the country with their walls]
    private static HashMap<String, GroupCountryWalls> CountryDb = new HashMap<String, GroupCountryWalls>();
    //mapping the country name with the class [country class contains country name and builder name]
    // can use ArrayList to store the country
    //using hashMap for easy access with o(1) complexity
    
    private static HashMap<String, Country> countryDetails = new HashMap<String, Country>();

    public static GroupCountryWalls getEntireCountry(String country) {
        return CountryDb.get(country);
    }

    public static void setEntireCountry(GroupCountryWalls country, String countryName) {
        CountryDatabase.CountryDb.put(countryName, country);
    }

    public static Country getCountry(String country) {
        return countryDetails.get(country);
    }

    public static void setCountryDetails(Country country, String countryName) {
        CountryDatabase.countryDetails.put(countryName, country);
    }
}
