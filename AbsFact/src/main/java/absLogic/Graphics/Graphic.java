
package absLogic.Graphics;

import absLogic.Colors.Color;
import absLogic.Shapes.Shape;

//Esta interfaz define que un elemento grafico debe tener un metodo para su color y su forma

public interface Graphic {
    Shape defineShape();
    Color fillWith();
}
