import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
        String[][] matriz = new String[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    matriz[i][j] = in.next();
                } else {
                    matriz[j][i] = in.next();
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
                if (j != matriz.length - 1){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
  }
}
