package Day21_MultiDimensionalArrays;

public class Scrum_Team {
    public static void main(String[] args) {

        String [] DevTeams = {"Zeynep", "Haidar", "Jovid", "Muhtar"};
        String [] TestersTeam = {"Rahman", "Aishan", "Osman", "Ali"};


        String ScrumTeam[] [] = {DevTeams, TestersTeam};
                               //     0   ,     1
        ScrumTeam [0] [3] = "Jean";
        System.out.println(ScrumTeam[0] [3]);

        String info = ScrumTeam[1] [2];
        System.out.println(info);

        char[] ch3 = {9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733, 9733 };
        System.out.println(ch3);

        for ( String eachName: ScrumTeam[1]){
            System.out.println(eachName);
            continue;

        }


    }

}
