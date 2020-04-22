package Day22_Arrays_Loop;

public class NestedLoop_02 {
    public static void main(String[] args) {
        int [][] numbers = { { 9,8,7},{6}, {5,4,3,2,1,0} };



        for(int k = 0; k <= numbers.length-1; k++){
        for (int i = 0; i <= numbers[k].length-1; i++ ){
            System.out.println(numbers[k][i]);
        }
    }

        for ( int k = 0; k <= numbers.length-1; k++){
            for ( int i = numbers[k].length-1; i >=0 ; i--){
                System.out.println(numbers[k][i]);
            }
        }





}}
