package Day09_NestedIf_Ternary;

public class ternary_Paractice {
    public static void main(String[] args) {

        int hour = 13;
        String result = (hour < 12)? "Good Morning" : (hour >=12 && hour < 18) ? "Good Afternoon" :
                ( hour <= 23) ?"Good Night" : " Invalid Entry";

        System.out.println(result);


    }
}
