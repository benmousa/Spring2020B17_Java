package Day36_StaticBlock;

import Day34_CustomClass.Tester;

public class StaticBlock_02 {
    static int a = 100;
    static int b = 200;
    int c = 300;

    static Tester tester1 = new Tester();

    public static void main(String[] args) {

        System.out.println(tester1);

    }

    static{
        a =100;
        b= 200;
        // c = 300; // static only accepts static
        if(100 > 200){
            a = 100;
        }else{
            b= 200;
        }

        tester1.setTesterInfo("Jean", 123, "SDET", 120000);


    }


}
