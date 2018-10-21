import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int tamanhoMapa, quantMovimentos, posicaoCobraX = 0, posicaoCobraY = 0, i, j;
        boolean perdeu = false;
        String movimento;

        Scanner in = new Scanner(System.in);
        tamanhoMapa = in.nextInt();
        quantMovimentos = in.nextInt();
        String[][] mapa = new String[tamanhoMapa][tamanhoMapa];

        for (i = 0; i < tamanhoMapa; i++) {
            for (j = 0; j < tamanhoMapa; j++) {
                mapa[i][j] = in.next();
                if (mapa[i][j].equals("#")) {
                    posicaoCobraX = i;
                    posicaoCobraY = j;
                }
            }
        }

        while (quantMovimentos > 0 && !perdeu) {
            movimento = in.next();
            if (movimento.equals("D")) {
                if (posicaoCobraY == tamanhoMapa - 1) {
                    if (mapa[posicaoCobraX][0].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoCobraX][0] = "#";
                        mapa[posicaoCobraX][posicaoCobraY] = "*";
                        posicaoCobraY = 0;
                    }
                } else {
                    if (mapa[posicaoCobraX][posicaoCobraY + 1].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoCobraX][posicaoCobraY + 1] = "#";
                        mapa[posicaoCobraX][posicaoCobraY] = "*";
                        posicaoCobraY = posicaoCobraY + 1;
                    }
                }
            } else if (movimento.equals("E")) {
                if (posicaoCobraY == 0) {
                    if (mapa[posicaoCobraX][tamanhoMapa - 1].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoCobraX][tamanhoMapa - 1] = "#";
                        mapa[posicaoCobraX][posicaoCobraY] = "*";
                        posicaoCobraY = tamanhoMapa - 1;
                    }
                } else {
                    if (mapa[posicaoCobraX][posicaoCobraY - 1].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoCobraX][posicaoCobraY - 1] = ("#");
                        mapa[posicaoCobraX][posicaoCobraY] = ("*");
                        posicaoCobraY = posicaoCobraY - 1;
                    }
                }
            } else if (movimento.equals("C")) {
                if (posicaoCobraX == 0) {
                    if (mapa[tamanhoMapa - 1][posicaoCobraY].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[tamanhoMapa - 1][posicaoCobraY] = ("#");
                        mapa[posicaoCobraX][posicaoCobraY] = ("*");
                        posicaoCobraX = tamanhoMapa - 1;
                    }
                } else {
                    if (mapa[posicaoCobraX - 1][posicaoCobraY].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoCobraX - 1][posicaoCobraY] = "#";
                        mapa[posicaoCobraX][posicaoCobraY] = "*";
                        posicaoCobraX = posicaoCobraX - 1;
                    }
                }
            } else if (movimento.equals("B")) {
                if (posicaoCobraX == tamanhoMapa - 1) {
                    if (mapa[0][posicaoCobraY].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[0][posicaoCobraY] = "#";
                        mapa[posicaoCobraX][posicaoCobraY] = "*";
                        posicaoCobraX = 0;
                    }
                } else {
                    if (mapa[posicaoCobraX + 1][posicaoCobraY].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoCobraX + 1][posicaoCobraY] = "#";
                        mapa[posicaoCobraX][posicaoCobraY] = "*";
                        posicaoCobraX = posicaoCobraX + 1;
                    }
                }
            }
            quantMovimentos -= 1;
        }
        for (i = 0; i < tamanhoMapa; i++) {
            for (j = 0; j < tamanhoMapa; j++) {
                System.out.print(mapa[i][j]);
                if (j != tamanhoMapa - 1) {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        if (perdeu) {
            System.out.println("Game over.");
        }
  }
}
