package day24miniproject;

public class Manager extends FullTimeEmployee{
    public Manager(Long id, String name, double baseSalary, double bonus, double benefits) {
        super(id, name, baseSalary, bonus, benefits);
    }

    @Override
    public double calculateSalary() {

           /*
        double fullTimeSalary = baseSalary + bonus + benefits;
        return  fullTimeSalary + fullTimeSalary*0.10;
         */
        double fullTimeSalary=super.calculateSalary();
        return fullTimeSalary+ (fullTimeSalary * 0.10);
    }

    @Override
    public String toString() {
        return name;
    }
}
