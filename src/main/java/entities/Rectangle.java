package entities;

/**
 *
 * @author Andressa Silva
 */
public class Rectangle {
    
    public double largura;
    public double altura;
    
    public double areaRetangulo(){
        return largura * altura;
    }
    
    public double perimetroRetangulo(){
        return ((largura * 2) + (altura * 2));
    }
    
    public double diagonalRetangulo(){
        double r = Math.sqrt((altura * altura) + (largura * largura));
        return r;
    }
}
