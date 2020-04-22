package Day05_Unary_ShorthandOperators;

public class ne {

    public static void main(String[] args) {

        int a = 50;

        a = --a + a++ + a-- + a++;
        //  49 +  49 + 50 + 49 = 197

        System.out.println(a);

        int x = 4;
        int y = x * 4 - x++;
                // 16 - 4 = 12
        
        System.out.println(y);

        int aa = 1;
        aa = -a-- + a++ / -a-- * --a;
        System.out.println(aa);

    }
}

