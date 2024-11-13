
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
        // we have to pass the value of species parameter to the constructor of parent class which is Animal
        super(species);
        //we assign the value of hasFur parameter to this class's(Mamal class's) hasFur property
        this.hasFur=hasFur;

        System.out.println("That animals are included in  Mammals. They have "+(hasFur?"Fur":"no Fur"));
    }
}

class Dog extends Mamal{
    String breed;
     /*Mamal class has hasFur property itself. Also it inherit species property from Animal class
     that is it's parent class. Dog is a child class of Mamal Class. Therefore Dog class has three properties
     that are species, hasFur and breed*/
    public Dog(String species, boolean hasFur,String breed){

        super(species,hasFur);//call the Mamal parent class.
        this.breed=breed;
        System.out.println("Breed of the Animal: "+breed);

    }
}

