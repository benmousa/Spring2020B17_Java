package replit;

public class IfStatement {


    public static void main(String[] args) {


        int n1 = 15;
        int n2 = 99;
        int n3 = 56;

        boolean n1Greater = n1 > n2 && n1 > n3;
        boolean n2Greater = n2 > n1 && n2 > n3;
        boolean n3Greater = n3 > n1 && n3 > n2;

        if (n1Greater) {
            System.out.println("n1 is bigger.");
        }
        if (n2Greater){
            System.out.println("n2 is bigger.");
        }
        if (n3Greater){
            System.out.println("n3 is bigger.");
        }

    }
}

