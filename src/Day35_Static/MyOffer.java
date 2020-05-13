package Day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffer {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setOfferInfo("DC", "CyberTek",  75000, false);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("VA", "Hi-Tek",  95500, true);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("DC", "Amazon",  80000, false);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("MD", "Apple",  100000, true);

        Offer offer5 = new Offer();
        offer5.setOfferInfo("VA", "Verison",  105000, true);

        ArrayList<Offer> list = new ArrayList<>();
        list.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5));

        list.removeIf(p -> p.isFullTime == false || p.salary < 100000 || ! p.location.contains("VA") );
      //  list.removeIf(p-> ! p.location.contains("VA"));
        //list.removeIf(p-> p.salary < 100000);

        for ( Offer each : list){
            System.out.println(each);
        }
    }
}
