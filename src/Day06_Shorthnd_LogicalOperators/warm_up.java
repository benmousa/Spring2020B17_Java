package Day06_Shorthnd_LogicalOperators;

public class warm_up {
    public static void main(String[] args) {


        /* 1. write a java program that converts gallons to liters
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785m

	2. write a java program that converts litters to gallons
	 					1 gallon = 3.785 liters
	 					1 litter = 1/3.785

	 					*/


        /*
        3. manually calculate the following code fragements:
				1. int a = 200;
					int b = -a++ + - --a * a-- % 2
					b = ?
					*/
        int a = 200;
        int b = -a++ + - --a * a-- % 2;
        //       -200 + -200 * 200 % 2
        b = -200 + -200 * 200 % 2;

        System.out.println(b);


			 int x = 300;
				   int y = 400;
				   int z = x + y - x * y +x / y;
				     // z = 300 + 400 - 300 * 400 + 300 / 400
                    // z = 300 + 400 - 120,000 + 0
                   // z = 700 - 120,000
                 // z = 119300



















    }
}
