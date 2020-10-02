/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absLogic.Graphics;

import absLogic.Colors.Blue;
import absLogic.Colors.Color;
import absLogic.Shapes.Circle;
import absLogic.Shapes.Shape;

//Constituye un caso particular de la interfaz Graphic, la cual genera Rectangulos rojos

public class BlueCircles implements Graphic{

    @Override
    public Shape defineShape() {
        return new Circle();
    }

    @Override
    public Color fillWith() {
        return new Blue();
    }
    
}
