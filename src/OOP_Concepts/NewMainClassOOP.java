package OOP_Concepts;

public class NewMainClassOOP {
    public static void main(String[] args) {
        /*Polymorphism-Example 1-basic*/

        Shape shapes[]=new Shape[2];

        //All decimal literals (numbers with a fractional part, like 2.3) are interpreted as double unless explicitly specified as a float by appending an f or F.
        shapes[0]=new Circle(4.2478f);
        //create a object of Rectangle class and store it inside the zero index of shapes array
        shapes[1]=new Rectangle(9.417f,7.0f);

        //A one way to dispaly the calculate areas
        //System.out.println("The area of your circle is "+shapes[0].calculateArea());
        //System.out.println("The area of your rectangle is "+shapes[1].calculateArea());

        //another way
        /*
        for (dataType element : array) {
    // Access and use the element
        }
        */

        //Cicle and rectangle are types of Shape

        //getClass(): Returns the runtime Class object of the instance.
        //getSimpleName(): Returns the simple name of the class as a String.
        for(Shape shape:shapes){
            System.out.println("The area of your "+shape.getClass().getSimpleName()+" is "+shape.calculateArea());
        }
    }
}
