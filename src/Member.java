//Example of using super keyworrd
/*Can we access parent class variables in child class by using super keyword*/
public class Member {
     String role="General_Member";/*representing general member of an organization.default role in the parent class*/

     void  showRole(){
          System.out.println("Role in Parent Class: "+role);
     }
}

class Committeemember extends Member{
     //overidden the parent class member which is role
     String role="Committee_member";/*representing a specific type of member who has additional responsibilities*/

     void showRole(){
          System.out.println("Role in  the child class: "+role); // Prints the child class value of 'role'
          System.out.println("Role in the parent class: "+super.role);// Prints the parent class value of 'role' using super keyword
     }
}

