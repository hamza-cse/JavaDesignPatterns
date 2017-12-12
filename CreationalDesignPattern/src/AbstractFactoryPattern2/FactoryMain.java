/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Amir
 */
public class FactoryMain {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your choice between Shape and Color factory.");
        System.out.println("Enter Shape or Color");
        String choice = bufferReader.readLine();

        FactoryProducer factoryProducer = new FactoryProducer();
        AbstractFactory abstractFactory = factoryProducer.getFactory(choice);
        System.out.println("Enter your " + choice);

        String colorOrShape = bufferReader.readLine();

        if (choice.equalsIgnoreCase("Shape")) {
            Shape shape = abstractFactory.getShape(colorOrShape);
            shape.draw();
        } else if (choice.equalsIgnoreCase("Color")) {
            Color color = abstractFactory.getColor(colorOrShape);
            color.fill();
        }
    }
}
