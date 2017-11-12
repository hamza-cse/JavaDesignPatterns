/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FactoryMethodPattern;

/**
 *
 * @author Amir
 */
public class DomesticPlan extends Plan{

    @Override
    double getRate() {
      rate =4.30;
       return rate;
    }
}
