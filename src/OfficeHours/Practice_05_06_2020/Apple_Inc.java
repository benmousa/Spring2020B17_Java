package OfficeHours.Practice_05_06_2020;

public class Apple_Inc {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Onur", 1234, "Junior Tester", 75000 );

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Elton John", 1245, "Junior Tester", 75000 );

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Rahman", 22222, "SDET", 120000);

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);

        scrum1.fireTester(22222);


        for ( Tester each : scrum1.testerTeam){
            System.out.println(each);
        }

        Developer dev1 = new Developer();
        dev1.setDeveloperInfo("Barzy",1122337,"Senior Developer", 120200);

        Developer dev2 = new Developer();
        dev2.setDeveloperInfo("Emrah",223232,"Usta Developer", 100000);

        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);


        scrum1.fireDeveloper(1122337);

        System.out.println(scrum1.developerTeam.size());

        for ( Developer each : scrum1.developerTeam){
            System.out.println(each);
        }

        System.out.println();

        System.out.println("In my scrum team, I have "+scrum1.testerTeam.size()+" testers, and "+scrum1.developerTeam.size()+" developers.");
    }
}
