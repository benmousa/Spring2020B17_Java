package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer_Object {
    public static void main(String[] args) {

        Developer developer1 =  new Developer();
        developer1.setDeveloperInfo("Adnan", 765431234, "Programer", 99000.90);

        System.out.println(developer1);

        Developer developer2 =  new Developer();
        developer2.setDeveloperInfo("Leon",12546,"Senior Developer",180000);

        developer1.coding();
        developer2.coding();

        developer1.fixingBugs();
        developer2.fixingBugs();
        System.out.println("=========================");

        Developer[] developers = { developer1, developer2};

        for (int i = 0; i <= developers.length-1; i++){
            System.out.println(developers[i]);
        }

        System.out.println("## ## ## ## ## ## ## ## ## ## ## ## ## ## ##");
        for ( Developer each : developers){
            System.out.println(each.name+" "+each.salary);
        }

        System.out.println("$$ $$ $$ $$ $$ $$ $$ $$ $$ $$ $$ $$ $$ $$ $$ $$ $$");

        ArrayList<Developer> list = new ArrayList<>();
        list.addAll(Arrays.asList(developers));

        System.out.println(list.size());

        for ( int i = 0; i <= list.size()-1; i++){
            System.out.println(list.get(i));
        }
        System.out.println("@.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@ @.@");

        for ( Developer each : list){
            System.out.println(each);
        }




    }
}
