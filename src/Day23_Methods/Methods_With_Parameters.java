package Day23_Methods;

public class Methods_With_Parameters {

    public static void main(String[] args) {
        eligibleToBuyAlcohol((byte)35);
    }

    public static void eligibleToBuyAlcohol (byte age){
        if ( age < 21){
            System.out.println("Eligible to buy Alcohol");
        }
        else{
            System.out.println("Eligible to buy Milk");

        }

    }
}
