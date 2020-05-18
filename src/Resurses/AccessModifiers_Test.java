package Resurses;

import Day39_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test {
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();

      //  System.out.println(obj.defaultAccess); Compile Error
        System.out.println(obj.publicAccess);

    }
}
