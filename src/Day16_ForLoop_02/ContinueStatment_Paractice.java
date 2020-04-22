package Day16_ForLoop_02;

public class ContinueStatment_Paractice {
    public static void main(String[] args) {

        for (char ch = 'z'; ch >= 'a'; ch--){

            if ( ch == 'y' || ch == 'h' || ch == 'j' || ch == 'd'){
                continue;
            }

            System.out.print(ch+" ");
        }
        System.out.println();

        for (int x = 0 ; x <= 100 ; x++){

            if (x %3 ==0 && x %5 == 0) {
                continue;
            }
            System.out.print(x+" ");
        }
    }
}
