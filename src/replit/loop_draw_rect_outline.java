package replit;

import java.util.Scanner;

public class loop_draw_rect_outline {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();

        for ( int i = n ; i <= n ; i++){
            System.out.println("xxx");
            for ( int j = 1; j <=i ; j++){
                System.out.println("x x");
            }
            System.out.println("xxx");
        }

    }
}
