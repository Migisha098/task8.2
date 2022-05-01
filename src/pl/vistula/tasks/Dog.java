package pl.vistula.tasks;

public class Dog extends Mammal implements AnimalBehaviour,AnimalMove{
    private String breedFabrine57098;

    Dog(){
        super();
        breedFabrine57098 = "NL";
    }

    public Dog(String breedFabrine57098) {
        this.breedFabrine57098 = breedFabrine57098;
    }

    public Dog(String nameFabrine57098, int ageFabrine57098, int weightFabrin57098, String orderFabrine57098, String breedFabrine57098) {
        super(nameFabrine57098, ageFabrine57098, weightFabrin57098, orderFabrine57098);
        this.breedFabrine57098 = breedFabrine57098;
    }

    public Dog(int ageFabrine57098, String orderFabrine57098, String breedFabrine57098) {
        super(ageFabrine57098, orderFabrine57098);
        this.breedFabrine57098 = breedFabrine57098;
    }

    @Override
    public void drinkMilk (){
        System.out.println(" The dog is drinking milk.");
    }
    @Override
    public void getVoice (){
        System.out.println("The dog is barking.");
    }
    @Override
    public void eat(String foodName){
        System.out.println(" The dog is eating "+ foodName);
    }
    public String getBreedFabrine57098(){return breedFabrine57098 ;}

    public Void setBreedFabrine57098;{ this.breedFabrine57098 = breedFabrine57098;}

    @Override
    public String toString() {
        return "Dog {" + "breedFabrine57098 = ' " + breedFabrine57098 + "' " + '}';
    }


    @Override
    public void sleep() {
        System.out.println(" ssss");

    }

    @Override
    public void move(Object ob) {
        System.out.println(ob.getClass().getSimpleName() + "Move");

    }
}

