package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {

        for ( int i = 0; i <= 100; i++){
            if ( i %3 == 0 || i %5 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println("****************************************");


        String name = "Muhtar";
        String result = "";
        int lastIndex = name.length()-1;

        for ( int z = lastIndex; z >= 0; z--){
            result = result + name.charAt(z);
        }
        System.out.print(result);
        System.out.println("_____________________________");

        String mine = "Mohamme";
        int last = mine.length()-1;
        System.out.println(mine.substring(last,last+1));
    }
}
