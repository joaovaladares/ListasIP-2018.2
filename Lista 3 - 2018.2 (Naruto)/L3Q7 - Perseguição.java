import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int numeroDePessoas, i, j, somaAliados = 0, somaInimigos = 0, somaControle = 0, somaMaior = 0, posicaoInicial = 1, posicaoFinal = 1;
        Scanner in = new Scanner(System.in);
        numeroDePessoas = in.nextInt();
        int[] pessoasAmarradas = new int[numeroDePessoas];

        for (i = 0; i < pessoasAmarradas.length; i++) {
            pessoasAmarradas[i] = in.nextInt();
            if (pessoasAmarradas[i] > 0) {
                somaAliados += pessoasAmarradas[i];
            } else {
                somaInimigos += pessoasAmarradas[i];
            }
        }

        if (somaAliados == 0) {
            System.out.print("E uma armadilha");
        } else {
            for (i = 0; i < pessoasAmarradas.length; i++) {
                somaControle = pessoasAmarradas[i];
                for (j = i; j < pessoasAmarradas.length; j++) {
                    if (j != i) {
                        somaControle += pessoasAmarradas[j];
                    }
                    if (somaControle >= somaMaior) {
                        somaMaior = somaControle;
                        posicaoInicial = i + 1;
                        posicaoFinal = j + 1;
                    }
                }
            }
            if (posicaoFinal == posicaoInicial) {
                System.out.printf("Naruto deve libertar somente a posicao %d", posicaoFinal);
            } else {
                System.out.printf("Naruto deve libertar da posicao %d ate a posicao %d", posicaoInicial, posicaoFinal);
            }
        }
  }
}
