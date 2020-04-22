package Day16_ForLoop_02;

public class Wormup_02 {
    public static void main(String[] args) {


        for (int z = 1 ; z <= 100 ; z++){
            if ( z %2 != 0)
                if ( z %3 == 0 && z %5 == 0 )
                    System.out.print(z+" ");

        }
/*
        System.out.println("________________________________________________________________________________________________________");

        String evenNum5 = " ";

        for (int z = 1 ; z <= 100 ; z++){
            if ( z %5 != 0)
                evenNum5 += z+ " ";
        }
        System.out.print(evenNum5+",etc\n");

 */

    }
}
