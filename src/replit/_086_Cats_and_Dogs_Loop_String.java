package replit;

import java.util.Scanner;

public class _086_Cats_and_Dogs_Loop_String {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        String[] str = word.split(" ");

        for (String each : str) {
            if (each.contains("cat")) {
                countOfCats++;
            }
            if (each.contains("dog")) {
                countOfDogs++;
            }
        }
            System.out.println(countOfCats);
            System.out.println(countOfDogs);

        }}

