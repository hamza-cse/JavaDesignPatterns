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
public class SynchronizedSingleTone {

    private static SynchronizedSingleTone synchornizedSingleTone;

    private SynchronizedSingleTone() {
        System.out.println("It seems i am synchronized now :)");
    }

    public static synchronized SynchronizedSingleTone getInstance() {
        if (synchornizedSingleTone == null) {
            synchornizedSingleTone = new SynchronizedSingleTone();
        }
        return synchornizedSingleTone;
    }
    
//     public static SynchronizedSingleTone getInstanceWithOutSynchronization() {
//        if (synchornizedSingleTone == null) {
//            synchornizedSingleTone = new SynchronizedSingleTone();
//        }
//        return synchornizedSingleTone;
//    }
}
