package Day38_Constructors;

public class Salary_Calculator {

    double hourlyRate;
    int weeklyHour;
    double stateTaxRate;
    double federalTaxRate;

    public Salary_Calculator(double hourlyRate, int weeklyHour, double stateTaxRate, double federalTaxRate){
        this.hourlyRate = hourlyRate;
        this.weeklyHour = weeklyHour;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;

    }

    public double salary (){
        return hourlyRate * weeklyHour * 48;
    }

    public double stateTax (){
        return salary() * stateTaxRate;
    }

    public double federalTax (){
        return salary() * federalTaxRate;
    }

    public double netIncome (){
        return  salary() - stateTax() - federalTax();
    }

    public String toString (){
        return "Your hourly rate: $"+hourlyRate+", your weekly hours: "+weeklyHour+", state tax you paid: $"+stateTax()+
                ", federal tax you paid $"+federalTax()+", your net income is: $"+netIncome();
    }
}
