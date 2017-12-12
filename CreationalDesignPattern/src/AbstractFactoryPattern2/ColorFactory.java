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
public class ColorFactory extends AbstractFactory {
    
    public ColorFactory(){
        System.out.println("your choice is ColorFactory");
    }

    Color getColor(String color) {

        if (color == null) {
            return null;
        }

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }

    Shape getShape(String str) {
        return null;
    }
}
