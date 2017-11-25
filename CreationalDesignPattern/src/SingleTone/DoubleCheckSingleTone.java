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
public class DoubleCheckSingleTone {

    private static DoubleCheckSingleTone doubleCheckSingleTone;

    private DoubleCheckSingleTone() {
        System.out.println("It seems i am double check synchronized now :)");
    }

    public static DoubleCheckSingleTone getInstance() {// if we put synchronized in method then it will take more time to execute.
        if (doubleCheckSingleTone == null) {
            synchronized (DoubleCheckSingleTone.class) { // but if we place this synchronize here then it will take less than whole method.
                if (doubleCheckSingleTone == null) {
                    doubleCheckSingleTone = new DoubleCheckSingleTone();
                }
            }
        }
        return doubleCheckSingleTone;
    }
}
