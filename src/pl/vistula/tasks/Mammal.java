package pl.vistula.tasks;

public class Mammal extends Animal {

    private String orderFabrine57098;

    public Mammal() {
        super();
        orderFabrine57098 = "NL";
    }

    public Mammal(String nameFabrine57098, int ageFabrine57098, int weightFabrin57098, String orderFabrine57098) {
        super(nameFabrine57098, ageFabrine57098, weightFabrin57098);
        this.orderFabrine57098 = orderFabrine57098;
    }

    public Mammal(int ageFabrine57098, String orderFabrine57098) {
        super(ageFabrine57098);
        this.orderFabrine57098 = orderFabrine57098;
    }


    public void drinkMilk() {
        System.out.println(" suup suup ");
    }


    @Override
    public void eat(String foodName) {
        System.out.println("Mammal is eating :" + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println(" Mammal is making sound ");
    }

    public String getOrderFabrine57098() {
        return orderFabrine57098;
    }

    public void setOrderFabrine57098(String orderFabrine57098) {
        this.orderFabrine57098 = orderFabrine57098;
    }

    @Override
    public String toString() {
        return "Mammal{ " + " orderFabrine57098 = ' " + orderFabrine57098 + "' " + '}';
    }
}
