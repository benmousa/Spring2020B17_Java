package Day16_ForLoop_02;

public class Continue_Statement {
    public static void main(String[] args) {

        for (int z = 1; z <= 5 ; z++){
            if (z == 3){
                continue;
            }
            System.out.println(z);
        }
        System.out.println("_________________________________________");
        for (int s = 0; s <= 20; s++){
            if (s %2 == 0){
                continue;
            }
            System.out.print(s+" ");
        }
    }
}
