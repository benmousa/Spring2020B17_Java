package replit;


import java.util.ArrayList;

public class Methods_with_ArrayList_swap {
    public static void main(String[] args) {

        ArrayList <String> words= new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");

       swap(words,0,2);

    }
    public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2){

        String v = list.get(pos1);
        String z = list.get(pos2);

        list.set(pos2,v);
        list.set(pos1,z);
        System.out.println(list);
        return list;
    }

}
