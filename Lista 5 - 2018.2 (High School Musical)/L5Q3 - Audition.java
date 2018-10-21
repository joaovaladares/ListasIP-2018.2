import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static int decisao(String i, int j) {
        if (j == 0) {
            return (int) i.charAt(0);
        } else {
            return ((int) i.charAt(j) + decisao(i, j - 1));
        }
    }
    public static double funcPac(double k, int i){
        if (i == 0){
            return k;
        } else {
            return k - funcPac(k * 0.01, i - 1);
        }
    }
    
    public static void main(String args[]) {
    double maiorSoma = 0;
        String atorVencedor = "";
        boolean comeco = true;
        Scanner in = new Scanner(System.in);
        double paciencia = in.nextDouble();
        int quantParticipantes = in.nextInt();
        String nomesAtores[] = new String[quantParticipantes];
        double somaFuncao[] = new double[quantParticipantes];
        in.nextLine();

        for (int i = 0; i < nomesAtores.length; i++) {
            String nomeParticipante = in.nextLine();
            nomesAtores[i] = nomeParticipante;
            somaFuncao[i] = decisao(nomeParticipante, nomeParticipante.length() - 1) * funcPac(paciencia, i + 1);
            if (nomeParticipante.equals("Troy Bolton") || nomeParticipante.equals("Gabriella Montez")
                    || nomeParticipante.equals("Sharpay Evans") || nomeParticipante.equals("Ryan Evans")) {
                somaFuncao[i] += 350;
            }
            if (comeco) {
                maiorSoma = somaFuncao[i];
                atorVencedor = nomesAtores[i];
                comeco = false;
            }
            if (somaFuncao[i] > maiorSoma) {
                maiorSoma = somaFuncao[i];
                atorVencedor = nomesAtores[i];
            }
        }
        System.out.printf("O grande vencedor(a) do papel principal desse ano foi %s!", atorVencedor);
    }
}
