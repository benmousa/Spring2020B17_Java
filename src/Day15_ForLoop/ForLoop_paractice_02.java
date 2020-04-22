package Day15_ForLoop;

public class ForLoop_paractice_02 {
    public static void main(String[] args) {

        String name = "MOHAMMED";
        int num = name.length()-1;

        for (int i = num ; i >= 0 ; i--){
            System.out.print(name.charAt(i));
        }
    }
}
