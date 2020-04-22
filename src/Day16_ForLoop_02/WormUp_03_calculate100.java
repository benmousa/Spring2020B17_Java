package Day16_ForLoop_02;

public class WormUp_03_calculate100 {
    public static void main(String[] args) {

        int sum = 0;
        int sum2 = 0;

        for (int z = 0 ; z <= 100; z++ ){
            if ( z % 2 == 0)
                sum += z;
        }
        System.out.print("The sum of all even numbers is: "+sum+"\n");

        for (int z2 = 0 ; z2 <= 100; z2++ ){
            if ( z2 % 2 != 0)
                sum2 += z2;
        }
        System.out.print("The sum of all odd numbers is: "+sum2);
    }
}
