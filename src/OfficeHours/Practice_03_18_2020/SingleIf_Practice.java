package OfficeHours.Practice_03_18_2020;


    public class SingleIf_Practice {
        public static void main(String[] args) {

            int age = 20;
            boolean eligibleToBuy = age > 21 || age == 21;

            if (eligibleToBuy){

                System.out.println("Could buy alcohol");

            }
            if (!eligibleToBuy){
                System.out.println("Go drink your milk");
            }


        }
}
