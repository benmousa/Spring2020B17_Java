package Day08_IfStatement;

public class WarmUp_EgualNumbers {
    public static void main(String[] args) {

        /* write a program that can check the equality of the three given numbers
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are qual ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are euqal ==> none of them are equal
         */

        double n1 = 6;
        double n2 = 7;
        double n3 = 8;

        if ( n1== n2 && n1 != n3 && n2 != n3) {
            System.out.println( n1+" and "+ n2 +" are egual");}

        if ( n2 == n3 && n2 != n1 && n3 != n1) {
            System.out.println( n2 + " and "+n3 + " are egual"); }

        if ( n3 == n1 && n3 != n2 && n1 != n2){
            System.out.println( n3+" and "+n1+ " are egual");}

        if ( n1 == n2 && n1 == n3 && n2 == n3){
            System.out.println("all of them are egual");}

            else{
                System.out.println( "none of the is egual to others");
            }




    }


}
