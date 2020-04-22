package Day18_NestedLoop;

public class Do_While_Loop_Paractice_02 {
    public static void main(String[] args) {

        int t = 1;

        do {
            if ( t%2 != 0){
                t++;
               continue;
            }
            System.out.print(t+" ");
            t++;
        }
        while (t <= 100);
    }
}
