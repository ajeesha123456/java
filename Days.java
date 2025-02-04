package day18exception_enums;

public enum Days {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, Days;
    /*
    Write a method printMessage(Days day)
    that takes an enum value from Days and prints a custom message for MONDAY, FRIDAY, and SUNDAY. If it’s any other day, print "Regular day".
     */

    //Write a method printMessage(Days day) that takes an enum value from Days
    // and prints a custom message for MONDAY, FRIDAY, and SUNDAY. If it’s any other day, print "Regular day".





    public static void printMessage(Days day){
         switch (day){
             case TUESDAY,WEDNESDAY,THURSDAY,SATURDAY-> System.out.println("Regular days");

             case MONDAY, FRIDAY, SUNDAY-> System.out.println("holidays");

             default -> System.out.println("invalid");
         }


        }


    }

