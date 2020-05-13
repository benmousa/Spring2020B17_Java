package Day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("Tyson's Corner", "CyberTek",  75000, false);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("Chantilly", "Hi-Tek",  95500, true);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("Herndon", "Amazon",  80000, false);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("Reston", "Apple",  100000, true);

        Offer offer5 = new Offer();
        offer5.setOfferInfo("Ashburn", "Verison",  105000, true);

        ArrayList<Offer> list = new ArrayList<>();
        list.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));

        for ( Offer each : list){
            System.out.println(each);
        }
        System.out.println("==============================");

        ArrayList<Offer> listOfFulltime = new ArrayList<>();
        listOfFulltime.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        listOfFulltime.removeIf(p-> p.isFullTime == false);

        for ( int i = 0; i <= listOfFulltime.size()-1; i++){
            System.out.println(listOfFulltime.get(i));
        }
        System.out.println("><><><><><><><><><><><><><><><");

        ArrayList<Offer> listLocal = new ArrayList<>();
        listLocal.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        listLocal.removeIf(p-> ! p.location.contains("Chantilly"));

        for ( int i = 0; i <= listLocal.size()-1; i++) {
            System.out.println(listLocal.get(i));
        }

        System.out.println("## ## ## ## ## ## ## ## ##  ");

        ArrayList<Offer> listSalary = new ArrayList<>();
        listSalary.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));

        listSalary.removeIf(p-> p.salary < 100000);

        for ( int i = 0; i <= listSalary.size()-1; i++) {
            System.out.println(listSalary.get(i));
        }



    }
}
