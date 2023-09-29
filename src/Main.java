
CODE:import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to my bill program.");
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Please enter an amount in dollars and cents: ");
        // defined bill
        double OriginalBill= scan.nextDouble();
      
        System.out.println("Please enter the Tip amount as a whole number: ");
        // defined Tip
        double Tip= scan.nextInt();
      
        System.out.println("Please enter the  amount of people as a whole number: ");
        // defined People
        double People= scan.nextInt();

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        //total tip amount
        double TipAmount= OriginalBill * (Tip/100);
        System.out.println("The Total Tip amount is:"+decimalFormat.format(TipAmount));
        //total bill
        double TotalBill= OriginalBill+TipAmount;
        System.out.println("The total bill is: "+decimalFormat.format(TotalBill));
        //tip per person
        double TipPerPerson=TipAmount/People;
        System.out.println("The tip per person is: "+ decimalFormat.format(TipPerPerson));
        double BillPerPerson=TotalBill/People;
        System.out.println("The bill per person is: "+ decimalFormat.format(BillPerPerson));
    }
}
