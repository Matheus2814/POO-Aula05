
import beans.figuras2D.Circulo;
import beans.figuras2D.Ponto2D;
import beans.figuras3D.Ponto3D;
import beans.figuras2D.Quadrado;
import beans.figuras2D.SegReta2D;
import beans.figuras2D.Retangulo;
import beans.figuras3D.SegReta3D;
import beans.figuras2D.Triangulo;
import beans.figuras3D.Cubo;
import beans.figuras3D.Esfera;
import beans.figuras3D.Paralelepipedo;


// @author Matheus Machado

public class Geometria {

  
    public static void main(String[] args) {
        /*
        Ponto2D p0 = new Ponto2D(2, 2);
        Ponto2D p1 = new Ponto2D(1,1);
        SegReta2D sr0 = new SegReta2D(p0, p1);
        
        System.out.println(p0);
        System.out.println(p1);
        System.out.println(sr0);
        
        sr0.moveX(2);
        
        System.out.println(p0);
        System.out.println(p1);
        System.out.println(sr0);
        
        Quadrado q0 = new Quadrado(p0, 3);
        System.out.println(q0);
        q0.moveXY(5, 5);
        System.out.println(q0);
        
        Retangulo r0 = new Retangulo(p0, 3, 4);
        System.out.println(r0);
        r0.moveXY(5, 5);
        System.out.println(r0);
        
        Ponto2D p3 = new Ponto2D(5, 5);
        Circulo c0 = new Circulo(p3, 5);
        System.out.println(c0);
        c0.moveXY(10, 10);
        System.out.println(c0);
        
        
        Triangulo t0 = new Triangulo(new Ponto2D(1, 0), new Ponto2D(2, 2), new Ponto2D(0, 3));
        System.out.println(t0);
        t0.moveXY(10, 10);
        System.out.println(t0);
        */
        
        Ponto3D p0 = new Ponto3D(2, 2, 2);
        Ponto3D p1 = new Ponto3D(5, 0, 4);
        System.out.println(p0);
        SegReta3D sr0 = new SegReta3D(p0, p1);
        System.out.println(sr0);
        
        Cubo c0 = new Cubo(p0, 2);
        System.out.println(c0);
        
        Esfera e0 = new Esfera(p1, 2);
        System.out.println(e0);
        
        Paralelepipedo pp0 = new Paralelepipedo(p0, 2, 3, 1);
        System.out.println(pp0);
        
    }
    
}
