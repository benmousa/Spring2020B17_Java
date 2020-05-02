package replit;

import java.util.ArrayList;

public class _182_Methods_with_ArrayList4_set {
    public static void main(String[] args) {


        ArrayList<String> arraylistvariable = new ArrayList<>();

        arraylistvariable.add("Ali");
        arraylistvariable.add("hey");
        arraylistvariable.add("Hello");
        arraylistvariable.add("Mom");
        arraylistvariable.add("Libya");

        test(arraylistvariable);
    }

    public static void test(ArrayList<String> words){
        words.set(0,"git");
        words.set(2,"gud");
        System.out.println(words);
    }

}
