/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleTone;

/**
 *
 * @author Amir
 */
public class SingleTone {

    private static SingleTone singleTone = new SingleTone();//Eagerly Instantiating.

    private SingleTone() {
        System.out.println("You successfully call me , how r you doing ? :) ");
    }

    public static SingleTone getInstance() {
        return singleTone;
    }
}
