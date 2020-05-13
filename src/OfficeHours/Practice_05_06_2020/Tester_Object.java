package OfficeHours.Practice_05_06_2020;

public class Tester_Object {
    public static void main(String[] args) {


        Tester tester1 = new Tester();
        tester1.setTesterInfo("Muhtr", 76544567, "Senior SDET", 75050 );

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Yousef", 98766789, "Junior SDET", 60000 );

        tester1.smokeTesting();
        tester2.creatingTicket();
    }
}
