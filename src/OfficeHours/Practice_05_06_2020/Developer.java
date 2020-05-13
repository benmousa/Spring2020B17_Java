package OfficeHours.Practice_05_06_2020;

public class Developer {

    /*
    create a class called Developers
			Attributes:
				name, employeeId, JobTitle, Salary
			Actions:
				setDeveloperInfo(), coding(), fixingBugs()

     */

    String name;
    String jobTitle;
    long employeeID;
    double salary;

    public void setDeveloperInfo(String name, long employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void coding() {
        System.out.println(name + " is Coding!");
    }

    public void fixingBugs() {
        System.out.println(name + " is fixing Bugs!");
    }

    public String toString() {
        return "Name: " + name + ", Job Title: " + jobTitle + ", Employee ID is: " + employeeID + ", Salary is: " + salary;
    }
}
