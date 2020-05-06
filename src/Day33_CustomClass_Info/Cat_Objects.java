package Day33_CustomClass_Info;

import java.util.ArrayList;
import java.util.Arrays;

public class Cat_Objects {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setCatInfo("Bossy", "Sieme", "White", 2);

        System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.setCatInfo("Lala", "Abyssinian", "Brown", 2);

        System.out.println(cat2);

        Cat cat3 = new Cat();
        cat3.setCatInfo("Lily", " Persian", "Black", 3);

        System.out.println(cat3);

        ArrayList<Cat> list = new ArrayList<>(Arrays.asList(cat1, cat2, cat3));
        System.out.println("## ## ## ## ## ## ## ## ");
        for ( int i =0; i <= list.size()-1; i++){
            System.out.println(list.get(i));
        }
        System.out.println("|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();

        System.out.println("% % % % % % % % % % % % % ");
        cat1.eat("fish");
        cat2.eat("cat treat");
        cat3.eat("Kabob");
        System.out.println("=================");
        cat1.drink("water");
        cat2.drink("milk");
        cat3.drink("coffee");
    }
}
