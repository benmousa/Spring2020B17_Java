package replit;

import java.util.ArrayList;

public class Methods_with_ArrayList_Search {
    public static void main(String[] args) {

        ArrayList<String > search = new ArrayList<>();
        search.add("hello");
        search.add("world");
        search.add("good bye");

        String find = "good bye";


            if (search.contains(find)){
                System.out.println( search.get(search.indexOf(find)));
            }
            if ( ! search.contains(find)){
                System.out.println("filed search");
            }

    }
}
