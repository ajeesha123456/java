package homework;

public class Person {


    /*

            Example 4:
                You are saving person information in a company.
                You are expected to collect:
                    - Name
                    - Age
                    - Address
                    - Phone Number

                These should NOT be changeable once they are set.
                Also, you need to consider the security so they should be private.

                Find a way to implement this.

     */
   private final String name;
    private  final String age;
    private  final String address;
    private  final String phoneNumber;

public Person(String name,String age,String address,String phoneNumber){
this.name=name;
this.age=age;
this.address=address;
this.phoneNumber=phoneNumber;

}

 public String getName(){
    return name;
}


    public String getAge(){

     return age;
    }


    public  String getAddress(){
     return address;
 }

 public String getPhoneNumber(){

     return phoneNumber;
 }




}
