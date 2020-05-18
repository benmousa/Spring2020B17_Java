package Day40_Encapsulation;

public class Person {
    public String name;
    private long SSN;
    private long ID;

    public Person(String name){
        this.name = name;
    }

    public long getSSN(){
        return SSN;
    }

    public long getID(){
        return ID;
    }

    public void setSSN (long SSN){
        this.SSN = SSN;
    }

    public void setID (long ID){
        this.ID = ID;
    }

    public String toString(){
        return name+"ID is: "+ID+", and SSN is: "+SSN;
    }
}
