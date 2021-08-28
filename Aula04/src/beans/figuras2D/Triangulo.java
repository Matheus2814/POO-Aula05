package beans.figuras2D;

// @author Matheus Machado

public class Triangulo implements Figura2D {
    
    private Ponto2D p0;
    private Ponto2D p1;
    private Ponto2D p2;

    public Triangulo(Ponto2D p0, Ponto2D p1, Ponto2D p2) {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public double calcArea() {
          SegReta2D segA = new SegReta2D(p0, p1);
        double a = segA.comprimento();
        SegReta2D segB = new SegReta2D(p1, p2);
        double b = segB.comprimento();
        SegReta2D segC = new SegReta2D(p2, p0);
        double c = segC.comprimento();
        double p = (a+b+c)/2;
        return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double calcPerimetro() {
          SegReta2D segA = new SegReta2D(p0, p1);
        double a = segA.comprimento();
        SegReta2D segB = new SegReta2D(p1, p2);
        double b = segB.comprimento();
        SegReta2D segC = new SegReta2D(p2, p0);
        double c = segC.comprimento();
        return a+b+c;
    }

    @Override
    public void moveX(double dX) {
        p0.moveX(dX);
        p1.moveX(dX);
        p2.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        p0.moveY(dY);
        p1.moveY(dY);
        p2.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
       p0.moveXY(dX, dY);
       p1.moveXY(dX, dY);
       p2.moveXY(dX, dY);
    }

    public Ponto2D getP0() {
        return p0;
    }

    public void setP0(Ponto2D p0) {
        this.p0 = p0;
    }

    public Ponto2D getP1() {
        return p1;
    }

    public void setP1(Ponto2D p1) {
        this.p1 = p1;
    }

    public Ponto2D getP2() {
        return p2;
    }

    public void setP2(Ponto2D p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "p0: " + p0 + ", p1: " + p1 + ", p2: " + p2 + 
                ", area: " + calcArea() + ", perimetro: " + calcPerimetro() + '}';
    }
    
    
    
}
