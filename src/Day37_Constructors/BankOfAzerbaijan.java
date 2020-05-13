package Day37_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaijan {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>(Arrays.asList(HumanResources.emp2, HumanResources.emp5));


        for (Employee each : list){
            System.out.println(each);
        }

    }
}
