package Day33_CustomClass_Info;

public class Car_Objects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.Brand = "BMW";
        car1.Model = "X5";
        car1.Year = 2020;
        car1.Color = "Black";

        System.out.println(car1.Brand);
        System.out.println(car1.Model);
        System.out.println(car1.Year);
        System.out.println(car1.Color);

        car1.start();
        car1.drive();
        car1.getCarInfo();


        System.out.println("><:><:><:><:><:><:><:><:><:><");
        Car car2 = new Car();
        car2.Brand = "Toyota";
        car2.Model = "Camry";
        car2.Year = 2019;
        car2.Color = "White";

        System.out.println(car2.Brand);
        System.out.println(car2.Model);
        System.out.println(car2.Year);
        System.out.println(car2.Color);

        car2.start();
        car2.drive();
        car2.getCarInfo();
        System.out.println("><:><:><:><:><:><:><:><:><:><");

        Car car3 = new Car();
        car3.Brand = "Mercedes";
        car3.Model = "GLE-350";
        car3.Year = 2020;
        car3.Color = "White";

        car3.getCarInfo();
        car3.start();
        car3.drive();
        System.out.println("## ## ## ## ## ## ## ## ##");
        Car[] cars = { car1, car2, car3};
        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();

    }
}
