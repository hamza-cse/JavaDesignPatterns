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
public class BussinessLoan extends Loan {

    @Override
    void getInterest(double rate) {
       super.rate=rate;
    }
}