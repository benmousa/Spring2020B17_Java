package Day26_Method_Overloading;

public class WormUp_02_Unique {
    /*
    2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
     */

    public static void main(String[] args) {

        String str = "Cybertek";
        String result = "";


        for (int z = 0; z <= str.length()-1; z++){
            int count = 0;
            for (int i = 0; i <= str.length()-1; i++){
                if( str.charAt(z) == str.charAt(i)){
                    count++;
                }
            }
            if ( count == 1 ){
                result += str.charAt(z);
            }
        }
        System.out.println(result);

    }
}
