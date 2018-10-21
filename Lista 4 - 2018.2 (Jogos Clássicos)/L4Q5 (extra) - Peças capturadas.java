import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
        int coordX = 0, coordY = 0, pecasCapturadas = 0;
        boolean sopro = false, parar = false;
        String[][] tabuleiro = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiro[i][j] = in.next();
                if (tabuleiro[i][j].equals("#")) {
                    coordX = i;
                    coordY = j;
                }
            }
        }
        // Realizando as jogadas:
        int numeroMovimentos = in.nextInt();
        String movimento, imprimirSopro;

        for (int i = 0; i < numeroMovimentos; i++) {
            movimento = in.next();
            imprimirSopro = "";
            parar = false;

            if (movimento.equals("D")) {
                // Se tem como comer para a direita e foi para a direita:
                if (coordY != 7 && coordY != 6 && coordX != 0 && tabuleiro[coordX - 1][coordY + 1].equals("%")
                        && tabuleiro[coordX - 2][coordY + 2].equals("*")) {
                    System.out.printf("Voce capturou uma peca na casa (%d,%d) e avancou para a casa (%d,%d).%n",
                            (coordX - 1), (coordY + 1), (coordX - 2), (coordY + 2));
                    // Somando a peca capturada:
                    pecasCapturadas++;
                    // Removendo peca inimiga:
                    tabuleiro[coordX - 1][coordY + 1] = "*";
                    // Movendo peca jogador 1:
                    tabuleiro[coordX - 2][coordY + 2] = "#";
                    tabuleiro[coordX][coordY] = "*";
                    // Atualizando a posicao jogador 1:
                    coordX -= 2;
                    coordY += 2;
                    parar = true;
                }
                // Se tem como comer para a esquerda e ele nao foi pra esquerda:
                else if (coordY != 0 && coordY != 1 && coordX != 0 && tabuleiro[coordX - 1][coordY - 1].equals("%")
                        && tabuleiro[coordX - 2][coordY - 2].equals("*")) {
                    imprimirSopro = "Voce deveria ter capturado a peca na casa (" + (coordX - 1) + "," + (coordY - 1)
                            + ").";
                    sopro = true;
                    i += numeroMovimentos; // parar o loop
                }

                // Pode ou nao ir para a direita:
                if (!parar && coordY != 7 && coordX != 0 && tabuleiro[coordX - 1][coordY + 1].equals("*")) {
                    System.out.printf("Voce avancou para a casa (%d,%d).%n", (coordX - 1), (coordY + 1));
                    // Movendo a peca do jogador 1:
                    tabuleiro[coordX - 1][coordY + 1] = "#";
                    tabuleiro[coordX][coordY] = "*";
                    // Atualizando a posicao do jogador 1:
                    coordX -= 1;
                    coordY += 1;
                    parar = true;
                }
                if (!parar && coordY != 7 && coordY != 6 && tabuleiro[coordX - 1][coordY + 1].equals("%")
                        && tabuleiro[coordX - 2][coordY + 2].equals("%")) {
                    System.out.println("Voce nao pode capturar essa peca.");
                }
                // Caso tenha sopro:
                if (sopro)
                    System.out.println(imprimirSopro);

            } else if (movimento.equals("E")) {
                // Se tem como comer para a esquerda e ele foi pra esquerda:
                if (coordY != 0 && coordY != 1 && coordX != 0 && tabuleiro[coordX - 1][coordY - 1].equals("%")
                        && tabuleiro[coordX - 2][coordY - 2].equals("*")) {
                    System.out.printf("Voce capturou uma peca na casa (%d,%d) e avancou para a casa (%d,%d).%n",
                            (coordX - 1), (coordY - 1), (coordX - 2), (coordY - 2));
                    // Somando a peca capturada:
                    pecasCapturadas++;
                    // Removendo peca inimiga:
                    tabuleiro[coordX - 1][coordY - 1] = "*";
                    // Movendo a peca do jogador 1:
                    tabuleiro[coordX - 2][coordY - 2] = "#";
                    tabuleiro[coordX][coordY] = "*";
                    // Atualizando a posicao do jogador 1:
                    coordX -= 2;
                    coordY -= 2;
                    parar = true;
                }
                // Se tem como comer para a direita e ele foi para a esquerda:
                else if (coordY != 7 && coordY != 6 && coordX != 0 && tabuleiro[coordX - 1][coordY + 1].equals("%")
                        && tabuleiro[coordX - 2][coordY + 2].equals("*")) {
                    imprimirSopro = "Voce deveria ter capturado a peca na casa (" + (coordX - 1) + "," + (coordY + 1)
                            + ").";
                    sopro = true;
                    i += numeroMovimentos; // parar o loop
                }
                // Pode ou nao andar para a esquerda:
                if (!parar && coordY != 0 && coordX != 0 && tabuleiro[coordX - 1][coordY - 1].equals("*")) {
                    System.out.printf("Voce avancou para a casa (%d,%d).%n", (coordX - 1), (coordY - 1));
                    // Movendo a peca do jogador 1:
                    tabuleiro[coordX - 1][coordY - 1] = "#";
                    tabuleiro[coordX][coordY] = "*";
                    // Atualizando a posicao do jogador 1:
                    coordX -= 1;
                    coordY -= 1;
                    parar = true;
                }
                if (!parar && coordY != 0 && coordY != 1 && coordX != 0 && tabuleiro[coordX - 1][coordY - 1].equals("%")
                        && tabuleiro[coordX - 2][coordY - 2].equals("%")) {
                    System.out.println("Voce nao pode capturar essa peca.");
                }
                if (sopro)
                    System.out.println(imprimirSopro);
            }
        }
        // Imprimindo o tabuleiro atualizado:
        for (int j = 0; j < 8; j++) {
            for (int l = 0; l < 8; l++) {
                if (l == 7)
                    System.out.printf("%s%n", tabuleiro[j][l]);
                else
                    System.out.printf("%s ", tabuleiro[j][l]);
            }
        }
        // Pecas capturadas no total:
        System.out.printf("Voce capturou %d pecas.%n", pecasCapturadas);
        // Houve sopro ou nao:
        if (sopro)
            System.out.println("Deu sopro.");
  }
}
