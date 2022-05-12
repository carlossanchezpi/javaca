public class Main{
  public static void main(String[] args) {
    Transporte trAvion = Transporte.AVION;
    Transporte trTren = Transporte.TREN;
    Transporte trCoche = Transporte.COCHE;
    Transporte trBicicleta = Transporte.BICICLETA;
    double sitio1 = 2500;
    double sitio2= 125;

    System.out.println("####################-----------SITIO1---------###################");
    System.out.println("Un avión tarda " + trAvion.tiempo(sitio1) + " horas en hacer " + sitio1 + "km." +
    " y cuesta: " + trAvion.precioTotal(sitio1) + " euros.");
    System.out.println("Un tren tarda " + trTren.tiempo(sitio1) + " horas en hacer " + sitio1 + "km." +
    " y cuesta: " + trTren.precioTotal(sitio1) + " euros.");
    System.out.println("Un coche tarda " + trCoche.tiempo(sitio1) + " horas en hacer " + sitio1 + "km" +
    " y cuesta: " + trCoche.precioTotal(sitio1) + " euros.");
    System.out.println("Una bicicleta tarda " + trBicicleta.tiempo(sitio1) + " horas en hacer " + sitio1 + "km." +
    " y cuesta: " + trBicicleta.precioTotal(sitio1) + " euros.");

    System.out.println("####################-----------SITIO2---------###################");

    System.out.println("Un avión tarda " + trAvion.tiempo(sitio2) + " horas en hacer " + sitio2 + "km." +
    " y cuesta: " + trAvion.precioTotal(sitio2) + " euros.");
    System.out.println("Un tren tarda " + trTren.tiempo(sitio2) + " horas en hacer " + sitio2 + "km." +
    " y cuesta: " + trTren.precioTotal(sitio2) + " euros.");
    System.out.println("Un coche tarda " + trCoche.tiempo(sitio2) + " horas en hacer " + sitio2 + "km" +
    " y cuesta: " + trCoche.precioTotal(sitio2) + " euros.");
    System.out.println("Una bicicleta tarda " + trBicicleta.tiempo(sitio2) + " horas en hacer " + sitio2 + "km." +
    " y cuesta: " + trBicicleta.precioTotal(sitio2) + " euros.");


  }
}
