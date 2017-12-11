/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypeDesignPattern2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Amir
 */
public class BookShop implements Cloneable{

    private String shopName;
    private List<Book> bookList = new ArrayList<Book>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadBooks() {

        for (int i = 1; i <= 10; i++) {

            Book book = new Book();
            book.setBookId(i);
            book.setBookName("Book" + i);
            getBookList().add(book);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" + "shopName=" + shopName + ", bookList=" + bookList + '}';
    }

  //  @Override 
  //  protected Object clone() throws CloneNotSupportedException {// this is shallow cloning which is not creating new object.
   //     return super.clone(); 
   // }
    
     @Override 
    protected BookShop clone() throws CloneNotSupportedException {// this is deep cloning which is creating new object.
        BookShop bookShop=new BookShop();
        for(Book book : this.getBookList()){
        bookShop.getBookList().add(book);
        }
        return bookShop; 
    }
    
    
}
