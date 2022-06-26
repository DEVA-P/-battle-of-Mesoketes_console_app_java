package Battle_Of_Mesoketes.Databases;

import java.util.*;

import Battle_Of_Mesoketes.Models.Country;

public class CountryDatabase {
    private static HashMap<String, GroupCountryWalls> CountryDb = new HashMap<String, GroupCountryWalls>();
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
