package beans.figuras3D;

// @author Matheus Machado

public class Ponto3D implements Objeto3D {

    private double x;
    private double y;
    private double z;

     public Ponto3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public void moveZ(double dZ) {
        z = z + dZ;
    }

    @Override
    public void moveXZ(double dX, double dZ) {
        x = x + dX;
        z = z + dZ;
    }

    @Override
    public void moveYZ(double dY, double dZ) {
        y = y + dY;
        z= z + dZ;
    }

    @Override
    public void moveX(double dX) {
        x = x + dX;
    }

    @Override
    public void moveY(double dY) {
        y = y + dY;
    }

    @Override
    public void moveXY(double dX, double dY) {
        x  = x + dX;
        y = y + dY;
    }

    @Override
    public String toString() {
        return "Ponto3D{" + "x: " + x + ", y: " + y + ", z: " + z + '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    
    
}
