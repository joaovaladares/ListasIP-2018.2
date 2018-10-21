import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static int[] percorrerMatriz(int matriz[][], int corredor, int armario) {
        //Armario encontrado
        if (matriz[corredor][armario] == 0) {
            return new int[]{corredor, armario};
        } //Programa descoberto
        else if (matriz[corredor][armario] < 0) {
            return new int[]{-1, 0};
        } //Armario nao encontrado
        else if (corredor + 1 == matriz.length && armario + 1 == matriz[corredor].length) {
            return new int[]{0, -1};
        }

        //Para continuar
        else {
            if (corredor + 1 < matriz.length) {
                return percorrerMatriz(matriz, corredor + 1, armario);
            } else {
                return percorrerMatriz(matriz, 0, armario + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantCorredores, quantArmarios;
        quantCorredores = in.nextInt();
        quantArmarios = in.nextInt();

        if (quantCorredores > 0) {
            int[][] matriz = new int[quantCorredores][quantArmarios];
            for (int i = 0; i < quantCorredores; i++) {
                for (int j = 0; j < quantArmarios; j++) {
                    matriz[i][j] = in.nextInt();
                }
            }

            int[] posicao = percorrerMatriz(matriz, 0, 0);
            if (posicao[0] == -1) {
                System.out.println("Voce foi descoberto! Corra dancando Bop To the Top!!");
            } else if (posicao[1] == -1) {
                System.out.println("Sharpay endoidou!");
            } else {
                System.out.println("O armario a ser invadido fica no corredor " + (posicao[0] + 1) + ", e e o armario de numero " + (posicao[1] + 1) + ".");
            }
        } else {
            System.out.println("Sharpay endoidou!");
        }
    }
}
