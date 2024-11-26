package Constructors_super_keyword;/*Can we call parent class method in sub class by using super keyword.*/

//EX-there are many types of software engineering courses. The common attribute include in the parent class.
public class Course {
    String coursename="Software Engineering";
    int duration=4;//duration in moths

    void details(){
        System.out.println("Course Name: "+coursename);
        System.out.println("Duration "+duration+" months");
    }
}

/*Constructors_super_keyword.Onlinecourse is  a type of software engineering courses in this example.
  Constructors_super_keyword.Onlinecourse some unique attributes like platform and isSelfPaced*/
class Onlinecourse extends Course{
     String platform="Coursera";
     Boolean isselfpaced=true;

     void details(){
         System.out.println("Online Course details....");
         // we should call the parent class details() method to display the common details of the course. They are also belong to Constructors_super_keyword.Onlinecourse class
         super.details();
         System.out.println("Platform: "+platform);
         /*ternary Operator(? :)
         condition ? value_if_true(value if the condition is true) : value_if_false(value if the condition is false );*/
         System.out.println(
                 "Selfpaced: "+ (isselfpaced?"Yes":"No")
         );
     }
}
