package Day33_CustomClass_Info;

public class Pizza {
    /*
    1. create a custom class for pizza that should contain the following:
				instance variables:
					  	size (either small, medium, large)
					  	number of cheese topping
					  	number of pepperoni toppings
				instance method:
						customizeOrder(): allows user to set the size and toppings of the pizza
						calcCost(): returns the total cost as double
						toString(): a String return method that's containing the pizza' size, quantity of each topping,
						 and the pizza cost as calculated by calcCost()
				Pizza cost is determined by:
						Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
						Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
						Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
     */

    String Size;
    int CheeseTopping;
    int PepperoniTopping;
    double cost;

    public void customizeOrder(String size){
        if (size.equalsIgnoreCase("small")){
            cost+= 10;
        }
        else if (size.equalsIgnoreCase("medium")){
            cost+= 12;
        }
        else if (size.equalsIgnoreCase("large")){
            cost+= 14;
        }
    }

    public void setPizzaInfo (String pizzaSize, int quantityofPepproni, int quantityofCheese){
        Size = pizzaSize;
        CheeseTopping = quantityofCheese;
        PepperoniTopping = quantityofPepproni;

        if (pizzaSize.equalsIgnoreCase("small")){
            cost+= 10;
        }
        else if (pizzaSize.equalsIgnoreCase("medium")){
            cost+= 12;
        }
        else if (pizzaSize.equalsIgnoreCase("large")){
            cost+= 14;
        }
        cost += quantityofCheese * 1.5;
        cost += quantityofPepproni * 1.5;
    }
    public String toString(){
        String result = "Your Pizza Size is: "+Size+", you have "+CheeseTopping+" Cheese topping, " +
                "and "+PepperoniTopping+" Pepperoni topping, The total cost is: $"+cost;
        return result;
    }


}
