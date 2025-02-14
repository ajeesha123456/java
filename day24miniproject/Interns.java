package day24miniproject;

public class Interns extends Employee{

    Long stipend;


    public Interns(Long id,String name,Long stipend) {
        super(id,name);
        if(stipend < 0){
            throw new InvalidEmployeeDataException("Stipend should be greater than 0");
        }
        this.stipend=stipend;
    }
    public double  getStipend(){
        return stipend;
    }

    @Override
    public double calculateSalary() {
        return stipend;
    }

    @Override
    public String toString() {
        return name;
    }
}
