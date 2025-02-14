package day24miniproject;

public class PartTimeEmployees extends Employee{

 private double hourlyRate;
 private double  hoursWorked;


    public PartTimeEmployees(Long id, String name,double hourlyRate,double hoursWorked) {
        super(id, name);

        if (hourlyRate < 0 || hourlyRate > 100)
            throw new InvalidEmployeeDataException("Hourly Rate must be between 0 and 100");


        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;

    }
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return name;
    }
}
