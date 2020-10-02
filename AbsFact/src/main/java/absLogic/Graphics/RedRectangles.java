
package absLogic.Graphics;

import absLogic.Colors.Color;
import absLogic.Colors.Red;
import absLogic.Shapes.Rectangle;
import absLogic.Shapes.Shape;

//Constituye un caso particular de la interfaz Graphic, la cual genera Rectangulos rojos
public class RedRectangles implements Graphic{

    @Override
    public Shape defineShape() {
        return new Rectangle();
    }

    @Override
    public Color fillWith() {
        return new Red();
    }
    
}
