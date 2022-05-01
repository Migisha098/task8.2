package pl.vistula.tasks;

public class Main {

    public static void main(String[] args) {
        Animal animal[] = new Animal[6];

        animal[0] = new Mammal("Little brown", 2, 2, "Bat");
        animal[1] = new Dog("Butkus", 7, 25, "carnivora", "Mastiff");
        animal[2] = new Bird(" Platypus", 3, 2, "Blue");
        animal[3] = new Pigeon("pablos", 9, 2, "pink", "italian");
        animal[4] = new Fish("Bait", 2, 3, "black");
        animal[5] = new Blowfish("Blowfish", 4, 6, "pink", 15);

        animal[1].getVoice();
        animal[4].getVoice();

        AnimalBehaviour animalBehaviour[] = new AnimalBehaviour[2];
        animalBehaviour[0] = (AnimalBehaviour) new Dog("Butkus", 7, 25, "Carnivora", "Mastiff");
        animalBehaviour[1]= (AnimalBehaviour) new Pigeon("Pablos",9,2,"Pink","Italian");


        animalBehaviour[0].sleep();
        animalBehaviour[1].sleep();

        for (Animal a : animal){
            a.move(a);
        }
        for (Animal a: animal){
            AnimalName.name(a.getNameFabrine57098());
        }
    }
}

