package Juegos;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapeltijeras implements Juegos {
    private int mano;
    private String jugador;
    private int Eleccion;

    Scanner captura=new Scanner(System.in);


    
   
 
    public void iniciar() {
        System.out.println("ingrese el nombre del jugador: ");
        jugador=captura.next();
    }


    public void jugar() {
        System.out.println(jugador+"Realize su eleccion \n 1.piedra \n 2.papel \n 3.tijeras");
        Eleccion=captura.nextInt();
        Random aleatorio=new Random();
        mano=aleatorio.nextInt(3)+1;
        System.out.println("a sacado, mano saliendo");
    }


    public void finalizar() {

        if(mano==1 && Eleccion==1){
            System.err.println("saco piedra, han empatado"+jugador);
        } else if(mano==2 && Eleccion==2){
            System.err.println("saco papel, han empatado"+jugador);

        }else if(mano==3 && Eleccion==3){
            System.err.println("saco tijeras, han empatado"+jugador);

        }else if(mano==1 && Eleccion==3){
            System.err.println("saco piedra, has perdido"+jugador);

        }else if(mano==1 && Eleccion==2){
            System.err.println("saco piedra, has ganado"+jugador);

        }else if(mano==2 && Eleccion==3){
            System.err.println("saco papel, has ganado"+jugador);

            }else if(mano==2 && Eleccion==1){
                System.err.println("saco papel, has perdido"+jugador);
    }else if(mano==3 && Eleccion==2){
        System.err.println("saco tijeras, has perdido"+jugador);

    }else if(mano==3 && Eleccion==1){
        System.err.println("saco tijeras, has ganado"+jugador);

    }
    
}

}
