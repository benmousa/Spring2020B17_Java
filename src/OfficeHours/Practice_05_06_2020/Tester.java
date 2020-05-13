package OfficeHours.Practice_05_06_2020;

public class Tester {

    /*
    create a class called Testers
			Attributes:
				name, employeeID, JobTitle, Salary
			Actions:
				setTesterInfo(), smokeTesting(),  creatingTicket();
     */

        String name;
        long employeeID;
        String jobTitle;
        double salary;

        public void setTesterInfo(String name, long employeeID, String jobTitle, double salary){
            this.name = name;
            this.employeeID = employeeID;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public void smokeTesting(){
            System.out.println(name+" is doing smoke test");
        }

        public void creatingTicket(){
            System.out.println(name+" is creating a ticket on Jira");
        }

        public String toString(){
            return "Name: "+name+", Job Title: "+jobTitle+", Employee ID is: "+employeeID+", Salary is: "+salary;
        }
    }
