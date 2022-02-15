package Week3;
import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Compute {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Loan loan = new Loan();
        loan.setInterestRate(input);
        loan.setLoanPeriod(input);
        loan.setLoanAmount(input);
        System.out.println("The loan was created on " + new Date());
        System.out.println("The monthly payment is " + df.format(loan.getMonthlyPayment()));
        System.out.println("The total payment is " + df.format(loan.getTotalPayment()));
    }
}