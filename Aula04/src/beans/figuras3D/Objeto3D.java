package beans.figuras3D;

// @author Matheus Machado

import beans.figuras2D.Objeto2D;


public interface Objeto3D extends Objeto2D {
 
    void moveZ(double dZ);
    void moveXZ(double dX, double dZ);
    void moveYZ(double dY, double dZ);
    
}
