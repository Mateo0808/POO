package Principal;

import java.util.Scanner;

import Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {
        /*double peso;
        double estatura;
        double total;*/

        // Atributos De La Subclase

        String tipoDoc;
        int documento;
        String nombre;
        String apellido;
        int cargo;
        int valorHora;
        int horasTrabajadas;
        String departamento;
                // crear un objeto-> instancia de una clase
        /*Persona mateo=new Persona();

        mateo.pedirDatos();
        mateo.mostrarPersona();
        mateo.calcularImc();
        mateo.mayorEdad();*/ 

        // crear un objeto-> instancia de una clase

        Scanner lectura=new Scanner(System.in);
        /*System.out.println("Digite El Peso En kg");
        peso=lectura.nextDouble();
        System.out.println("Digite La Estatura En cm");
        estatura=lectura.nextDouble();
        total=mateo.calcularImc2(peso, estatura);
        //Persona mateo=new Persona();*/
  
        //invocando un metodo
        /*mateo.pedirDatos();
        mateo.mostrarPersona();
        mateo.calcularImc();
        mateo.mayorEdad();*/


        //  reto 3

        /*Persona mateo=new Persona();

   mateo.pedirDatos();

   System.out.println("Su Tipo De Documento Es: "+ mateo.getTipoDoc());
   System.out.println("Su Numero De Documento Es: "+ mateo.getDocumento());
   System.out.println("Su nombre Es: "+ mateo.getNombre());
   System.out.println("Su Apellido Es: "+ mateo.getApellido());*/

   //Datos De La Subclase

   Scanner captura=new Scanner(System.in);

   System.out.println("Ingrese Su Tipo De Documento No Importa Si Es Cedula o Targeta De Identidad");
   tipoDoc=captura.next();
   System.out.println("Ingrese Su Numero De Documento:");
   documento=captura.nextInt();
   System.out.println("Ingrese Su Nombre:");
   nombre=captura.next();
   System.out.println("Ingrese Su Apellido:");
   apellido=captura.next();
   System.out.println("Ingrese Su Cargo:");
   cargo=captura.nextInt();
   System.out.println("Ingrese El Valor De La Hora");
   valorHora=captura.nextInt();
   System.out.println("Ingrese Las Horas Trabajadas:");
   horasTrabajadas=captura.nextInt();
   System.out.println("Ingrese Su Departamento:");
   departamento=captura.next();


   Empleado Empleado=new Empleado( tipoDoc, documento,  nombre, apellido, cargo, valorHora, horasTrabajadas, departamento);
   Empleado.calcularHorarios();
   captura.close();
    
    }

    

}
 

