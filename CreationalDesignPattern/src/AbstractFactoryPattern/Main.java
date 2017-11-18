/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Amir
 */
public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of Bank from where you want to take loan amount");
        String bankName = bufferedReader.readLine();
        System.out.println("");
        
        
        System.out.println("Enter the type of loan e.g. home loan or business loan or education ");
        String loanName = bufferedReader.readLine();
        System.out.println("");
        
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank(bankName);
        

        System.out.println("Enter the interest rate for" + bank.getBankName() + ":");
        double rate = Double.parseDouble(bufferedReader.readLine());
        System.out.println("");
        
        System.out.println("Enter the loan amount you want to take");
        double loanAmount = Double.parseDouble(bufferedReader.readLine());

        System.out.print("\n");
        System.out.print("Enter the number of years to pay your entire loan amount: ");
        int years = Integer.parseInt(bufferedReader.readLine());

        System.out.println("");
        System.out.println("you are taking the loan from" + bank.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");

        Loan loan = loanFactory.getLoan(loanName);
        loan.getInterest(rate);
        loan.calculateLoanPayment(loanAmount, years);

    }
}
