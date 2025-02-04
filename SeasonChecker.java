package day18exception_enums;
/*
9.Modify the SeasonChecker class to print a message depending on the Season enum value provided. Print
"It's summer time!" for SUMMER, "Winter is here!"
 for WINTER, and "Enjoy the mild weather!" for other seasons.
 */

public class SeasonChecker {
    public static void main(String[] args) {
        checkSeason(Season.SUMMER);
        checkSeason(Season.AUTUMN);
    }

    public static void checkSeason(Season season) {
        // Implement switch case
        switch (season) {

            case SUMMER -> System.out.println("it is a summer time!");
            case WINTER -> System.out.println("Winter is here");
            case SPRING ,AUTUMN -> System.out.println("Enjoy the mild weather");
            default -> System.out.println("invalid weather");
        }

    }
}
