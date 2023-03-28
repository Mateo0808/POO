package Juegos;

public class Ejecucion {
    public static void main(String[] args) {
        Carisellazo juego1=new Carisellazo();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();

        Piedrapapeltijeras juegos2=new Piedrapapeltijeras();
        juegos2.iniciar();
        juegos2.jugar();
        juegos2.finalizar();
    }
}
