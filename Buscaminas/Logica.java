import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
public class Logica{
  Random rand;

  public Logica(){
    rand = new Random();
  }

    public String tirarMoneda(){
      int dado = ThreadLocalRandom.current().nextInt(1, 2+1);
      String moneda;
      if (dado == 1){
        moneda = "cara";
      } else{
         moneda = "cruz";
      } return moneda;
    }



}
