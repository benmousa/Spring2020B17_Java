package Day37_Constructors;

public class StudentsObject {

    public static void main(String[] args) {

        Student student1 = new Student("Ali", 23,'M', "CyberTek School");
      //  student1.setInfo("Ali", 23,'M', "CyberTek School");

        System.out.println(student1);

        Student student2 = new Student("Sabah", 35,'F', "Harvard");

        System.out.println(student2);
    }
}
