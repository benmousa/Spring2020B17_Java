package Day07_IfStatement;

public class WarmUp05 {
    public static void main(String[] args) {
         // write a java program that can identify if a person is eligible to vote for Donald Trump

        int age = 17;
        boolean eligibleToVoteToTrump = age >= 18;

        if (eligibleToVoteToTrump) {
            System.out.println( " Could vote to Donald Trump"); }

        if (!eligibleToVoteToTrump){
            System.out.println( " Could not vote to Donald Trump, Go home");
        }

    }
}
