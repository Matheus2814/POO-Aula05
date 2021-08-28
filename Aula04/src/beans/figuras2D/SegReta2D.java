package beans.figuras2D;

// @author Matheus Machado

public class SegReta2D implements Objeto2D {
    
    private Ponto2D p0;
    private Ponto2D p1;

    public SegReta2D(Ponto2D p0, Ponto2D p1) {
        this.p0 = new Ponto2D(p0.getX(), p0.getY());
        this.p1 = new Ponto2D(p1.getX(), p1.getY());
    }

    @Override
    public void moveX(double dX) {
        p0.moveY(dX);
        p1.moveY(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
        p1.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        p0.moveXY(dX, dY);
        p1.moveXY(dX, dY);
    }

    @Override
    public String toString() {
        return "SegReta{" + "p0: " + p0 + ", p1: " + p1 + ", comprimento: " + comprimento() +'}';
    }

    public Ponto2D getP0() {
        return p0;
    }

    public Ponto2D getP1() {
        return p1;
    }

     public double comprimento(){
     
         return (float) Math.sqrt(Math.pow(p1.getX() - p0.getX(), 2) + Math.pow(p1.getY() - p0.getY(), 2));
     
     }
    
     
     
}
