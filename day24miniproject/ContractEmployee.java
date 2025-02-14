package day24miniproject;

public class ContractEmployee extends Employee {

    private Long contractLength;
    private Long contractRate;

    public ContractEmployee(Long id, String name, Long contractLength, Long contractRate ) {
        super(id, name);
        if(contractLength < 0 ||contractRate<0){
            throw new InvalidEmployeeDataException("invalid data");

        }
        this.contractLength = contractLength;
        this.contractRate = contractRate;
    }
    @Override
    public double calculateSalary() {
        return (contractRate*contractLength);
    }

    @Override
    public String toString() {
        return name;
    }
}

