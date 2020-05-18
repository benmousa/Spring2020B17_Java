package Day39_AccessModifiers;

public class Car {

    String brand;
    String model;
    int year;
    double price;

    public Car(String brand){
        this.brand = brand;
        model = "Unkwon";
        year = 0;
        price = 0;
    }
    public Car(String brand, String model){
        this(brand);
        this.model = model;
        year = 0;
        price = 0;
    }
    public Car(String brand, String model, int year){
        this(brand, model);
        this.year = year;
        price = 0;
    }
    public Car(String brand, String model, int year, double price){
        this(brand, model, year);
        this.price = price;
    }

    public String toString(){
        return year+" "+brand+" "+model+" $"+price;
    }
}
