
package absLogic;

import absLogic.Colors.Color;
import absLogic.Graphics.Graphic;
import absLogic.Shapes.Shape;

//La clase que es capaz de generar una objeto especifico a partir de la fabrica concreta que se seleccione
public class AbstractFact {
    private Color color;
    private Shape shape;
    public AbstractFact(Graphic graph){
        color = graph.fillWith();
        shape = graph.defineShape();
    }
    public void create(){
        shape.draw();
        color.fill();
        
    }
}
