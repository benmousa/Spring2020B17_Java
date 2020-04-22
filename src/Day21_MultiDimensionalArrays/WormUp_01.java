package Day21_MultiDimensionalArrays;

public class WormUp_01 {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50};

        int lenght = arr.length;
        int sum = 0;

        for ( int i = 0; i < lenght; i++){
            int eachNum = arr[i];
            sum += eachNum;
        }

        System.out.println(sum / lenght);
    }
}
