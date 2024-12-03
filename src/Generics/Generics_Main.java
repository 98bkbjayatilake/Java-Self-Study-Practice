package Generics;
import java.util.ArrayList;
import java.util.List;

public class Generics_Main {
    public static void main(String[] args) {
     //ArrayList is a class that implements the List interface.it provides the actual implementation of all the methods defined in the list interface.
     //Use Arraylist when you specially want an implementation of the List interface backed by a dynamic array,which is often the best choice for  most use cases where fast access and resizing important
        /*Using List as a reference type./*Using ArrayList as the concrete implementation.
        concrete implementation means the actual class(ArrayList) provides the working code for all the methods defined in the List interfave,such as add(),get(),and remove()*/

    List vehicles=new ArrayList();//Non-generic List(No type safety)

        //Differennt types can be added//perfectly valid here.list can include any type of objects.list isn't type specefic

        /*Accidentally adding a bike type object to the vehicle list*/
        vehicles.add(new Bike("Yamaha CT-100",90,1.10f));


    vehicles.add(new Car("Toyota Axio WXB",180,78.00f));
    vehicles.add(new Car("Toyota Premio",180,96.00f));
    vehicles.add(new Car("Toyota Aqua",180,64.8f));


    //We are going to the display the details of Car type objects only
    for(Object vehicle:vehicles){
        // Casting the current object (vehicle) to the Car type.
        // This is necessary because the List is non-generic, so it can contain objects of any type.
        Car c =(Car)vehicle;
        System.out.println("The model of car is:"+c.toString()
        );
    }
/*above code don't shown any error.it means it doesn't have compile time error.
But when run the program it show a run-time error .Because we can't cast a bike type object to a Car type object .
We will only get a runtime error.we would of course like to be able to be warned about this potentai error already at compile time. We can use java generics to do that.
 */

//We resolve that in  Generics_Main_resolve class
    }
}
