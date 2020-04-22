package Day18_NestedLoop;

public class Do_While_paractice {
    public static void main(String[] args) {



    int num = 0;

    do {
        if( num %2 == 0) {
            System.out.print(num + " ");
        }
        num++;
    }
    while ( num <=100);

        System.out.println("\n ________________________");

        int y = 1;
        do {
            if( y == 6){
                continue;
            }
            System.out.print(y+" ");
            y++;
        }
        while ( y <= 7);
        System.out.println("\n _________________________");



    }}
