package replit;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _078_Car_Insurance_Quote_String_methods_Scanner_If {
    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String  referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");

        System.out.println("Enter your Name");
        String name2 = scan.nextLine();

        System.out.println( "Do you have a US driver license?");
        String vehicleOwnership2 = scan.next();

        System.out.println("Enter your ZipCode");
        int zipCode = scan.nextInt();

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        String ownerShip = scan.next();

        System.out.println( "How is this vehicle primarily used?");
        String usage = scan.next();

        System.out.println("Days Driven To Work And/Or School");
        double drivenDays = scan.nextDouble();

        System.out.println("Miles Driven To Work And/Or School");
        double drivenMiles = scan.nextDouble();

        System.out.println("How old are you?");
        int age = scan.nextInt();

        System.out.println("Your Driven Experience");
        int experience = scan.nextInt();

        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        accident.toLowerCase();

        System.out.println("How many?");
        double numofAcc = scan.nextDouble();

        System.out.println("Have you had continuous insurance for the past 12 months?");
        String continues = scan.next();
        continues.toLowerCase();

        System.out.println("What is the highest level of education you have completed?");
        String levelOfEdu = scan.next();



      //  if ( accidentsAmount == 0) {


            if (vehicleOwnership.equalsIgnoreCase("no")) {
                System.out.println("Invalid data!");
                System.exit(0);
            }
            if (zipCode == 20910 || zipCode == 20740) {
                premium = premium + 60;
            }
            else if (zipCode == 22102 || zipCode == 22103) {
                premium = premium + 30;
            }
            else {
                premium = premium + 50;
            }
            if (ownerShip.equalsIgnoreCase("owned")) {
                premium = premium + 10;
            } else {
                premium = premium + 20;
            }
            if ( usage.equalsIgnoreCase("business")){
                premium = premium + 50;
            }
            else if ( usage.equalsIgnoreCase("Pleasure ")){
                premium = premium + 10;
            }
            else if ( usage.equalsIgnoreCase("commute")){
                premium = premium + 20;
            }
            if ( drivenDays >= 1 && drivenDays <= 7){
                premium = ( drivenDays * 5) + premium;
            }
            else {
                System.out.println("You need to enter days between 1 to 7");
            }
            if ( drivenMiles >= 1){
                premium = ( drivenMiles * 1) + premium;
            }
            else {
                System.out.println("Enter vaild miles");
            }
            if ( age >= 16 && age <= 17 ){
                premium = premium * 20;
            }
            else if ( age >= 18 && age <= 20){
                premium = premium * 6 ;
            }
            else if ( age >= 21 && age <= 25 ){
                premium = premium * 2;
            }
            else if ( age < 16){
                System.out.println("Invalid data!");
                System.exit(0);
            }
            if ( experience - 16 >= 1 ){
                premium = premium - ( experience * 5 );
            }
            else if ( experience - 16 == 0){
                System.out.println("Invalid data!");
                System.exit(0);
            }
            if ( ! accident.equalsIgnoreCase("yes")){
                if (numofAcc >= 1 ){
                    premium =  premium % 20 * numofAcc + premium;
                    // prem =  prem / 5 * acc + prem;
                }
            }
            if ( continues.equalsIgnoreCase("no")){
                premium = premium * 2;
            }
            if (levelOfEdu.equalsIgnoreCase("Phd") || levelOfEdu.equalsIgnoreCase("bachelors")
            || levelOfEdu.equalsIgnoreCase("masters")){
                premium = premium - (premium * 0.05);
                        // prem - ( prem * 0.05);
            }
            referenceNumber = name2.substring(0,1) + name2.substring(1,2).toUpperCase() +age
                    + name2.substring(name2.length()-2,name2.length()-1).toUpperCase() + name2.substring(name2.length()-1, name2.length()).toUpperCase();

            System.out.println(name2+" here's your quote!");

            System.out.println("Start Your Policy Today For: $"+ premium);

            System.out.println("Reference number: "+referenceNumber+ zipCode+levelOfEdu.toUpperCase());







     //   }

    }
}
