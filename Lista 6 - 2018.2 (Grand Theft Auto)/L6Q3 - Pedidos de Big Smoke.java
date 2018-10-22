import java.util.Scanner;

public class Pedidos_De_Big_Smoke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

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
        if (!this.pedido.equals("")) {
            if (this.pedido.equals(pedido)) {
                this.pedido = this.proximo.pedido;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(pedido);
            }
        }
    }
}
