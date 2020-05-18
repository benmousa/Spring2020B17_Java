package Day39_AccessModifiers;

public class Employee {
    String name;
    String jobTitle;
    long id;
    double salary;
    char gender;

    public Employee(String name) {
        this.name = name;
        jobTitle = "Unkwon";
        id = 0;
        salary = 0;
    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
        id = 0;
        salary = 0;
    }

    public Employee(String name, String jobTitle, long id) {
        this(name, jobTitle);
        this.id = id;
        salary = 0;
    }

    public Employee(String name, String jobTitle, long id, double salary) {
        this(name, jobTitle, id);
        this.salary = salary;
    }

    public Employee(String name, String jobTitle, long id, double salary, char gender) {
        this(name, jobTitle, id, salary);
        this.gender = gender;
    }
}
