package Day05_Unary_ShorthandOperators;

public class Divisibilty {

    public static void main(String[] args) {
        int a = 65;
        boolean divisibleBy2 = a % 2 == 0;
        boolean divisibleBy3 = a % 3 == 0;
        boolean divisibleby5 = a % 5 == 0;

        System.out.println(a + "is divisible by 2: " + divisibleBy2);
        System.out.println(a + "is divisible by 3: " + divisibleBy3);
        System.out.println(a + "is divisible by 5: "+ divisibleby5);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        int ab = 80;
        boolean divisibleBy2a = ab % 2 == 0;
        boolean divisibleBy3a = ab % 3 == 0;
        boolean divisibleBy5a = ab % 5 == 0;

        String result1 = ab + " is divisible by 2: " + divisibleBy2a;
        String result2 = ab + " is divisible by 3: " + divisibleBy3a;
        String result3 = ab + " is divisible by 5 " + divisibleBy5a;

        System.out.println(ab + " is divisible by 2: " + divisibleBy2a);
        System.out.println(ab + " is divisible by 3: " + divisibleBy3a);
        System.out.println(ab + " is divisible by 5: "+ divisibleBy5a);
        System.out.println("==================================");

        System.out.println(result1+"\n"+result2+"\n"+result3);
    }
}
