package Salud;

public class Empleado extends Persona{
    //Atributos Propios De La SubClase 
    private String cargo;
    private int valorHora;
    private int horasTrabajadas;
    private String departamento;
    double totalPagar;
    // Metodo Constructor De La SubClase Y  Los Atributos De La SuperClase
    public Empleado(String tipoDoc, int documento, String nombre, String apellido,int cargo2,int valorHora,int horasTrabajadas,String departamento){

        super(tipoDoc,documento,nombre,apellido);
        this.cargo=cargo;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
        this.departamento=departamento;

    }
    // Metodos  De La SubClase
    public void  calcularHorarios(){

    

     totalPagar = valorHora*horasTrabajadas;
     totalPagar = ((totalPagar) - (0.966/100));
     

       System.out.println(" El Tipo De Documento Suyo Es: "+getTipoDoc()+" El Documento Suyo Es: "+ getDocumento()+" El Nombre Suyo Es: "+getNombre()+" El Apellido  suyo Es: "+getApellido()+" El Cargo Suyo Es: "+cargo+" Las Horas Que trabajo Fueron: "+horasTrabajadas+" El valor Por Cada Hora Trabajada Es : "+valorHora+" El Departamento Suyo Es: "+departamento+" El total A Pagar Es: "+totalPagar);
      
       

    }
}