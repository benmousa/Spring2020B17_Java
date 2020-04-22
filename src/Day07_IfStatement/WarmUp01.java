package Day07_IfStatement;

    public class WarmUp01 {
        public static void main(String[] args) {

            int a = 90;
            int b = 45;
            int c = 50;

            boolean vaildTringle = a + b + c == 180;

            if (vaildTringle){
                System.out.println(" It is a vaild tringle");
            }

            if (!vaildTringle) {
                System.out.println(" It is not a vaild tringle");
            }

        }
}
