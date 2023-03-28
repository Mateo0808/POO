package FigurasGeometricas;

public class Circulo extends Figuras {
    private float pi;
    private float radio;

    public Circulo(float pi, float radio){
        this.pi=pi;
        this.radio=radio;


        
    }

    public float getPi() {
        return pi;
    }

    public void setPi(float pi) {
        this.pi = pi;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;

        }
      public void calcularArea(){
        float area=0;

        area=pi*radio;
        System.out.println("El Pi Del Circulo Es: "+pi+"El Radio Del Circulo ES: "+radio+"El Area Del Circulo Es: "+area);
      }
    }

