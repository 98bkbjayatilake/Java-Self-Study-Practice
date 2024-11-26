package Constructors_super_keyword;

public class Libary {
    String libaryName;
    int totalBooks;

    //default constructor
    Libary(){
      this("Central Libary",1000);//Calls the parameterized constructor of the same class
    }

    //parameterized constructor
    Libary(String libaryName,int totalBooks){
        this.libaryName=libaryName;
        this.totalBooks=totalBooks;
        System.out.println("Name of the libary: "+libaryName+", Total Books: "+totalBooks);
    }
}

class Section extends Libary{
    String sectionName;
    int sectionBooks;

    //default constructor
    Section(){
        this("General Section",250);//calls the parameterized constructor within the section class
    }

    Section(String sectionName, int sectionBooks){
        //call the parent class's default constructor or No-argument constructor
        super();
        this.sectionName=sectionName;
        this.sectionBooks=sectionBooks;
        System.out.println("Libary section name: "+sectionName+", Books in that section: "+sectionBooks);
    }
}


