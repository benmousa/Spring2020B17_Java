package Day21_MultiDimensionalArrays;

public class WormUp_02 {
    public static void main(String[] args) {

        String [] names = {"Reem", "Omar", "Muhtar", "Emrah", "Mohammed", "Ana"};

        int longest = names[0].length();

        String MaxWord = "";

        for ( int i = 1; i <= names.length-1; i++){
            if ( longest < names[i].length()){
                longest = names[i].length();
                MaxWord =names[i];
            }

            }
        System.out.println(MaxWord);


        }
    }

