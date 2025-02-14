package day24miniproject;


    // Base class for all employees
    abstract class Employee {

        protected Long id;

        protected String name;

    /*

            name.trim()
            name.isEmpty() --> ""

            User: ""

     */

        public Employee(Long id, String name){
            if (name==null || name.trim().isEmpty() || id<1){
                throw new InvalidEmployeeDataException("Invalid data entered!");
            }
            this.id = id;
            this.name = name;
        }
        public abstract double calculateSalary();
}
