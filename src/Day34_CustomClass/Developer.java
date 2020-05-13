package Day34_CustomClass;

public class Developer {
    /*
    create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()

     */

    String name;
    long employeeID;
    String jobTitle;
    double salary;

    public void setDeveloperInfo (String name, long employeeID, String jobTitle, double salary){
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding (){
        System.out.println(name+" is Coding");
    }

    public void fixingBugs () {
        System.out.println(name+" is fixing Bugs !");
    }
}
