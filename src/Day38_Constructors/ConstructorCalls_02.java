package Day38_Constructors;

public class ConstructorCalls_02 {

    public ConstructorCalls_02(){
        System.out.println("Default Constructor");
    }

    public ConstructorCalls_02(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls_02(String str){
        this(10);
        System.out.println("Constructor with String argument");
    }

    public void method(){
        //ConstructorCalls_02();
    }

    public static void main(String[] args) {

        ConstructorCalls_02 obj = new ConstructorCalls_02("10");
    }


    {

    }

}
