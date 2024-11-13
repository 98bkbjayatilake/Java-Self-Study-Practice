public class Example_copy_constructor {
    int id;
    String name;


    //Sample constructor
    Example_copy_constructor(int i, String n){
        this.id=i;
        this.name=n;
    }

    //writing a custom copy constructor ourselves.
    /*A copy constructor in Java is generally written in the same class and takes an instance of that class as a parameter.
    this is used to copy the fields from the given instance to the new one, often for creating duplicate objects within the same class*/

    //copy constructor
    Example_copy_constructor(Example_copy_constructor ecc_copy){
       /*the attributes of instance which is copy of the object within the same. Therefore I think that this keyword not suitable
       (this.id=ecc_copy.id;)*/
      id=ecc_copy.id;
      name=ecc_copy.name;
    }

    void display(){
        System.out.println("Your ID is "+id+" Your name is "+name);
    }
}
