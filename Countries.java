package day18exception_enums;

public enum Countries {
    /*

    1. Enum Custom Values
Modify the following enum Countries so that it holds additional fields: countryCode (int) and capitalCity (String).
Provide a constructor and getter methods.

     */
    FRANCE(+33, "Paris"),
    GERMANY(+49, "Berlin"),
    JAPAN(+81, "Tokyo"),
    USA(+1, "Washington D.C");
    private final int countryCode;
    private final String capitalCity;

    Countries(int countryCode, String capitalCity) {
        this.countryCode = countryCode;
        this.capitalCity = capitalCity;
    }

    // getter method

    public int getcountryCode(){
        return countryCode;
    }
    public String getCapitalCity(){
        return capitalCity;
    }
}
