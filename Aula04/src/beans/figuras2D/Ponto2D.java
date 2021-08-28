package beans.figuras2D;

// @author Matheus Machado

public class Ponto2D implements Objeto2D {
    
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
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
        x = x + dX;
        y = y + dY;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Ponto2D{" + "x: " + x + ", y: " + y + '}';
    }
    
    
    
}
