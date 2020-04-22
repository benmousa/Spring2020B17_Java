package Day22_Arrays_Loop;

public class NestedLoop_paractice {
    public static void main(String[] args) {

        int [] [ ] numbers  = { { 1,2,3},
                                { 4,5,6,7,8,9 },
                                { 10,11,12,13,14},
                                { 15,16,17,18,19,20,21}
                               };
        //int[] oddNum = {};

        for ( int i = 0; i <= numbers.length-1; i++){
            for ( int k = 0; k <= numbers[i].length-1; k++){
                if ( numbers[i][k] %2 != 0){
                System.out.println(numbers[i][k]+" ");
                }
                else{
                    System.out.println();
                }
            }}






        }}

