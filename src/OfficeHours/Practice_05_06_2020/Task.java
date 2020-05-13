package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class Task {
    /*
        create scrum2: 4 developers, 2 testers
        create scrum3: 5 developers, 3 testers
        create an array of scrum: {scrum1, scrum2, scrum3};
            1. iterator the array to print out all the testers who have salary > 120000
            2. print out all the developers who have salary < 120000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3};
               1. remove all the testers who have salary < 100000
               2. remove all the developers who have salary < 120000
           NOTE: DO NOT create any ArrayList of Testers or Developers.
                Use the ArrayLists in ScrumTeam class only
         */

    public static void main(String[] args) {
        Tester tester1 = new Tester();
        tester1.setTesterInfo("Maya", 5132099, "Junior SDET", 120000);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Maisoon", 1201933, "Senior SDET", 125000);

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Mohammed", 5543231, "SDET", 85000);

        Developer dev1 = new Developer();
        dev1.setDeveloperInfo("Muhtar", 3454322, "Senior Developer", 150000);

        Developer dev2 = new Developer();
        dev2.setDeveloperInfo("Ali", 35664668, "Developers' Manager", 175000);

        Developer dev3 = new Developer();
        dev3.setDeveloperInfo("Khalid", 9899383, "Junior Developer", 100000);

        Developer dev4 = new Developer();
        dev4.setDeveloperInfo("Aden", 1337632,"Developer", 98000);

        Developer dev5 = new Developer();
        dev5.setDeveloperInfo("Adel", 69090119,"Manager", 165000);

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);
        scrum1.hireTester(tester3);

        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);

        System.out.println(scrum1.developerTeam.size()+" and "+scrum1.testerTeam.size());


        ScrumTeam scrum2 = new ScrumTeam();
        scrum2.hireTester(tester1);
        scrum2.hireTester(tester2);

        scrum2.hireDeveloper(dev1);
        scrum2.hireDeveloper(dev2);
        scrum2.hireDeveloper(dev3);
        scrum2.hireDeveloper(dev4);

        System.out.println(scrum2.developerTeam.size()+" and "+scrum2.testerTeam.size());

        ScrumTeam scrum3 = new ScrumTeam();
        scrum3.hireTester(tester1);
        scrum3.hireTester(tester2);
        scrum3.hireTester(tester3);

        scrum3.hireDeveloper(dev1);
        scrum3.hireDeveloper(dev2);
        scrum3.hireDeveloper(dev3);
        scrum3.hireDeveloper(dev4);
        scrum3.hireDeveloper(dev5);

        System.out.println(scrum3.developerTeam.size()+" and "+scrum3.testerTeam.size());

        ScrumTeam[] scrumArray = { scrum1, scrum2, scrum3};

        ArrayList<ScrumTeam> list = new ArrayList<>(Arrays.asList(scrumArray));
        //list.removeIf(p-> p.testerTeam.salary)

        for ( int i = 0; i <= list.size()-1; i++){
            System.out.println();
        }



    }

}
