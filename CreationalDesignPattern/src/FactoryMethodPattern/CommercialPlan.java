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
public class CommercialPlan extends Plan{

    @Override
    double getRate() {
        rate =3.30;
       return rate;
    }
}
