package Day23_Methods;

public class methods_Paractice {
    /*
       step1: Hello Cybertek
       step2: Hello World 5 times
       step3: Hello Btach 18
       step4: Hello World 5 times
       step5: Helle Sam
       step6: Hello World 5 times
       */

    public static void main(String[] args) {
        /*
        System.out.println("Hello Cybertek");

        for (int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }

        System.out.println("Hello batch 18");

        for (int i = 0; i < 5; i++){
            System.out.println("Hello World");
        }
        System.out.println("Hello Sam");

        for (int i = 0; i < 5; i++){
            System.out.println("Hello World");
     */
        System.out.println("hello CyberTek");
        printHello5();;
        System.out.println("Hello batch 18");
        printHello5();
        System.out.println("Hello Sam");
        printHello5();
        evenNumber0_100();
        oddNumbers0_100();

        }



    public static void printHello5 (){
        for (int i = 0; i < 5; i++){
        System.out.println("Hello World");
    }
    }


    public static void evenNumber0_100 (){
        for ( int i = 0; i <= 100 ; i++ ){
            if ( i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public static void oddNumbers0_100 (){
        for ( int i = 0; i <= 100 ; i++ ){
            if ( i % 2 == 0){
                System.out.println(i);
            }
        }
    }



}
