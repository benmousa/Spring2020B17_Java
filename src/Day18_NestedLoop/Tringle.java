package Day18_NestedLoop;

public class Tringle {
    public static void main(String[] args) {

        int i = 1;

        while ( i <= 7){

            int z = 1;
            while ( z <= i){
            System.out.print("* ");
            z++;
        }
        System.out.println();
            i++;
    }
}}
