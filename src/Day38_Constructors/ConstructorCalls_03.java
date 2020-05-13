package Day38_Constructors;

public class ConstructorCalls_03 {

    public ConstructorCalls_03(){
        this(9); //int argument
        System.out.println("default");
        //    this(9); //int argument
    }

    public ConstructorCalls_03(int a){
        //  this();
        System.out.println("Int argument");

    }

    public ConstructorCalls_03(String str){
        //this("Hello");
    }


    public static void main(String[] args) {

        new ConstructorCalls_03();

    }




    public void method1(){
        // this();
        // method1();
    }
}
