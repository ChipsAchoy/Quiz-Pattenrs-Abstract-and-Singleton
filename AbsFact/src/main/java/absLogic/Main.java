
package absLogic;

import absLogic.Graphics.BlueCircles;
import absLogic.Graphics.Graphic;
import absLogic.Graphics.RedRectangles;

/**
 *
 * @author Anthony Chaves y Christopher Castro
 */
public class Main {
    //Esta atributo estatico simula la eleccion de uno de las dos fabricas
    private static String selected = "bluecirc";
    
    private static AbstractFact config(){
        Graphic factory = null;
        AbstractFact abs = null;
        
        if (selected == "redrect"){
            factory = new RedRectangles();
            abs = new AbstractFact(factory);
        }
        else if(selected == "bluecirc"){
            factory = new BlueCircles();
            abs = new AbstractFact(factory);
        }
        return abs;
    }
    public static void main(String[] args) {
        AbstractFact app = config();
        app.create();
    }
    
}
