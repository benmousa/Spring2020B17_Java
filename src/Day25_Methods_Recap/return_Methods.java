package Day25_Methods_Recap;

public class return_Methods {

    public static int MaxNumber (int a, int b){

        int max = 0;
        if( a>= b){
            max = a;
        }
        else{
            max = b;
        }
        return max;
    }

    public static int MaxNumber2 ( int a, int b){
        if (a >= b ){
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(MaxNumber(10,15));
        System.out.println(MaxNumber2(9,11));
    }
}
