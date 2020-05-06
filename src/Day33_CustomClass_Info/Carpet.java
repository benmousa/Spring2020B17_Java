package Day33_CustomClass_Info;

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

    public void customOrder (double carpetWidth, double carpetLength, double carpetPrise, boolean IsPersian){
        width = carpetWidth;
        length = carpetLength;
        unitPrize = carpetPrise;
        isPersian = IsPersian;
        if (IsPersian = true) {
            Prise = (width * length) * unitPrize + 200;
        }
        if (IsPersian = false) {
            Prise = (width * length) * unitPrize;
        }
    }

    public String toString (){
        String result = "Your Carpet width is: "+width+", and the length is: "+length+", the total prise is: $"+Prise;
        return result;
    }
}
