/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderDesignPattern2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amir
 */
public class Main {

    public static void main(String[] args) {
        try {
            OrderBuilder builder=new OrderBuilder();
            
            OrderedItems orderedItems=builder.preparePizza();
            
            orderedItems.showItems();
            
            System.out.println("\n");
            System.out.println("Total Cost : "+ orderedItems.getCost());  
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}