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
public class FactoryMain {

    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();

        OS android = osFactory.getInstance("Open");
        android.spec();

        OS ios = osFactory.getInstance("Closed");
        ios.spec();

        OS windos = osFactory.getInstance("anyOs");
        windos.spec();
    }
}
