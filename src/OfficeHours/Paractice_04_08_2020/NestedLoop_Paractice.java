package OfficeHours.Paractice_04_08_2020;

public class NestedLoop_Paractice {
    public static void main(String[] args) {

        int j = 5;

        while (j <= 10) {
            j++;
            for (int i = 10; i <= 50; i += 10) {
                System.out.print(i + " ");
            }


        }
        System.out.println("*************");

        int z = 1;
        while (z <= 8) {
            System.out.println();
            for (int x = 1; x <= 6; x++) {
                System.out.print("* ");
            }
            z++;
        }
        System.out.println("\n########################################");

        for (int a = 1; a <= 15; a++) {
            System.out.println();
            for (int b = 1; b <= 20; b++) {
                System.out.print("* ");

            }
        }

        System.out.println("\n><><><><><><><><><><><><><><><><><><><");

        for (int c = 1; c <= 7; c++) {
            System.out.println();

            for (int d = 1; d <= c; d++) {
                System.out.print("* ");
            }
        }
        for (int m = 6; m >= 1; m--) {
            System.out.println();

            for (int n = 1; n <= m; n++) {
                System.out.print("* ");


            }
        }
    }}
