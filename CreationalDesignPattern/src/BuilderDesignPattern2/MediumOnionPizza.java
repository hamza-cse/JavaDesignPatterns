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
public class MediumOnionPizza extends VegPizza {

    @Override
    public float price() {
        
        return 160.0f;
    }

    @Override
    public String name() {
        return "Onion Pizza";
    }

    @Override
    public String size() {
        return "Medium Size";
    }
    
}
