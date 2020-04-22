package Day16_ForLoop_02;

public class ContinueStatment_Paractice_02 {
    public static void main(String[] args) {

        for (int num = 1; num <= 100 ; num++ ){

            if ( num == 19 || num == 29 || num == 39 || num == 49 || num == 59 ){
                continue;
        }
            System.out.print(num+" ");
    }
}}
