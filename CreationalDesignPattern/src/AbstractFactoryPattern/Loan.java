/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractFactoryPattern;

/**
 *
 * @author Amir
 */
public abstract class Loan {
    
    protected double rate;
    abstract void getInterest(double rate);
    public void calculateLoanPayment(double loanamount, int years){
    double EMI;
    int n;
    
    n=years*12;
    
    rate=rate/1200;
    EMI=((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*loanamount;
    
    System.out.println("Your monthly EMI is "+EMI+" for the amount "+loanamount+" you have borrowed");
    
    }
}
