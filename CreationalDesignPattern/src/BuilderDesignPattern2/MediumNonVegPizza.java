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
public class MediumNonVegPizza extends NonVegPizza{

    @Override
    public float price() {
        return 220.0f;
    }

    @Override
    public String name() {
        return "Non-VegPizza";
    }

    @Override
    public String size() {
        return "Medium size";
    }
    
}
