package Day36_StaticBlock;



public class StaticBlock {



    public static void main(String[] args) {
        System.out.println("Main Method executed");
        method1();
    }
    static {
        System.out.println("Static block executed");
    }

    public static void method1 (){
        System.out.println("custom method executed");
    }
}
