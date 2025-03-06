import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Mortgage {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
		
        // Principal
        System.out.print("Principal: ");
        int principal = stdin.nextInt();
                
        // Interest rate
        System.out.print("Annual Interest Rate: ");
        float annualInterest = stdin.nextFloat();
        float monthlyInterest = annualInterest / 100 / 12;
                
        // Period (max = 30)
        System.out.print("Period (Years): ");
        byte years = stdin.nextByte();
        int numberOfPayments = years * 12;
                
        stdin.close();

        // Calculate the monthly payment
        double mathPower = Math.pow(1 + monthlyInterest, numberOfPayments);
        double monthlyPayment = principal * (monthlyInterest * mathPower / (mathPower - 1));

        // Format currency in Indian Rupees (₹) with Unicode fallback
        String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(monthlyPayment);

        // Print the result with Unicode rupee symbol
        System.out.println("Your monthly payment is: \u20B9" + monthlyPayment);
    }
}
