package Juegos;

import java.util.Random;
import java.util.Scanner;

public class Carisellazo implements Juegos {
    //atributos
private int moneda;
private String jugador;
private int eleccion;

Scanner captura=new Scanner(System.in);


    public void iniciar(){
      System.out.println("Ingrese el nombre del jugador:");
      jugador=captura.next();
    }

    public void jugar(){
        System.out.println(jugador+"Realize su eleccion \n 1.cara \n 2.sello");
        eleccion=captura.nextInt();
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
        System.out.println("a lanzado la moneda, moneda girando");

    }

    public void finalizar(){

        if(moneda==1 && eleccion==1){

          System.out.println("Cayo Cara, Ganaste"+jugador);

        } else if(moneda==2 && eleccion==2){
          System.out.println("Cayo sello,Ganaste"+jugador);
        }else if(moneda==1 && eleccion==2){
            System.out.println("Cayo cara,Perdio"+jugador);

    }else if(moneda==2 && eleccion==1){
        System.out.println("Cayo sello,Perdio"+jugador);  
  }

}

}
