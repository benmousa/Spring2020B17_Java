package Batch_12;

public class Day_12_02 {
    public static void main(String[] args) {
        double score = 101;

        if (score <= 100 && score >= 0) {

            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else if (score < 60) {
                System.out.println("Faild");
            }
        }
        else{
            System.out.println("Invaild Entry");
        }
    }
}