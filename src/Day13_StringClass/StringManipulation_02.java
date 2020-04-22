package Day13_StringClass;

public class StringManipulation_02 {
    public static void main(String[] args) {

        String str = "CyberTek school is the best";

        String schoolName = str.substring(0,8);

        System.out.println(schoolName);

        String fullname = "Kuzzat Altay";
        String firstName;
        String lastName = fullname.substring(7,11+1);

        System.out.println(lastName);





    }
}
