package Week3;

import java.util.Date;
import java.util.Scanner;

public class Loan {
    private double interestRate;
    private double loanAmount;
    private int loanPeriod;
    private Date loanDate;

    public Loan(double interestRate, double loanAmount, int loanPeriod){

    }

    public Loan(){
        this.interestRate=2.5;
        this.loanAmount=1000;
        this.loanPeriod=1;

    }

    public double getInterestRate(){
        return interestRate;
    }

    public void setInterestRate(Scanner scan){
        System.out.print("Please enter annual interest rate, for example 8.25: ");
        this.interestRate = scan.nextDouble();
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(Scanner scan){
        System.out.print("Please enter loan amount, for example 120000.95: ");
        this.loanAmount = scan.nextDouble();
    }

    public int getLoanPeriod(){
        return loanPeriod;
    }

    public void setLoanPeriod(Scanner scan){
        System.out.print("Enter number of years as an integer: ");
        this.loanPeriod = scan.nextInt();
    }

    public Date getLoanDate(){
        return loanDate;
    }
    
    public double getMonthlyPayment(){
        double monthlyInterestRate = (this.interestRate/1200);
        double numerator = this.loanAmount*monthlyInterestRate;
        double denominator = 1-1/(Math.pow(1+monthlyInterestRate, this.loanPeriod*12)); 
        double monthlyPayment = numerator/denominator;
        return monthlyPayment;
    }

    public double getTotalPayment(){
        double totalPayment = (this.getMonthlyPayment() * 12 * loanPeriod);
        return totalPayment;    
    }
}