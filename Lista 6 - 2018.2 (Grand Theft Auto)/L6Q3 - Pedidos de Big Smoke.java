import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaPedidos listaPedidos = new ListaPedidos();
        String pedido = "";
        while (!pedido.equals("The End")) {
            pedido = in.nextLine();
            if (!pedido.equals("The End")) {
                listaPedidos.inserir(pedido);
            }
        }
        while (in.hasNext()) {
            pedido = in.nextLine();
            if (pedido != null) {
                listaPedidos.remover(pedido);
            }
        }
        System.out.print(listaPedidos.toString());
        if (listaPedidos.toString().equals("")) {
            System.out.println("U gotta null pointer ma man");
        }
    }
}
class ListaPedidos {
    private String pedido;
    private ListaPedidos proximo;

    public ListaPedidos() {
        this.pedido = "";
        this.proximo = null;
    }

    public void inserir(String pedido) {
        if (this.pedido.equals("")) {
            this.pedido = pedido;
            this.proximo = new ListaPedidos();
        } else {
            this.proximo.inserir(pedido);
        }
    }

    public void remover(String pedido) {
        if (this.pedido.equals(pedido)) {
            this.pedido = this.proximo.pedido;
            this.proximo = this.proximo.proximo;
        } else {
            this.proximo.remover(pedido);
        }
    }
    public String toString() {
        String resposta = "" + this.pedido;
        if (this.proximo != null) {
            resposta = resposta + "\n" + this.proximo.toString();
        }
        return resposta;
    }
}
