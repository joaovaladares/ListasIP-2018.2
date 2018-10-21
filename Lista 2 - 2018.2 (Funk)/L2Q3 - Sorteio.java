import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        int ingressos, numerodoingresso = 1, posicaoingresso = 0;

        Scanner in = new Scanner(System.in);
        ingressos = in.nextInt();

        while (ingressos > 0 && numerodoingresso != posicaoingresso) {
            numerodoingresso = in.nextInt();
            ingressos -= 1;
            posicaoingresso += 1;
            if (numerodoingresso + 1 == posicaoingresso + 1) {
                System.out.printf("o ingresso de numero %d foi sorteado", numerodoingresso);
            }
        }
    
  }
}
