package Generics;

public class GenericsMainCollectionProcessor {
    public static void main(String[] args) {
        //Example 1:Processing a collection of  strings
        //<String> specifies that this instance of CollectionProcessorWithGenerics will work with strings.
        //The compiler replaces T in the CollectionProcessorWithGenerics Class with String for this instance.

        CollectionProcessorWithGenerics<String> stringProcessr=new CollectionProcessorWithGenerics<>();
        //Since <String> is specified, T is inferred as String and:
        //-only String can be added.
        //-The methods will handle Strings without requiring explicit casting.

        stringProcessr.addItem("Java");
        stringProcessr.addItem("Generics");
        stringProcessr.addItem("Example");
        stringProcessr.printAllItems();


        //Using the generic findItem method with a lambda expression
        //The lambda 's->s.startsWith("G")' defines a condition to find a String starting with "G"
        String result=stringProcessr.findItem(s->s.startsWith("G"));
        System.out.println("First string starting with 'G': "+result);

        //Example 2:Processing  a collection of Integers
        //<Integer> specifies that this instance of CollectionProcessorWithGenerics Class will work with Integers.
        //Here, T in CollectionProcessorWithGenerics is replaced with Integer.
        CollectionProcessorWithGenerics<Integer> integerProcessor=new CollectionProcessorWithGenerics<>();
        integerProcessor.addItem(10);
        integerProcessor.addItem(20);
        integerProcessor.addItem(30);
        integerProcessor.printAllItems();

        int intResult=integerProcessor.findItem(n->n>15);
        System.out.println("First number greater than 15: "+intResult);

        //Example 3-Processing a collection of custom objects
        //<Person> Specifies that this instance will work with Person objects
        //Here, T in CollectionProcessorWithGenerics is replaced with Person
        CollectionProcessorWithGenerics<Person> personProcessor=new CollectionProcessorWithGenerics<>();
        //Since<Person> is specified, T is inferred as Person
        personProcessor.addItem(new Person("Kamal",25));
        personProcessor.addItem(new Person("Nimal",30));
        personProcessor.addItem(new Person("Bimsara",35));
        personProcessor.printAllItems();

        //// Using the generic findItem method to find a Person older than 28
        Person personReult=personProcessor.findItem(p->p.getAge()>28);
        System.out.println("First person older than 25: "+personReult);

    }
}
