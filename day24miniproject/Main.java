package day24miniproject;

public class Main {
    public static void main(String[] args) {
try {
    Employee person1 = new FullTimeEmployee(123L, "Alex", 2000, 500, 25);
    Employee person2 = new Manager(346L, "John", 3000, 500, 200);
    Employee person3 = new ContractEmployee(567L, "Amy", 3L, 60L);
    Employee person4 = new PartTimeEmployees(687L, "David", 17, 40);
    Employee person5 = new Interns(678L, "Bob", 800L);



     System.out.println(  "Salary of "+ person1.name +" : "+ person1.calculateSalary() );;
 System.out.println("Salary of "+person2.name +" " + person2.calculateSalary());;
 System.out.println("Salary of "+person3.name +" "+ person3.calculateSalary());;
 System.out.println("Salary of "+person4.name+" " +person4.calculateSalary());;
 System.out.println("Salary of "+person5.name+" "+person5.calculateSalary());;
}catch(IllegalArgumentException e){
    System.out.println(e.getMessage());
}














    }
}
