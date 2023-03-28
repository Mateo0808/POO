package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        float base, altura, pi, radio;
        Scanner captura=new Scanner(System.in);
        System.out.println("Ingrese El Valor De La Base:");
        base=captura.nextFloat();
        System.out.println("Ingrese El Valor De La Altura:");
        altura=captura.nextFloat();


        Triangulo T1=new Triangulo(base,altura);
        T1.calcularArea();
          //Rectangulo
        System.out.println("Ingrse El Valor De La Base Del Rectangulo:");
        base=captura.nextFloat();
        System.out.println("Ingrse El Valor De La altura Del Rectangulo:");
        altura=captura.nextFloat();
        captura.close();
        //Circulo
       Scanner lectura=new Scanner(System.in);
       System.out.println("Ingrese El Pi Del Circulo:");
       pi=lectura.nextFloat();
       System.out.println("Ingrese El Radio De El Circulo: ");
       radio=lectura.nextFloat();
        Circulo c1=new Circulo(pi, radio);
        c1.calcularArea();
        lectura.close();
       
  
        
    }
}
