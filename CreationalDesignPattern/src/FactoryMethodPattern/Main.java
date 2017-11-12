/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amir
 */
public class Main {

    public static void main(String[] args) {
        try {

            System.out.print("Enter the name of plan for which the bill will be generated: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String planName = br.readLine();

            System.out.print("Enter the number of units for bill will be calculated: ");
            int units = Integer.parseInt(br.readLine());

            new Main().generateBill(units, planName);

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void generateBill(int units, String planName) {

        GetPlanFactory planFactory = new GetPlanFactory();

        Plan plane = planFactory.getPlan(planName);
        System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
        plane.getRate();
        double bill = plane.getcalculatedBill(units);
        System.out.println("calculatedBill is " + bill);
    }
}
