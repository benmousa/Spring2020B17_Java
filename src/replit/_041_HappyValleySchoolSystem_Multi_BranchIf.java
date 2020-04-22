package replit;

import java.util.Scanner;

public interface _041_HappyValleySchoolSystem_Multi_BranchIf {
    public static void main(String[] args) {

        /* less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
*/
        Scanner data = new Scanner(System.in);

        System.out.println("Enter age");

        int age = data.nextInt();
        String output = " ";
        if (age >= 2 ) {
            if (age == 2) {
                output = "Toddler";
            }
            else if (age >= 3 && age <= 5) {
                output = "Childhood";
            }
            else if ( age >= 6 && age <= 7){
                output = " Young Reader";
            }
            else if (age >= 8 && age <= 10 ){
                output = "Elementry";
            }
            else if (age >= 11 && age <= 12){
                output = "Middle";
            }
            else if ( age == 13){
                output = "Impossible";
            }
            else if ( age >= 14 && age <= 16 ){
                output = "High School";
            }
            else if( age >= 17 && age<= 18){
                output = "Scholar";
            }
            else {
                output = "Ineligible";
            }
        }
        else{
            output = "Invalid";
        }
        System.out.println(output);
    }
}
