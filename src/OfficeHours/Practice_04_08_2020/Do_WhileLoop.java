package OfficeHours.Practice_04_08_2020;

public class Do_WhileLoop {
    public static void main(String[] args) {

        boolean b = false;

        do {
            System.out.println(" Hello World");
        }
        while (b);
        System.out.println("================");

        while (b){
            System.out.println("Hello World");
        }
        System.out.println("******************");

        int j = 0;

        do {
            if ( j %15 ==0)
            System.out.println("Hello World");
            j++;
        }
        while (j <= 100);
    }
}
