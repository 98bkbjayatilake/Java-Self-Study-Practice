package Constructors_super_keyword;

/*Can we call the parent class constructor in a subclass constructor using the super keyword?
If yes, how does constructor chaining work in this context?*/
public class Animal {
    String species;

    //parent class constructor
    public Animal(String species_parent){
        this.species=species_parent;
        System.out.println("specie of the Animal: "+species);
    }
}

class Mamal extends Animal{
    boolean hasFur;

    public Mamal(String species,boolean hasFur){
        // we have to pass the value of species parameter to the constructor of parent class which is Constructors_super_keyword.Animal
        super(species);
        //we assign the value of hasFur parameter to this class's(Constructors_super_keyword.Mamal class's) hasFur property
        this.hasFur=hasFur;

        System.out.println("That animals are included in  Mammals. They have "+(hasFur?"Fur":"no Fur"));
    }
}

class Dog extends Mamal{
    String breed;
     /*Constructors_super_keyword.Mamal class has hasFur property itself. Also it inherit species property from Constructors_super_keyword.Animal class
     that is it's parent class. Constructors_super_keyword.Dog is a child class of Constructors_super_keyword.Mamal Class. Therefore Constructors_super_keyword.Dog class has three properties
     that are species, hasFur and breed*/
    public Dog(String species, boolean hasFur,String breed){

        super(species,hasFur);//call the Constructors_super_keyword.Mamal parent class.
        this.breed=breed;
        System.out.println("Breed of the Animal: "+breed);

    }
}

