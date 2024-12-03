package Generics;

import java.util.ArrayList;
import java.util.List;

public class Generics_Main_resolve_class {
        public static void main(String[] args) {

            List<Car> vehicles=new ArrayList();//generic List( type safety)

            //Differennt types can be added//perfectly valid here.list can include any type of objects.list isn't type specefic

            /*Accidentally adding a bike type object to the vehicle list*/
            //vehicles.add(new Bike("Yamaha CT-100",90,1.10f));//give a compile time error when you use generics in that line


            vehicles.add(new Car("Toyota Axio WXB",180,78.00f));
            vehicles.add(new Car("Toyota Premio",180,96.00f));
            vehicles.add(new Car("Toyota Aqua",180,64.8f));


            //We are going to the display the details of Car type objects only
            for(Object vehicle:vehicles) {
                // Casting the current object (vehicle) to the Car type.
                // This is necessary because the List is non-generic, so it can contain objects of any type.
                Car c = (Car) vehicle;
                System.out.println("The model of car is:" + c.toString());
            }
        }
}
