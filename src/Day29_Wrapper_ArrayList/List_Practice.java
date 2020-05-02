package Day29_Wrapper_ArrayList;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {


        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Milk");
        shoppingList.add("Coffee");
        shoppingList.add("Bread");
        shoppingList.add("Toilet Paper");
        shoppingList.add("Eggs");


        for (int i = 0; i <= shoppingList.size()-1; i++){
            System.out.println(shoppingList.get(i));
        }
        System.out.println();
        for ( String each : shoppingList){
            System.out.println(each);
        }

       int size = shoppingList.size();
        System.out.println(size);




    }
}
