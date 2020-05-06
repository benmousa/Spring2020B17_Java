package Day33_CustomClass_Info;

import java.util.ArrayList;
import java.util.Arrays;

public class Car_Objects_02 {
    public static void main(String[] args) {
        /*
            create 5 car objects
            put them in an array of cars
            use for loop to get each car info
            use for each loop to get each car
            info
         */

        Car car1 = new Car();
        car1.setCarInfo("Mazda", "i323", 2020, "White" );

        Car car2 = new Car();
        car2.setCarInfo("Volvo", "E400", 2020, "Blue" );

        Car car3 = new Car();
        car3.setCarInfo("Chevrolet", "Cruze", 2020, "Silver" );

        Car car4 = new Car();
        car4.setCarInfo("Hyundai", "Elantra", 2020, "Gray" );

        Car car5 = new Car();
        car5.setCarInfo("Mercedes", "GLE-350", 2020, "Black" );

        Car[] cars = {car1, car2, car3, car4, car5};



        for (int i = 0; i <= cars.length-1; i++){
            cars[i].getCarInfo();
        }
        System.out.println("><><><><><><><><><><");
        for ( Car each : cars){
            each.getCarInfo();
        }

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
    }
}
