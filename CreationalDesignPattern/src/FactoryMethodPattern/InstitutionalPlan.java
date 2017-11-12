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
public class InstitutionalPlan extends Plan {

    @Override
    double getRate() {
        rate = 5.30;
        return rate;
    }
}
