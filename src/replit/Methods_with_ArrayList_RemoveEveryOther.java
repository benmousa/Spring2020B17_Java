package replit;

import java.util.ArrayList;

public class Methods_with_ArrayList_RemoveEveryOther {
    public static void main(String[] args) {

        ArrayList<String > list = new ArrayList<>();

        list.add("hi");
        list.add("yo");
        list.add("sup");
        list.add("yolo");
        list.add("boop");
        System.out.println(list);

        //ArrayList<String> nothing = new ArrayList<>();

       // for (int i = 0; i <= list.size()-1; i+=1){
         //  list.remove(i);
      //  }

       // System.out.println(list);


      //  for (int i = 0; i <= words.size()-1; i++){
        //    nothing.add(words.get(i));
      //  }
      //  System.out.println(nothing

        removeEveryOther(list);
    }
    public static void removeEveryOther (ArrayList<String> words){

        for (int i = 0; i <= words.size()-1; i+=1){
            words.remove(i);
        }
        System.out.println(words);
    }
}
