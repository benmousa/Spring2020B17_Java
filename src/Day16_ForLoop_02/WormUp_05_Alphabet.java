package Day16_ForLoop_02;

public class WormUp_05_Alphabet {
    public static void main(String[] args) {

        String upperCase = " ";
        String lowerCase = " ";

        for (char ch = 'A'; ch  <='Z'; ch++){
            upperCase += ch;
        }
        System.out.println(upperCase);

        for (char ch = 'a'; ch <= 'z'; ch++){
            lowerCase += ch;
        }
        System.out.println(lowerCase);

        String result = "";

        for ( int z = 0; z <= upperCase.length()-1; z++){
            result += upperCase.charAt(z) +""+ lowerCase.charAt(z)+" ";
        }
        System.out.println(result);

    }
}
