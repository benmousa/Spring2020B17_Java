package Day09_NestedIf_Ternary;

public class Ternary_02 {
    public static void main(String[] args) {

        String result = (9 > 10) ? "9 is greater" : " 10 is greater";

        System.out.println(result);

        System.out.println("======================================");

        int ageofperson = 17;
        String eligibleToVoet = " ";

        if (ageofperson >= 18){
            eligibleToVoet = "Yes can Vote";
        }
        else{
            eligibleToVoet = " No cannot vote";
        }
        System.out.println(eligibleToVoet);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        String eligibleToVoet2 = ( ageofperson >= 18)? "Can vote" : "Cannot vote";
        System.out.println(eligibleToVoet2);
    }
}
