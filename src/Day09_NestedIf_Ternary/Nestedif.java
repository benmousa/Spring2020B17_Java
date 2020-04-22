package Day09_NestedIf_Ternary;

public class Nestedif {
    public static void main(String[] args) {
        int age = 13;
        boolean USCitizen = false;

        if (USCitizen){
            if ( age > 17){
                System.out.println(" You are eligibe to vote");
            }
            else{
                System.out.println("You are most be 18 or older to be able to vote ");
            }
        }
        else{
            System.out.println("Only USCitizen who can vote");
        }
    }
}
