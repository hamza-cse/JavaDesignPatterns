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
public class SmallPepsi extends Pepsi{

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "300 ml Pepsi";
    }

    @Override
    public String size() {
        return "Small size";
    }
    
}
