/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern2;

/**
 *
 * @author Amir
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }
        return null;
    }

}
