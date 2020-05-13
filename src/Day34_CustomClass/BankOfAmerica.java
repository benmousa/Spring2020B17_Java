package Day34_CustomClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {

    /*
    create a class called BankOfAmerica:
				Bank of America in VA is planning to create a scrum teams:
						4 developers 2 testers
				 create a arrayList of scrum team and:
						 1. use the for loop to print out every single employees from BOA' scrum teams
						 2. calculate the total budgets of the scrumTeam
     */

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Ali", 321123, "QA", 130000);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Venera",234567834,"Senior SDET",130000 );

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Sha Rejepov",6235487,"SDET",100000);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Muhtar",111, "Manual Tester", 120000);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("John", 22222, "Uber Driver", 60000);

        ArrayList<Tester> testers = new ArrayList<>(Arrays.asList(tester1, tester2, tester3, tester4, tester5));

        testers.removeIf(p-> ! p.jobTitle.contains("SDET") );

        double totalBudget = 0;
        for ( Tester each : testers){
            System.out.println(each);
           totalBudget += each.salary;
        }
        System.out.println(totalBudget);


    }

}
