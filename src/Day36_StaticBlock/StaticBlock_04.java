package Day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock_04 {

    static String name = "CyberTek School";
    static Tester tester1 = new Tester();
    //tester1.setTesterInfo("Muhtar", 123, "SDET", 120000);

    int insVariable;

    static {

        name = "CyberTek School";

        tester1.setTesterInfo("Muhtar", 123, "SDET", 120000);
        tester1.setTesterInfo("Namik", 1245, "SDET", 120000);

         StaticBlock_04 obj1 = new StaticBlock_04();
                obj1.insVariable = 300;  // DO NOT use static block for initializing instance variables


    }



    public static void main(String[] args) {
        System.out.println(name);

        System.out.println(tester1);

        StaticBlock_04 obj2 = new StaticBlock_04();
        System.out.println( obj2.insVariable ); // 0
    }
}
