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
public class ShapeFactory extends AbstractFactory {
    
    
    public ShapeFactory(){
        System.out.println("Your choice is ShapeFactory");
    }

    Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }
        
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("RECTIANGLE")) {
            return new Rectiangle();
        } else if (shape.equalsIgnoreCase("SQUAR")) {
            return new Squar();
        }
        return null;
    }

    Color getColor(String str) {
        return null;
    }
}
