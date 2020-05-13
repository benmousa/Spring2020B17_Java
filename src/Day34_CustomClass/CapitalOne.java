package Day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Muhtar", 123, "Manual Tester", 70000);

        Tester tester2 = new Tester();
        tester1.setTesterInfo("Ali", 432, "Manual Tester", 74000);


        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTesters(tester1);
        scrum.hireTesters(tester2);

        System.out.println(scrum.testersTeam.size());

        scrum.firedtester(432);

        System.out.println(scrum.testersTeam.size());

    }
}
