package Day37_Constructors;

public class Employee {
    String name;
    long id;
    int ssn;
    String jobTitle;
    int salary;
    char gender;

    public void setEmployeeInfo(String name, long id, int ssn, String jobTitle, int salary, char gender){
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString(){
        return "Name is: "+name+", Gender is: "+gender+", SSN is: "+ssn+", ID is: "+id+
                ", Job Title is: "+jobTitle+", Salary is: $"+salary;
    }
}
