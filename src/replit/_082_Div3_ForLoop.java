package replit;

public class _082_Div3_ForLoop {
    public static void main(String[] args) {


        for (int i = 1; i <= 20 ; i ++){
            if (i %3 != 0) {
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
