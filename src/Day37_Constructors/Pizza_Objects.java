package Day37_Constructors;

import Day37_Constructors.Pizza;

public class Pizza_Objects {
    public static void main(String[] args) {

        Pizza Medo = new Pizza();
        Medo.setPizzaInfo("small",2, 3);
        System.out.println(Medo);

        Pizza Maisoon = new Pizza();
        Maisoon.setPizzaInfo("large", 1, 5);
        System.out.println(Maisoon);
    }
}
