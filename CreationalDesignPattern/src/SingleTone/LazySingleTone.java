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
public class LazySingleTone {

    private static LazySingleTone lazySingleTone;

    private LazySingleTone() {
        System.out.println("It seems you call me successfully :)");
    }

    public static LazySingleTone getInstance() {
        if (lazySingleTone == null) {
            lazySingleTone = new LazySingleTone();
        }
        return lazySingleTone;
    }
}
