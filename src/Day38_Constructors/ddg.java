package Day38_Constructors;

public class ddg {
    public static void main(String[] args) {


        String word = "Wife";

        int max=word.length()-1;

        if (word.endsWith("y")){
            if (word.substring(max-1).equals("ey")){
                System.out.println("-eys");
            }else{
                System.out.println("-ies");
            }
        }
        else if (word.substring(max-2).equals("ife")){
            System.out.println("-ives");
        }else{
            System.out.println("-s");
        }
    }
}
