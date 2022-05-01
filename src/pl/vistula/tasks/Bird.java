package pl.vistula.tasks;

public  class Bird extends Animal {

    private String FeatherColorFabrine57098;

    public Bird() {
        super();
        FeatherColorFabrine57098 = "NL";
    }

    public Bird(String featherColorFabrine57098) {
        FeatherColorFabrine57098 = featherColorFabrine57098;
    }

    public Bird(String nameFabrine57098, int ageFabrine57098, int weightFabrin57098, String featherColorFabrine57098) {
        super(nameFabrine57098, ageFabrine57098, weightFabrin57098);
        FeatherColorFabrine57098 = featherColorFabrine57098;
    }

    public Bird(int ageFabrine57098, String featherColorFabrine57098) {
        super(ageFabrine57098);
        FeatherColorFabrine57098 = featherColorFabrine57098;
    }


    public void layEggs() {
        System.out.println("The bird is laid eggs");
    }

    public void eat(String foodName) {
        System.out.println(" This bird is eating " + foodName);
    }


    public void getVoice() {
        System.out.println("Mammal is making sound ");

    }
    public String getFeatherColorFabrine57098(){
        return FeatherColorFabrine57098;
    }

    public void setFeatherColorFabrine57098 (String featherColorFabrine57098){
        this.FeatherColorFabrine57098 = featherColorFabrine57098;
    }

    public  String toString(){
        return "Bird{" + "FeatherColor"+ FeatherColorFabrine57098 +'/' ;

    }



}



