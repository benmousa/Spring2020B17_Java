package Day37_Constructors;
import java.util.*;
public class CyberTekStudents {

    static String schoolName = "Cybertek University";
    String studentName; // we must need to know
    int groupNumber; // we must need to know
    String batch; // we must need to know

    public CyberTekStudents(){
        schoolName = "CyberTek";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return "Name: "+studentName+", Batch: "+batch+
                ", in group: "+groupNumber+", School name: "+schoolName;
    }}
    class CObjects{
     public static void main(String[] args) {
         //   CyberTekStudents student1 = new CyberTekStudents("muhtar",12,"Batch 18");
         //   student1.schoolName = "MIT";
        // System.out.println(student1);

        // CyberTekStudents student2 = new CyberTekStudents("Sarah", 12, "Batch 18");

       //  System.out.println(student2);


     }}
