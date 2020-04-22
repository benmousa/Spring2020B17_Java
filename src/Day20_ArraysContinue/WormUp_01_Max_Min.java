package Day20_ArraysContinue;

public class WormUp_01_Max_Min {
    public static void main(String[] args) {

        int[] numbers = {22,4,5,6,8,9,6,5454,7678,87,98,13,4,54,6,577,76888,909,13,5,43434,55,7,65,53434,4545,33333333,54545
        ,67866668,4534345,4564656,54545767,8888};
        int length = numbers.length-1;
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i <=length; i++){


            if (numbers[i] > max){
                max = numbers[i];
            }
            if ( numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.print("The maximum number is "+max+"\n");
        System.out.print("The minimum number is "+min);




       /* int[] numbers = new int [3];
        numbers[0] = 5;
        numbers[1] = 10;
        numbers[2] = 7;

        String result = "";

        if (numbers[0] > numbers[1] && numbers[0] > numbers[2]){
            result = numbers[0]+" is maximum number";
        }
        else if (numbers[1] > numbers[2] && numbers[1] > numbers[0]){
            result = numbers[1]+" is maximum number";
        }
        else if (numbers[2] > numbers[1] && numbers[2] > numbers[0]){
            result = numbers[2]+" is maximum number";
        }
        System.out.println(result);

        */



    }
}
