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
public class SmallCoke extends  Coke{

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "300 ml Coke";
    }

    @Override
    public String size() {
        return "Small size";
    }
    
}
