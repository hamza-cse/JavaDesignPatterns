/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryDesignPattern2;

/**
 *
 * @author Amir
 */
public class OSFactory {

    public OS getInstance(String str) {
        if (str.equals("Open")) {
            return new Android();
        } else if (str.equalsIgnoreCase("Closed")) {
            return new IOS();
        } else {
            return new Windows();
        }
    }
}
