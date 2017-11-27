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
public class Main {

    public static void main(String[] args) {
      // SingleTone singleToneObj = SingleTone.getInstance();
       // SingleTone singleToneObj2 = SingleTone.getInstance();

      // LazySingleTone lazySingleTone=LazySingleTone.getInstance();
       // LazySingleTone lazySingleTone2=LazySingleTone.getInstance();
       SynchronizedSingleTone synchronizedSingleTone=SynchronizedSingleTone.getInstance();
        // Let's put it in double thread with synchronize and double check.
        Thread t1=new Thread(new Runnable() {

            @Override
            public void run() {
               // SynchronizedSingleTone synchronizedSingleTone=SynchronizedSingleTone.getInstance();
               // SynchronizedSingleTone singleToneWithOutSynchronization=SynchronizedSingleTone.getInstanceWithOutSynchronization();
               // DoubleCheckSingleTone doubleCheckSingleTone=DoubleCheckSingleTone.getInstance();
            }
        });
        
       Thread t2=new Thread(new Runnable() {

            @Override
            public void run() {
               //  SynchronizedSingleTone synchronizedSingleTone=SynchronizedSingleTone.getInstance();
                //  SynchronizedSingleTone singleToneWithOutSynchronization=SynchronizedSingleTone.getInstanceWithOutSynchronization();
              //  DoubleCheckSingleTone doubleCheckSingleTone=DoubleCheckSingleTone.getInstance();
            }
        });
       
       t1.start();
       t2.start();
        
        
//        EnumSingleTOne obj = EnumSingleTOne.INSTANCE;
//        obj.i = 5;
//        obj.show();
//        EnumSingleTOne obj2 = EnumSingleTOne.INSTANCE;
//        obj2.i = 6;
//        obj.show();
    }
}
