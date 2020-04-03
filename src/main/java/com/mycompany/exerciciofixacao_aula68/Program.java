

package com.mycompany.exerciciofixacao_aula68;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Andressa Silva
 */
public class Program {
    
    public static void main(String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Rectangle rectangle = new Rectangle();
        
        System.out.print("Informe a largura do retangulo: ");
        rectangle.altura = sc.nextDouble();
        System.out.print("Informe a altura do retangulo: ");
        rectangle.largura = sc.nextDouble();
        
        System.out.println("Area do retangulo: " + rectangle.areaRetangulo());
        System.out.println("Perimetro do retangulo: " + rectangle.perimetroRetangulo());
        System.out.println("Diagonal do retangulo: " + rectangle.diagonalRetangulo());
    
    }
}
