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
abstract class Plan {

    protected double rate;

    abstract double getRate();

    public double getcalculatedBill(int units) {
        return (rate * units);
    }
}
