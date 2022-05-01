package pl.vistula.tasks;

public  class Fish extends Animal {

    private String ScaleColorFabrine57098;

    public Fish() {
        super();
        ScaleColorFabrine57098 = "NN";

    }


    public Fish(String nameFabrine57098, int ageFabrine57098, int weightFabrin57098, String scalesColorFabrine57098) {
        super(nameFabrine57098, ageFabrine57098, weightFabrin57098);
        ScaleColorFabrine57098 = scalesColorFabrine57098;
    }

    public Fish(int ageFabrine57098, String scalesColorFabrine57098) {
        super(ageFabrine57098);
        ScaleColorFabrine57098 = ScaleColorFabrine57098;
    }

    public Fish(String scalesColorFabrine57098) {
    }

    public Fish(String nameFabrine57098, int ageFabrine57098, int weightFabrin57098) {
    }

    public void swim() {
        System.out.println("The fish is swimming ");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("The fish is eating " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("The fish makes a sound. ");
    }

    public String getScalescolor() {
        return ScaleColorFabrine57098;
    }

    public void setScaleColor(String scaleColorFabrine57098) {
        this.ScaleColorFabrine57098 = scaleColorFabrine57098;
    }

    @Override
    public String toString() {
        return "Fish { " + "scalesColor " + ScaleColorFabrine57098 + '\'' + '}';
    }
}










