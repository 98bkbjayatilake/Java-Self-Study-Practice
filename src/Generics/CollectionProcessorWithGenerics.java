package Generics;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

//Generic utility class for handling a collection of any type
/* <T> indicates that this class is generic and T is the placeholder for the type*/
public class CollectionProcessorWithGenerics<T> {
    // A list to store elements of type T(type determined when an object of this class is created)
    private List<T> items;

    //Constructor intializes the list
    public  CollectionProcessorWithGenerics(){
        items=new ArrayList<>();
    }

    //Method to add item to the collection
    //Since T is the type of this class,the parameter must also be of type T
    public  void addItem(T element){
        items.add(element);
    }

    //The collection stores elements of type T.so this method works with any type.
    public void  printAllItems(){
        System.out.println("Collection Contains: ");
        for(T item:items){//loop through the items,treating each as type T
           System.out.println(item);// The actual type(e.g., String, Integer) is resolved at runtime
        }
    }

    //Generic method to find the first item  that matches a given condition
    public T findItem(Predicate<T> condition){
        for(T item:items){
            if(condition.test(item)){
                return item;
            }
        }
    return null;//return  null if no match is found
    }
}
