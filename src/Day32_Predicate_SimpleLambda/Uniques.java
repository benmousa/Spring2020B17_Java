package Day32_Predicate_SimpleLambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {

        Character [] chars = {'A', 'A', 'B', 'C', 'D', 'D'};

        ArrayList<Character> charList = new ArrayList<>(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character> niqueChar = new ArrayList<>();

        for (int z = 0; z <= charList.size()-1; z++){
            int count = 0;
            for (int i = 0; i <= charList.size()-1; i++ ){
                if (charList.get(i).equals(charList.get(z))){
                    count++;
                }
                }
            if ( count == 1){
                niqueChar.add(charList.get(z));
            }
            }
        System.out.println(niqueChar);
        System.out.println();

        ArrayList<Character> result = new ArrayList<>();

        for ( int i = 0; i <= charList.size()-1; i++){
            int count2 = Collections.frequency(charList,charList.get(i));
            if ( count2 == 1){
                result.add(charList.get(i));
            }
        }
        System.out.println(result);

        Collections.swap(result, 0, 1);
        System.out.println(result);
        System.out.println();

        ArrayList<Character> result2 = new ArrayList<>();

        for ( Character each : charList){
            int count2 = Collections.frequency(charList,each);
            if ( count2 == 1){
                result2.add(each);
            }
        }
        System.out.println(result2);

    }}
