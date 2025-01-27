package homework;

public class Main {
    public static void main(String[] args) {
        // Abstract method
        Bike bike=new Bike();
        bike.move();
        Car car=new Car();
        car.move();


        //class Person

Person person=new Person("Alex", "27","bettiner straße, frankfurt","12345667778");
        System.out.println("Name : "+person.getName());
        System.out.println("Age: "+person.getAge());
        System.out.println("Address : "+person.getAddress());
        System.out.println("Phone Number : "+person.getPhoneNumber());

    }
}
