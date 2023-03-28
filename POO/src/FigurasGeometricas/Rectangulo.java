package FigurasGeometricas;

public class Rectangulo extends Figuras {
    private float base;
    private float altura;
   

    //Metodo Constructor
    public Rectangulo(float base,float altura){
      this.base=base;
      this.altura=altura;
     
      
    }

     //Metodos Accesores 
      
     public float getBase() {
      return base;
  }

  public void setBase(float base) {
      this.base = base;
  }

  public float getAltura() {
      return altura;
  }

  public void setAltura(float altura) {
      this.altura = altura;
  }

    
  
  //Metodo De La SubClase 

  public void calcularArea() {
      float area=0;

      area=base*altura/2;

      System.out.println("La base  Del Rectangulo es: "+base+" y la altura de este Rectangulo es: "+altura+"Su area es: "+area);
   
}
}
