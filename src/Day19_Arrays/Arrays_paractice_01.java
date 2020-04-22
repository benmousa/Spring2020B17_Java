package Day19_Arrays;

public class Arrays_paractice_01 {
    public static void main(String[] args) {

        String [] friends = {"Ali", "Mohammed", "Osama", "Muntaha" };

      System.out.println(friends[2]);
        System.out.println();
        for (int  j = 1; j <= 5;j++){
            String name = friends[1];
            System.out.println(name);
        }

        String[] emails = {"Cybertek@yahoo.com", "Cybertek@gmail.com", "Cybertek@hotmail.com","Cybertek@outlook.com"};

        for (int i = 0; i <= 6; i++){
            String gmail = emails[i];
            if (gmail.endsWith("gmail.com"));
            System.out.println(gmail);
        }

    }
}
