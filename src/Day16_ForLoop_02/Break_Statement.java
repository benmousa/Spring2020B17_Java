package Day16_ForLoop_02;

public class Break_Statement {
    public static void main(String[] args) {

        for (int z = 1; z <= 5; z++) {

            System.out.println("Hello World");

            if (z == 5){

                break;
        }

    }
        System.out.println("____________________________________________________________");

        for (char  z = 'a'; z <= 'z'; z++){

            if ( z == 'e'){
                break;
            }
            System.out.print(z);

        }
    }
}
