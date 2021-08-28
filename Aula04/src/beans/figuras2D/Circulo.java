package beans.figuras2D;

// @author Matheus Machado

public class Circulo implements Figura2D {
    
    private Ponto2D centro;
    private double raio;

    public Circulo(Ponto2D centro, double raio) {
        this.centro = new Ponto2D(centro.getX(), centro.getY());
        this.raio = raio;
    }

    public Ponto2D getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return (Math.PI * (raio * raio));
    }

    @Override
    public double calcPerimetro() {
        return (2 * Math.PI * raio);
    }

    @Override
    public void moveX(double dX) {
        centro.moveX(dX);
    }

    @Override
    public void moveY(double dY) {
        centro.moveY(dY);
    }

    @Override
    public void moveXY(double dX, double dY) {
        centro.moveXY(dX, dY);
    }

    @Override
    public String toString() {
        return "Circulo{" + "centro: " + centro + ", raio: " + raio +
                ", area: " + calcArea() + ", perimetro: " + calcPerimetro() +'}';
    }
    
    
}
