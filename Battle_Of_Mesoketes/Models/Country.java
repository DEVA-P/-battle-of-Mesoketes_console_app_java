package Battle_Of_Mesoketes.Models;

public class Country {
    // class to store the country name and the builder of the country
    private String countryName;
    private String builderName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    @Override
    public String toString() {
        return "Country [builderName=" + builderName + ", countryName=" + countryName + "]";
    }
}
