package pl.vistula.tasks;

public class Pigeon extends Bird implements AnimalBehaviour,AnimalMove {
    private String SpeciesFabrine57098;

    Pigeon() {
        super();
        SpeciesFabrine57098 = "NN";
    }

    public Pigeon(String speciesFabrine57098) {
        SpeciesFabrine57098 = speciesFabrine57098;
    }

    public Pigeon(String featherColorFabrine57098, String speciesFabrine57098) {
        super(featherColorFabrine57098);
        SpeciesFabrine57098 = speciesFabrine57098;
    }

    public Pigeon(String nameFabrine57098, int ageFabrine57098, int weightFabrin57098, String featherColorFabrine57098, String speciesFabrine57098) {
        super(nameFabrine57098, ageFabrine57098, weightFabrin57098, featherColorFabrine57098);
        SpeciesFabrine57098 = speciesFabrine57098;
    }

    public Pigeon(int ageFabrine57098, String featherColorFabrine57098, String speciesFabrine57098) {
        super(ageFabrine57098, featherColorFabrine57098);
        SpeciesFabrine57098 = speciesFabrine57098;
    }


    @Override
    public void eat(String foodName) {
        System.out.println("Pigeon is eating " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println(" shio shiooo");
    }

    public String getSpeciesFabrine57098() {
        return SpeciesFabrine57098;
    }

    public void setSpeciesFabrine57098(String speciesFabrine57098) {
        SpeciesFabrine57098 = speciesFabrine57098;
    }

    @Override
    public String toString() {
        return "Pigeon {" + "Species  = ' " + SpeciesFabrine57098 + "' " + '}';
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


