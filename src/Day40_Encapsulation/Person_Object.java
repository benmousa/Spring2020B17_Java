package Day40_Encapsulation;

public class Person_Object {
    public static void main(String[] args) {

        Person Halla = new Person("Halla");

        Halla.setSSN(123456789);
        Halla.setID(662900000);
        System.out.println(Halla);

        System.out.println(Halla.getID());

    }}
