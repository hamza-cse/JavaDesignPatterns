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
public class LargeCheezePizza extends VegPizza {
    @Override
    public float price() {
        return 270.0f;
    }

    @Override
    public String name() {
        return "Cheeze Pizza";
    }

    @Override
    public String size() {
        return "Large size";
    }
}
