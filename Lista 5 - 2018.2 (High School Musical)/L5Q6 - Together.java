import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static boolean varredura(int comeco, int indice, int ultimo, boolean[][] conexoes) {
        if (comeco == ultimo) {
            return true;
        } else if (indice == conexoes.length - 1 && !conexoes[comeco][indice]) {
            return false;
        } else if (indice == conexoes.length - 1) {
            return varredura(indice, 0, ultimo, conexoes);
        } else if (conexoes[comeco][indice]) {
            return varredura(indice, 0, ultimo, conexoes) || varredura(comeco, indice + 1, ultimo, conexoes);
        } else {
            return varredura(comeco, indice + 1, ultimo, conexoes);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int comeco = 0, termino = 0;
        int quantPessoas = in.nextInt();
        int quantConexoes = in.nextInt();

        String nomes[] = new String[quantPessoas];
        boolean[][] conexoes = new boolean[quantPessoas][quantPessoas];

        for (int i = 0; i < quantPessoas; i++) {
            nomes[i] = in.next();
        }
        for (int i = 0; i < quantConexoes; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            conexoes[a][b] = true;
        }

        String primeiraPessoa = in.next();
        String ultimaPessoa = in.next();
        for (int i = comeco; !nomes[i].equals(primeiraPessoa); i++){
            comeco++;
        }
        for (int i = termino; !nomes[i].equals(ultimaPessoa); i++){
            termino++;
        }
        if (varredura(comeco, 0, termino, conexoes)) {
            System.out.println("We're all in this together!");
        } else {
            System.out.println("Mentira, nenhum filme da Disney da errado, nunca.");
        }
    }
}
