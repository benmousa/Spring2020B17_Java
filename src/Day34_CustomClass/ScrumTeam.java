package Day34_CustomClass;

import Resurses.Test;

import java.util.ArrayList;

public class ScrumTeam {

        ArrayList<Tester> testersTeam = new ArrayList<>();

        public void hireTesters (Tester tester){
            testersTeam.add(tester);
        }

        public void firedtester (long employeeID ){
            testersTeam.removeIf(p-> p.employeeID == employeeID);
        }





}
