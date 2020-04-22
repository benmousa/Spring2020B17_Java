package Day22_Arrays_Loop;

public class NestedLoop {
    public static void main(String[] args) {
                          //  0-0  0-1     1-0  1-1   1-2       2-0  2-1  2-2
        char [][] arr2D = { { 'A', 'B'} , {'C', 'D', 'E' } , { 'F', 'J', 'H','I' } } ;

        //char [] arr2 = arr2D [0];

        for ( int i = 0; i <= arr2D[0].length-1; i++){
            System.out.println(arr2D[0][i]);
        }

        for ( int i = 0; i <= arr2D[1].length-1; i++){
            System.out.println(arr2D[1][i]);
        }

        for ( int i= 0; i <= arr2D[2].length-1; i++){
            System.out.println(arr2D[2][i]);
        }
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");

        for ( int i = 0; i < arr2D.length; i++){
            for ( int j= 0; j <= arr2D[i].length-1; j++){
                System.out.println(arr2D[i][j]);
            }
        }


    }
}
