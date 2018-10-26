import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lugar;
        int distancia;
        ListaLugares listaLugares = new ListaLugares();

        while (in.hasNext()) {
            lugar = in.nextLine();
            distancia = Integer.parseInt(in.nextLine());
            listaLugares.inserir(lugar, distancia);
        }
        System.out.println(listaLugares);
    }
}

class ListaLugares {
    private String lugar;
    private int distancia;
    private ListaLugares proximo;

    public ListaLugares() {
        this.lugar = "";
        this.distancia = -1;
        this.proximo = null;
    }

    public void inserir(String lugar, int distancia) {
        if (this.lugar.equals("")) {
            this.lugar = lugar;
            this.distancia = distancia;
            this.proximo = new ListaLugares();
        } else if (this.distancia > distancia) {
            String aux = this.lugar;
            int aux2 = this.distancia;
            this.lugar = lugar;
            this.distancia = distancia;
            this.proximo.inserir(aux, aux2);
        } else {
            this.proximo.inserir(lugar, distancia);
        }
    }

    public String toString() {
        String resposta = "" + this.lugar;
        if (this.proximo != null) {
            resposta = resposta + "\n" + this.proximo.toString();
        }
        return resposta;
    }
}
