import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      double tang, termos, fatorialInicial = 3, potenciaInicial = 2, contador =1, controle, vodka, tangform = 0, fatorial = 1;

        Scanner in = new Scanner(System.in);
        tang = in.nextInt();
        termos = in.nextInt();

        if(termos == 0){
            tangform = tang;
        }

        while (termos > 1){
            fatorial = 1;
            controle = fatorialInicial;

            while (controle > 1){
            fatorial = fatorial * controle;
            controle -= 1;
            }

        tangform = tangform - ((Math.pow(-1, contador)) * (Math.pow(tang, potenciaInicial)) / (fatorial));
        termos -= 1;
        fatorialInicial += 2;
        potenciaInicial += 2;
        contador += 1;
        }

        vodka = Math.abs(tang - tangform);
        System.out.printf("%.3f", vodka);
    
  }
}
