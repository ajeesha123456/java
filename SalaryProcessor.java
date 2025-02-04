package day18exception_enums;

public class SalaryProcessor {
//4. Handling Checked Exceptions
//Modify the processSalary method so that it throws a custom checked exception NegativeSalaryException when the given salary is negative.
        public static void main(String[] args) {
            try {
                processSalary(-5000);
            }catch (InvalidSalaryException e){

                System.out.println(e.getMessage());
            }
        }




        public static void processSalary(int salary) throws InvalidSalaryException {

            if(salary<0){
                throw new InvalidSalaryException("Salary must be greater than 0");
            }
            System.out.println("Salary : "+salary);
            // Implement exception handling



        }
    }

