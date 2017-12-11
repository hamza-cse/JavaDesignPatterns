/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesignPattern2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Amir
 */
public class Main {

    public static void main(String[] args) {
        try {
            BookShop shop = new BookShop();
            shop.setShopName("ShopName");
            shop.loadBooks();

            BookShop shop2 = shop.clone();
            shop2.setShopName("ShopName");

            shop.getBookList().remove(2);
            System.out.println(shop);
            System.out.println(shop2);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
