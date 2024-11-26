package Constructors_super_keyword;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Committeemember cm=new Committeemember();
        //cm.showRole();

        Onlinecourse oc=new Onlinecourse();
        //oc.details();

        // Creating a Constructors_super_keyword.Dog object to demonstrate constructor chaining with super() constructor
        //Constructors_super_keyword.Dog dg=new Constructors_super_keyword.Dog("Canis lupus",true,"Golden Retriever");

        Student st=new Student();//The default constructor is called here

       // System.out.println("Name: "+st.name);
       // System.out.println("Age: "+st.age);
        /*since no constructor is defined in the Constructors_super_keyword.Student class, Java automatically provides a default,no-argument constructor
         When the st object is created,this default constructor is called,initializing name(String property) to null
        and age(int property) to 0.  */

        /*Example_copy constructor-method1-typical custom copy constructor*/

        //make a object for your sample constructor
        Example_copy_constructor ecc=new Example_copy_constructor(01,"Ravi");

        //How to call our copy constructor?. We have to pass object of sample constructor to copy values
        Example_copy_constructor ecc_copy_object=new Example_copy_constructor(ecc);

        //sample constructor's dispaly method
        //ecc.display();

        //copy constructor's display method
        //ecc_copy_object.display();

        //we can even change the value of copy constructor.
        //System.out.println();
        //System.out.println("Change the value of copy constructor(change the value of object that we construct by copying the state of another object)");
        ecc_copy_object.id=04;
        ecc_copy_object.name="Kalana";

        //ecc.display();
        //ecc_copy_object.display();

        /*Example copy constructor-method 2-clone() method*/

        //create p1 object which is an original object
        Person p1=new Person("Aruna de silva",30) ;

        try {
            //Clone the p1 object which is the original one
            Person p2 = (Person) p1.clone();


            //print the orginal and cloned objects

            /*When you pass an object(like p1 or p2) to system.out.println, Java automatically calls the object's toString() method behind the scenes to get its string representation */
            //System.out.println("Original: " + p1);
            //System.out.println("Cloned: "+p2);

            // Demonstrate that the cloned object is a separate instance
            //System.out.println("Are they same object? "+(p1==p2));

        }
        catch (CloneNotSupportedException e){
            //Handle the exception if cloning is not supported
            //printStackTrace is method of throwable class which prints the throwable along with other details like the line number and class name where the exception occured
            e.printStackTrace();
        }

        /*Constructor chaining-both super() and this()*/
        Section s1=new Section();


    }
}