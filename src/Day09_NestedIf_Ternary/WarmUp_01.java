package Day09_NestedIf_Ternary;

public class WarmUp_01 {
    public static void main(String[] args) {

        int age = 121;
        String ageGroup = " ";

        if (age > 0 && age <= 120) {
            if (age <= 1 && age < 3)
                ageGroup = "Infant";

            else if (age >= 3 && age <= 5)
                ageGroup = "Toddler";

            else if (age >= 6 && age <= 9)
                ageGroup = "Kid";

            else if (age >= 10 && age <= 12)
                ageGroup = "Pre-Teen";

            else if (age >= 13 && age <= 17)
                ageGroup = "Teenager";

            else if (age >= 18 && age <= 20)
                ageGroup = "Young Adult";

            else if (age >= 21 && age <= 39)
                ageGroup = "Adult";

            else if (age >= 40 && age <= 49)
                ageGroup = "young Middle-Aged Adult";

            else if (age >= 50 && age <= 54)
                ageGroup = "Middle-Aged Adult";

            else if (age >= 55 && age <= 64)
                ageGroup = "Very Young Senior Citizen";

            else if (age >= 65 && age <= 74)
                ageGroup = "Young Senior Citizen";

            else if (age >= 75 && age <= 84)
                ageGroup = "Senior Citizen";

            else if (age >= 85)
                ageGroup = "Old Senior Citizen";
        } else {
            ageGroup = "Invalid Entry";
        }
        System.out.println(ageGroup);

        boolean eligibleToBuy = ageGroup == "Adult" ||  ageGroup == "young Middle-Aged Adult" || ageGroup == "Middle-Aged Adult";
        if ( eligibleToBuy)
            System.out.println("You are eligible to buy alcohol");
        else
            System.out.println("You are noy eligible to buy alcohol");

    }
}