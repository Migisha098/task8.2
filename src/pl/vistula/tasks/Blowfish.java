package pl.vistula.tasks;

public class Blowfish extends Fish{
    private int diameterFabrine57098;
    public Blowfish(){
        super();
        diameterFabrine57098 =0;
    }

    public Blowfish(int diameterFabrine57098) {
        this.diameterFabrine57098 = diameterFabrine57098;
    }

    public Blowfish(String nameFabrine57098, int ageFabrine57098, int weightFabrin57098, String scalesColorFabrine57098, int diameterFabrine57098) {
        super(nameFabrine57098, ageFabrine57098, weightFabrin57098, scalesColorFabrine57098);
        this.diameterFabrine57098 = diameterFabrine57098;
    }

    public Blowfish(int ageFabrine57098, String scalesColorFabrine57098, int diameterFabrine57098) {
        super(ageFabrine57098, scalesColorFabrine57098);
        this.diameterFabrine57098 = diameterFabrine57098;
    }

    public Blowfish(String scalesColorFabrine57098, int diameterFabrine57098) {
        super(scalesColorFabrine57098);
        this.diameterFabrine57098 = diameterFabrine57098;
    }

    public Blowfish(String nameFabrine57098, int ageFabrine57098, int weightFabrin57098, int diameterFabrine57098) {
        super(nameFabrine57098, ageFabrine57098, weightFabrin57098);
        this.diameterFabrine57098 = diameterFabrine57098;
    }




    public void blows(){
        System.out.println( "The blowfish pumped up");
    }
    @Override
    public void swim(){
        System.out.println("Blowfish swims");
    }
    @Override
    public void eat(String foodName){
        System.out.println("Blowfish eats "+ foodName);
    }
    @Override
    public void getVoice(){
        System.out.println("Blowfish makes sound ");
    }
    public int getDiameterFabrine57098(){return diameterFabrine57098;}
    public void setDiameterFabrine57098(int diameterFabrine57098){this.diameterFabrine57098= diameterFabrine57098;}
    @Override
    public String toString(){
        return "Blowfish{ " + "diameter"+ diameterFabrine57098 +'}';
    }
}
