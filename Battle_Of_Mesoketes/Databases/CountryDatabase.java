package Battle_Of_Mesoketes.Databases;

import java.util.*;

// import Battle_Of_Mesoketes.Models.Country;

public class CountryDatabase {
    //mapping country with countryname with the class [to group the country with their walls]
    private static HashMap<String, GroupCountryWalls> CountryDb = new HashMap<String, GroupCountryWalls>(); 
    //using hashMap for easy access with o(1) complexity
     

    public static GroupCountryWalls getEntireCountry(String country) {
        return CountryDb.get(country);
    }

    public static void setEntireCountry(GroupCountryWalls country, String countryName) {
        CountryDatabase.CountryDb.put(countryName, country);
    }
 
}
