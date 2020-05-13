package Day38_Constructors;

public class Circle_object {
    public static void main(String[] args) {


    double r = 5.5;

    Circle circle1 = new Circle(r);

    double areaOfCircle = circle1.area();

        System.out.println(areaOfCircle);
        System.out.println("Perimeter is: "+ circle1.perimeter());
        System.out.println("Area is: " +areaOfCircle  );



    }}
