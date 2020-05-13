package Day37_Constructors;

import javax.imageio.stream.ImageInputStream;

public class HumanResources {
    static Employee emp1 = new Employee();

    static Employee emp2 = new Employee();

    static Employee emp3 = new Employee();

    static Employee emp4 = new Employee();

    static Employee emp5 = new Employee();


    static {

        emp1.setEmployeeInfo("Muhtar", 1233211, 664332897, "Manager", 120000, 'M' );

        emp2.setEmployeeInfo("Omran", 4567321, 435776231, " Junior SEDT", 85000, 'M' );

        emp3.setEmployeeInfo("Sabah", 6543654, 864338732, "Senior SEDT", 98000, 'F' );

        emp4.setEmployeeInfo("Muhtar", 8975432, 887441234, "Senior Admin", 115000, 'M' );

        emp5.setEmployeeInfo("Loza", 7653125, 987443211, "Project Manager", 100000, 'F' );


    }
}

