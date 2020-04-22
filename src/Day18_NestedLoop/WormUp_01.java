package Day18_NestedLoop;

public class WormUp_01 {
    public static void main(String[] args) {

        int i = 10;
        int z = 3;
        int count = 0;

        while (i >= z){
            i-=z;
            count++;
        }
        System.out.println(count);


    }

}
