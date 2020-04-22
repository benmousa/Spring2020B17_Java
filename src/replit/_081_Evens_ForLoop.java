package replit;

public class _081_Evens_ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; ++i ){
            if (i %2 != 0){
                continue;
            }
            System.out.print(i+",");
        }
    }
}
