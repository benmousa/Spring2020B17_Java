package Batch_12;

public class Day_12_01 {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 0;
        int n3 = 0;

        if (n1 == n2){
            System.out.println("n1 and n2 are egual.");
        }
        else if ( n2 == n3){
            System.out.println("n2 and n3 are egual.");
        }
        else if(n1 == n3){
            System.out.println("n1 and n3 are egual.");
        }
        else if (n1 == n2 && n1 == n3){
            System.out.println("all egual");
        }
        else{
            System.out.println("non egual");
        }
    }
}
