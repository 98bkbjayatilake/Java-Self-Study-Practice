package Constructors_super_keyword;

//class person implements cloneable interface to indicate it supports clonning(clone() method)
public class Person implements Cloneable {
String name;
int age;

Person(String name,int age){
    this.name=name;
    this.age=age;
}

//override the clone() method to enable object copying
// the clone() method may throw a cloneNotSupportedException,so we need to handle it

    //If the annotated method does not actually override anything, the compiler issues a warning.
@Override
protected Object clone() throws CloneNotSupportedException{
    //call the superclass's clone() method to perform the default cloning
    return super.clone();
}

@Override
// Override the toString() method for a readable representation of the object
public String  toString() {
    return "Constructors_super_keyword.Person{name='"+name+"',age="+age+"}";
}
}


