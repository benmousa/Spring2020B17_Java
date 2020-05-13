package Day35_Static;

public class Student {
    String name;
    long id;
    double gpa;
    static String school = "CyberTek";

    public void setInfo(String name, long id, double gpa){
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public static void printSchoolName(){
        System.out.println("School Name is: "+school);
    }

    public String toString (){
        return "Student Name: "+name+", School Name is: "+school+", ID Number is: "+id+", GPA is: ";
    }
}
