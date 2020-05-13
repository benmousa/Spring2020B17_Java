package Day34_CustomClass;

import java.util.ArrayList;

public class Dog_Objects_02 {
    public static void main(String[] args) {

        String food1 = "Chicken";
        String food2 = "Fish";

        String drink1 = "milk";
        String drink2 = "coffee";

        String toy1 = "Ps4";
        String toy2 = "Piano";

        String subject1 = "Java";
        String subject2 = "Art";

        Dog dog1 = new Dog();
        dog1.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        Dog dog2 = new Dog();
        dog2.setDogInfo("Chihua Hua","Smal",1,"Brown","Tuzik");

        dog2.eating(food1);
        dog1.eating(food2);
        System.out.println();

        dog2.drinking(drink1);
        dog1.drinking(drink2);
        System.out.println();

        dog1.playing(toy2);
        dog2.playing(toy1);
        System.out.println("><><><><><><><><><><><><><><><><><><><><><><><><><><><");

        Dog dog3 = new Dog();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");

        Dog dog4 = new Dog();
        dog4.setDogInfo("Kangal","Huge",5,"White","Comar");

        Dog[] dogPark = { dog1, dog2, dog3, dog4};

        for ( int i = 0; i <= dogPark.length-1; i++){
            dogPark[i].eating("Chicken");
        }

        System.out.println();

        for ( Dog each : dogPark){
            each.drinking("Water");
        }

        for ( int i = 0; i <= dogPark.length-1; i++){
            dogPark[i].playing("football");
        }

        for ( Dog each : dogPark){
            each.studying("java");
        }

    }
}
