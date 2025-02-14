package day24miniproject;

public class FullTimeEmployee extends Employee {

    private double baseSalary;
    private double bonus;
    private double benefits;

    public FullTimeEmployee(Long id, String name, double baseSalary, double bonus, double benefits) {
        super(id, name);// sending and saving id and name through the parent class.

        if(baseSalary< 0)
            throw new InvalidEmployeeDataException("Base Salary cannot be negative");
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.benefits = benefits;


    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus + benefits;
    }

    // Getters and Setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBenefits() {
        return benefits;
    }

    public void setBenefits(double benefits) {
        this.benefits = benefits;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "baseSalary=" + baseSalary +
                ", bonus=" + bonus +
                ", benefits=" + benefits +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';

    }
}
