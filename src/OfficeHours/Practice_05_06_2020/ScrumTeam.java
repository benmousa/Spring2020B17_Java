package OfficeHours.Practice_05_06_2020;

import Resurses.Test;

import java.util.ArrayList;

public class ScrumTeam {

    ArrayList<Tester> testerTeam = new ArrayList<>();

    ArrayList<Developer> developerTeam = new ArrayList<>();

    public void hireTester (Tester tester){
        testerTeam.add(tester);
    }

    public void fireTester (long id){
        testerTeam.removeIf(p-> p.employeeID == id);
    }


    public void hireDeveloper(Developer developer){
        developerTeam.add(developer);
    }

    public void fireDeveloper (long id){
        developerTeam.removeIf(p-> p.employeeID == id);
    }
}
