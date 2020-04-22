package Day17_WhileLoop;

public class WhileParactice_02 {
    public static void main(String[] args) {

        for (int i = 0 ; i <= 10; i++){
            if (i %2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n__________________________________");

        int z = 0;
        while ( z <= 10){
            if ( z %2 ==0){
                System.out.print(z+" ");
            }
            z++;
        }

    }
}
