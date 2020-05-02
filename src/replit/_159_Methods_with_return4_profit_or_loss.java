package replit;

public class _159_Methods_with_return4_profit_or_loss {

    public static String c_profits (int buyPrice,int sellPrice){

        String result = "";
        if ( buyPrice < sellPrice){
            result = "profit";
        }
        if (buyPrice > sellPrice){
            result = "loss";
        }
        if (buyPrice == sellPrice){
            result = "no loss";
        }
        return result;
    }

    public static void main(String[] args) {

        String SS = c_profits(100,1500);

        System.out.println(SS);

    }
}
