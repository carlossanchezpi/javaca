enum Transporte{
  AVION(900,10), TREN(200,14), COCHE(120,12), BICICLETA(20,0);
  private float kilometros;
  private float precio;
  Transporte(float kilometros, float precio){
    this.kilometros=kilometros;
    this.precio=precio;
  }
  public float getKilometros(){
    return this.kilometros;
  }
  public void setKilometros(float kilometros){
    this.kilometros = kilometros;
  }
  public float getPrecio(){
    return this.precio;
  }
  public void setPrecio(float precio){
    this.precio = precio;
  }
}
public class Main{
  public static void main(String[] args) {

    int sitio1 = 2500;
    int sitio2= 125;

    System.out.println("####################-----------SITIO1---------###################");

    System.out.println("Un avión tarda " + (sitio1/Transporte.AVION.getKilometros()+1)  + " horas en hacer " + sitio1 + "km." +
    " y cuesta: " + sitio1/100 * Transporte.AVION.getPrecio() + " euros.");
    System.out.println("Un tren tarda " + sitio1/Transporte.TREN.getKilometros() + " horas en hacer " + sitio1 + "km." +
    " y cuesta: " + sitio1/100 * Transporte.TREN.getPrecio() + " euros.");
    System.out.println("Un coche tarda " + sitio1/Transporte.COCHE.getKilometros() + " horas en hacer " + sitio1 + "km" +
    " y cuesta: " + sitio1/100 * Transporte.COCHE.getPrecio() + " euros.");
    System.out.println("Una bicicleta tarda " + sitio1/Transporte.BICICLETA.getKilometros() + " horas en hacer " + sitio1 + "km." +
    " y cuesta: " + sitio1/100 * Transporte.BICICLETA.getPrecio() + " euros.");

    System.out.println("####################-----------SITIO2---------###################");

    System.out.println("Un avión tarda " + (sitio2/Transporte.AVION.getKilometros()+1) + " horas en hacer " + sitio2 + "km." +
    " y cuesta: " + sitio2/100 * Transporte.AVION.getPrecio() + " euros.");
    System.out.println("Un tren tarda " + sitio2/Transporte.TREN.getKilometros() + " horas en hacer " + sitio2 + "km." +
    " y cuesta: " + sitio2/100 * Transporte.TREN.getPrecio() + " euros.");
    System.out.println("Un coche tarda " + sitio2/Transporte.COCHE.getKilometros() + " horas en hacer " + sitio2 + "km." +
    " y cuesta: " + sitio2/100 * Transporte.COCHE.getPrecio() + " euros.");
    System.out.println("Una bicicleta tarda " + sitio2/Transporte.BICICLETA.getKilometros() + " horas en hacer " + sitio2 + "km." +
    " y cuesta: " + sitio2/100 * Transporte.BICICLETA.getPrecio() + " euros.");


  }
}
