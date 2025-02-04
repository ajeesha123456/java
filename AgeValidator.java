package day18exception_enums;

public class AgeValidator {
    public static void main(String[] args) {

        try{
            validateAge(200);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
    }
    public static void validateAge(int age) {

        if (age < 0 || age > 150) {
            throw new InvalidAgeException(" invalid age : "+age + " " + ", age must be greater than 0 and less than 150");

        }
        System.out.println("valid age "+age);
    }

}
