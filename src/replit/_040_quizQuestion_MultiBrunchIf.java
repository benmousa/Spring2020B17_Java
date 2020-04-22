package replit;

import java.util.Scanner;

public class _040_quizQuestion_MultiBrunchIf {
    public static void main(String[] args) {

            Scanner s = new Scanner(System.in);

            System.out.println("what is the farthest planet in the solar system:" );
            System.out.println("a)venus" );
            System.out.println("b)pluto" );
            System.out.println("c)neptune" );

            String answer = s.nextLine();
            answer = answer.toLowerCase();


            if(answer.contains("a") ){
                System.out.println(answer+" is wrong");
            }
            else if(answer.contains("b")){
                System.out.println(answer+" is correct");
            }
            else if (answer.contains("c")){
                System.out.println(answer+" is wrong");
            }
            else{
                System.out.println(answer+" is not valid answer");
            }
    }
}
