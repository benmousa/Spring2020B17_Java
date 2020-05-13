package Day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {




        Salary_Calculator zareen = new Salary_Calculator(50, 40, 0.0825, 0.2);

        System.out.println(  zareen.salary());
        System.out.println(zareen);

        Salary_Calculator namik = new Salary_Calculator(62,40,8.25/100, 0.26);

        System.out.println(namik);


    }
}
