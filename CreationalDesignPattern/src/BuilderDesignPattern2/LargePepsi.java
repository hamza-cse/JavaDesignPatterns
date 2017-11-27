/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BuilderDesignPattern2;

/**
 *
 * @author Amir
 */
public class LargePepsi extends Pepsi{

    @Override
    public float price() {
        return 100.0f;
    }

    @Override
    public String name() {
        return "1000 ml Pepsi";
    }

    @Override
    public String size() {
        return "Large size";
    }
    
}
