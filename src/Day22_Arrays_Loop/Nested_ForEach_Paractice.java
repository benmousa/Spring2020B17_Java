package Day22_Arrays_Loop;

public class Nested_ForEach_Paractice {
    public static void main(String[] args) {


        int[][] numbers = {
                            {1,2,3},
                            {4,5,6,7,8,9},
                            {10,11,12,13,14},
                            {15,16,17,18,19,20,21}
                          };
/*
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number
 */



             int oddNum = 0;
             int sumEven = 0;
             int sumOdd =  0;

         for (int [] eachArray : numbers) {
             for (int eachElement : eachArray) {
                 if (eachElement % 2 == 0) {
                     System.out.print(+eachElement+" ");
                     sumEven += eachElement;
                 }
                 else{
                    oddNum++;
                    sumOdd+=eachElement;
                 }
             }
         }
        System.out.println();
        System.out.println(oddNum);
        System.out.println(sumEven);
        System.out.println(sumOdd);


    }}
