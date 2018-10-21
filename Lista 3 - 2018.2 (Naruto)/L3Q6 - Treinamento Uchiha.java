import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int tamanhoAlvo, quantKunais, pontuacaoSasuke = 0, pontuacaoItachi = 0, controle, pontuacaoAlvo = 1;

        Scanner in = new Scanner(System.in);
        tamanhoAlvo = in.nextInt();
        quantKunais = in.nextInt();

        controle = tamanhoAlvo / 2;

        if (tamanhoAlvo > 0 && quantKunais > 0) {
            int[] posicoesAlvo = new int[tamanhoAlvo];
            int[] kunaiSasuke = new int[quantKunais];
            int[] kunaiItachi = new int[quantKunais];
            if (tamanhoAlvo % 2 == 1) {
                controle++;
            }

            for (int i = 0; i < controle; i++) {
                posicoesAlvo[i] = pontuacaoAlvo;
                posicoesAlvo[(tamanhoAlvo - 1 - i)] = pontuacaoAlvo;
                pontuacaoAlvo++;
            }

            for (int i = 0; i < kunaiSasuke.length; i++) {
                kunaiSasuke[i] = in.nextInt();
            }

            for (int i = 0; i < kunaiItachi.length; i++) {
                kunaiItachi[i] = in.nextInt();
            }

            for (int i = 0; i < kunaiSasuke.length; i++) {
                for (int j = 0; j < kunaiSasuke.length; j++) {
                    if (kunaiSasuke[j] - 1 < posicoesAlvo.length && kunaiSasuke[j] > 0 
                            && kunaiSasuke[j] == kunaiSasuke[i] && i != j) {
                        kunaiSasuke[j] = 0;
                    }
                }
            }

            for (int i = 0; i < kunaiItachi.length; i++) {
                for (int j = 0; j < kunaiItachi.length; j++) {
                    if (kunaiItachi[j] - 1 < posicoesAlvo.length && kunaiItachi[j] > 0 
                            && kunaiItachi[j] == kunaiItachi[i] && i != j) {
                        kunaiItachi[j] = 0;
                    }
                }
            }

            for (int i = 0; i < kunaiSasuke.length; i++) {
                if (kunaiSasuke[i] - 1 < posicoesAlvo.length && kunaiSasuke[i] > 0) {
                    pontuacaoSasuke += posicoesAlvo[kunaiSasuke[i] - 1];
                }
            }

            for (int i = 0; i < kunaiItachi.length; i++) {
                if (kunaiItachi[i] - 1 < posicoesAlvo.length && kunaiItachi[i] > 0) {
                    pontuacaoItachi += posicoesAlvo[kunaiItachi[i] - 1];
                }
            }
        }

        System.out.printf("Sasuke: %d\n", pontuacaoSasuke);
        System.out.printf("Itachi: %d\n", pontuacaoItachi);

        if (pontuacaoSasuke == 0 && pontuacaoItachi == 0) {
            System.out.println("Os Uchihas nem sao tao bons mesmo");
        } else if (pontuacaoSasuke == pontuacaoItachi) {
            System.out.println("O empate nunca existiu, voce esta preso num genjutsu");
        } else if (pontuacaoSasuke > pontuacaoItachi) {
            System.out.println("Sasuke Uchiha");
            if (pontuacaoItachi == 0) {
                System.out.println("Um genjutsu desse nivel nao funciona em mim");
            }
        } else if (pontuacaoItachi > pontuacaoSasuke) {
            System.out.println("Itachi Uchiha");
            if (pontuacaoSasuke == 0) {
                System.out.println("Voce e fraco, lhe falta odio");
            }
        }
  }
}
