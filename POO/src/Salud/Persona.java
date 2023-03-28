package Salud;

import java.util.Scanner;

public class Persona {
    //atributos
    String tipoDoc;
    public int documento;
    String nombre;
    String apellido;
    String sexo;
    private double peso;
    private double estatura;
    private int edad;
    private double pesoActual;

    //metodos
// metodo constructor
  /*public void Persona(){

  } */

  public Persona(String tipoDoc, int documento, String nombre, String apellido ){
      this.tipoDoc=tipoDoc;
      this.documento=documento;
      this.nombre=nombre;
      this.apellido=apellido;
  }

public String getTipoDoc() {
    return tipoDoc;
}
public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}
public int getDocumento() {
    return documento;
}
public void setDocumento(int documento) {
    this.documento = documento;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
    
    public void pedirDatos(){
        

try (Scanner captura = new Scanner(System.in)) {
    System.out.println("Ingrese Su Tipo De Documento:");
    tipoDoc=captura.next();
    System.out.println("Ingrese Su Documento:");
    documento=captura.nextInt();
    System.out.println("Ingrese Su Nombre:");
    nombre=captura.next();
    System.out.println("Ingrese Su Apellido:");
    apellido=captura.next();
    System.out.println("Ingrese Su Tipo De Sexo:");
    sexo=captura.next();
    System.out.println("Ingrese Su Peso:");
    peso=captura.nextInt();
    System.out.println("Ingrese Su Estatura:");
    tipoDoc=captura.next();
    System.out.println("Ingrese Su Edad:");
    edad=captura.nextInt();

}


}


   
    public void mostrarPersona(){
        System.out.println("El Tipo De Documento Es:"+tipoDoc);
        System.out.println("Su Documento Es:"+documento);
        System.out.println("Su Nombre Es:"+nombre);
        System.out.println("Su Apellido Es:"+apellido);
        System.out.println("Su Sexo Es:"+sexo);
        System.out.println("Su Peso Es:"+peso);
        System.out.println("Su Estatura Es:"+estatura);
        System.out.println("Su Edad Es:"+edad);
    }
     public void calcularImc(){
        double pesoActual = (int) (peso / (estatura*estatura));
        System.out.println("Su IMC Es: "+peso);
        if(peso<20){
            System.out.println("Su Peso Esta Por Debajo De Lo Ideal");
        }

        else if(peso>=20 && peso<=25){
            System.out.println("Su Peso Es Ideal");
        }

        else if(peso>25){
            System.out.println("Tiene Sobrepeso");
        }
     }

     public double calcularImc2(double peso, double estatura){


        double  pesoActual1 = peso / (estatura*estatura);
          if (pesoActual1 < 20) {
     
              System.out.println();
              System.out.println("PESOBAJO: ");
              System.out.println();
      
          } else if (pesoActual1 >= 20 && pesoActual1 <= 25) {
              
              System.out.println();
              System.out.println("PESOIDEAL: ");
              System.out.println();
      
      
      
          } else if (pesoActual1 > 25) {
              
              System.out.println();
              System.out.println("SOBREPESO: ");
              System.out.println();
  
  
       }
       return pesoActual1;

       }

     public void mayorEdad(){
        System.out.println("Su Edad Es: "+edad);

        if(edad>=18){
            System.out.println("Usted Es Mayor De Edad");

           
        }
        else if(edad<18){
                System.out.println("Usted Es Menor De Edad");
        }
     }



    }
    

    




