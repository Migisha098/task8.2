package pl.vistula.tasks;

 abstract class Animal implements AnimalMove, AnimalName {

     private String nameFabrine57098;
     private int ageFabrine57098;
     private int weightFabrin57098;


        public  Animal(){

            ageFabrine57098 = weightFabrin57098 = 0;
            nameFabrine57098 = "NL";
        }


     public Animal(String nameFabrine57098, int ageFabrine57098, int weightFabrin57098) {
         this.nameFabrine57098 = nameFabrine57098;
         this.ageFabrine57098 = ageFabrine57098;

         this.weightFabrin57098 = weightFabrin57098;
     }
     public Animal(int ageFabrine57098){ this.ageFabrine57098 = ageFabrine57098;}



     public abstract void eat(String foodName);
        public abstract void getVoice();

        public String getNameFabrine57098(){return nameFabrine57098 ;}

     public void setNameFabrine57098(String nameFabrine57098) {
         this.nameFabrine57098 = nameFabrine57098;}

     public int getAgeFabrine57098() {
         return ageFabrine57098;}

     public void setAgeFabrine57098(int ageFabrine57098) {
         this.ageFabrine57098 = ageFabrine57098;}

     public int getWeightFabrin57098() {
         return weightFabrin57098;}

     public void setWeightFabrin57098(int weightFabrin57098) {
         this.weightFabrin57098 = weightFabrin57098;}

     }


