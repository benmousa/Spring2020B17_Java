package Day34_CustomClass;

public class Carpet {
    /*
    2. create a custom class for the carpet class that should contain the following:
				instance variables:
						width, length, unitPrice, isPersian (boolean)
				instance methods:
						customOrder(): sets the carpet' width, length, unitPrice, & isPersian
						calcCost(): should be able to calculate the total cost of the carpet and return it as double
						toString(): should be able to display all the info of the carpet including
						the total cost of the carpet as calculated by calcCost()
			total price of carpet= (width+length)*unitPrice
			if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
     */
    double width;
    double length;
    double Prise;
    double unitPrize;
    boolean isPersian;


    public double calcCost (){
        double total = (width + length) * unitPrize;
        if(isPersian) {
            return  total + 200;
        }
        else {
            return  total;
        }
    }

    public void customOrder (double carpetWidth, double carpetLength, double carpetUnitPrise, boolean capetPersian){
        width = carpetWidth;
        length = carpetLength;
        unitPrize = carpetUnitPrise;
        isPersian = capetPersian;
    }

    public String toString (){
        String result = "Width is: "+width+"\nLength is: "+length+"\nUnitPrice is: $"+unitPrize+"\nTotal cost is $"+calcCost();
        return result;
    }
}
