package day18exception_enums;

public class TemperatureChecker {
    public static void main(String[] args) {
        try {
            validateTemperature(75);
        }catch(ExtremeTemperatureException e){

            System.out.println(e.getMessage());

        }
    }

    public static void validateTemperature(int temp)  {
        //Modify the validateTemperature method to throw a custom exception ExtremeTemperatureException if the temperature is below -50 or above 60.
        // Implement exception handling
        if(temp< -50|| temp>60){
            throw new ExtremeTemperatureException("Extreme Temperature");

        }else {
            System.out.println("Temperature is " + temp);
        }
    }
}



