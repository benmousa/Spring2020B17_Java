package Day16_ForLoop_02;

public class WormUp_01 {
    public static void main(String[] args) {


        for (int z = 1 ; z <= 100 ; z++){
            if(z % 2 ==0 )
                if ( z %3 == 0 && z %5 == 0 )
            System.out.print(z+" ");
        }


        System.out.println("________________________________________________________________________________________________________");

       /* String oddNum5 = " ";

        for (int z = 1 ; z <= 100 ; z++){
            if ( z %5 == 0)
                oddNum5 += z+ " ";
        }
        System.out.print(oddNum5+", etc\n");

        System.out.println("________________________________________________________________________________________________________");

        */




    }
}
