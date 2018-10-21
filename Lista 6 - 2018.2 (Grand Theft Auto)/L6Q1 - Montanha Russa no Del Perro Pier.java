import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bilhete = 0, resposta = 0;
        ListaInt listaInt = new ListaInt();

        while (bilhete != -1) {
            bilhete = in.nextInt();
            listaInt.inserir(bilhete);
        }
        int bilheteSorteado = in.nextInt();
        resposta = listaInt.procurar(bilheteSorteado, 0);

        if (resposta == -1) {
            System.out.println("Nenhum carrinho foi sorteado");
        } else {
            System.out.printf("O bilhete sorteado e o %d e esta no carrinho %d", bilheteSorteado, resposta + 1);
        }
    }
}

class ListaInt {
    private int valor;
    private ListaInt proximo;

    public ListaInt() {
        this.valor = -1;
        this.proximo = null;
    }

    public void inserir(int valor) {
        if (this.valor == -1) {
            this.valor = valor;
            this.proximo = new ListaInt();
        } else {
            this.proximo.inserir(valor);
        }
    }

    public int procurar(int valor, int indice) {
        if (this.valor == valor) {
            return indice;
        } else if (this.proximo != null) {
            indice++;
            return proximo.procurar(valor,indice);
        } else {
            return (-1);
        }
    }
}
