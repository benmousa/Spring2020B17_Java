package Day35_Static;

public class staticVariables_02 {

    int insVariable;

    static int staticVariable;

    public static void main(String[] args) {



    staticVariables_02 obj1 = new staticVariables_02();
    obj1.insVariable = 300;
    obj1.staticVariable = 400;

    staticVariables_02 obj2 = new staticVariables_02();


        System.out.println(    obj1.insVariable   );
        System.out.println(    obj2.insVariable  );
        System.out.println();

        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);
        System.out.println();

        System.out.println(staticVariables_02.staticVariable);  // static can be called through class name
        //System.out.println(staticVariables_02.insVariable);  // instance CAN NOT be called through class name

    }}
