package Resurses;

import Day40_Encapsulation.Encapsulation;

public class Encapsulation_Test {
    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //obj.SSN = 2345678;

        System.out.println(obj.getSSN());

        obj.setSSN(7654321);

        System.out.println(obj.getSSN());

    }
}
