package Day21_MultiDimensionalArrays;

public class WormUp_03 {
    public static void main(String[] args) {

        String [] names = {"Reem", "Omar", "Muhtar", "Emrah", "Mohammed", "Ana"};

        int shortest = names[0].length();

        String minWord = "";

        for ( int i = 1; i <= names.length-1; i++){
            if ( shortest > names[i].length()){
                shortest = names[i].length();
                minWord =names[i];
            }

        }
        System.out.println(minWord);

    }
}
