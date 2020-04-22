package Day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {
        //Pre: change the value of the varibale immediately.

        int a = 100;
        System.out.println(++a);//101
        System.out.println(a); //101

        int b = 100;

        System.out.println( --b); //99
        System.out.println(b); //99

        int A = 100;
        System.out.println(A++);
        System.out.println(A);

        int B = 100;
        System.out.println(B--);
        System.out.println(B);


        double t1 = 3.5;
        double t2 = t1--; //3.5, after will decreased by 1.

        System.out.println(t2);
        System.out.println(t1);

         int bb = 25;
        System.out.println(bb++); //25
        System.out.println(bb--); //26

    }
}
