//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Committeemember cm=new Committeemember();
        //cm.showRole();

        Onlinecourse oc=new Onlinecourse();
        //oc.details();

        // Creating a Dog object to demonstrate constructor chaining with super() constructor
        //Dog dg=new Dog("Canis lupus",true,"Golden Retriever");

        Student st=new Student();//The default constructor is called here

       // System.out.println("Name: "+st.name);
       // System.out.println("Age: "+st.age);
        /*since no constructor is defined in the Student class, Java automatically provides a default,no-argument constructor
         When the st object is created,this default constructor is called,initializing name(String property) to null
        and age(int property) to 0.  */

        /*Example_copy constructor*/

        //make a object for your sample constructor
        Example_copy_constructor ecc=new Example_copy_constructor(01,"Ravi");

        //How to call our copy constructor?. We have to pass object of sample constructor to copy values
        Example_copy_constructor ecc_copy_object=new Example_copy_constructor(ecc);

        //sample constructor's dispaly method
        ecc.display();

        //copy constructor's display method
        ecc_copy_object.display();

        //we can even change the value of copy constructor.
        System.out.println();
        System.out.println("Change the value of copy constructor(change the value of object that we construct by copying the state of another object)");
        ecc_copy_object.id=04;
        ecc_copy_object.name="Kalana";

        ecc.display();
        ecc_copy_object.display();


    }
}