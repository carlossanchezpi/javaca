import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    final int COLUMNAS =5;
    final int FILAS = 5;
    int[][] matrizNum = {{0,1,2}, {4,5,6}, {7,8,9}};

    Minerales diamante = Minerales.DIAMANTE;
    Minerales oro = Minerales.ORO;
    Minerales plata = Minerales.PLATA;
    Minerales nada = Minerales.NADA;
    Minerales caca = Minerales.CACA;
    Minerales arrMinerales[] = Minerales.values();
    for (Minerales m : arrMinerales){
      System.out.println(m);
    }
    Logica miLogica = new Logica();
    Scanner sc=new Scanner(System.in);


    for (int i = 0 ; i < matrizNum.length ; i++){
      for (int j = 0 ; j < matrizNum[i].length ; j++){
        System.out.print(matrizNum[i][j] + " ");
      }
      System.out.println();
    }
    System.out.println("Jugador1 quieres cara o cruz?:");
    String respuesta=sc.nextLine();

    System.out.println("Ha salido: "+ miLogica.tirarMoneda());
    if( respuesta.equals(miLogica.tirarMoneda())){
      System.out.println("Empieza el jugador1");
    } else {
      System.out.println("Empieza el jugador2");
    }





  }
}
