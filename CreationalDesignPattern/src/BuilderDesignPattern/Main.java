/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderDesignPattern;

/**
 *
 * @author Amir
 */
public class Main {

    public static void main(String[] args) {
       // Phone p=new Phone("Android",2,"Qualcomm",5.5,3100); // this is fixed fiture phone
        // System.out.println(p);

        PhoneBuilder phoneBuilder = new PhoneBuilder();
        phoneBuilder.setOs("Android");
        phoneBuilder.setRam(2);

        Phone customPhone = phoneBuilder.getPhone(); // but this is custom fiture phone.
        System.out.println(customPhone);
    }
}
