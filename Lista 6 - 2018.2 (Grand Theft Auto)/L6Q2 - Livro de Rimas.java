import java.util.Scanner;

public class LivroDeRimas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean achou = false;
        int posLivro = 0, posEstante = 0;
        int quantidadeEstantes = in.nextInt();
        
        if (quantidadeEstantes > 0) {
            ListaEstantes[] listaEstantes = new ListaEstantes[quantidadeEstantes];
            for (int i = 0; i < listaEstantes.length; i++) {
                int quantidadeLivros = in.nextInt();
                in.nextLine();
                listaEstantes[i] = new ListaEstantes();
                for (int j = 0; j < quantidadeLivros; j++) {
                    String livro = in.nextLine();
                    listaEstantes[i].inserir(livro);
                }
            }

            for (int i = 0; i < listaEstantes.length; i++, posEstante++) {
                posLivro = listaEstantes[i].procurar(1);
                if (posLivro != -1 && !achou) {
                    achou = true;
                }
            }

            if (achou) {
                System.out.printf("Og Loc, o livro ta na estante %d, na posicao %d", posEstante, posLivro);
            } else {
                System.out.println("Og Loc, o livro nao ta aqui!");
            }
        } else {
            System.out.println("Nao tem livros por aqui");
        }
    }
}

class ListaEstantes {
    private String livro;
    private ListaEstantes proximo;

    public ListaEstantes() {
        this.livro = "";
        this.proximo = null;
    }

    public void inserir(String livro) {
        if (this.livro.equals("")) {
            this.livro = livro;
            this.proximo = new ListaEstantes();
        } else {
            this.proximo.inserir(livro);
        }
    }

    public int procurar(int indice) {
        if (this.livro.equals("Livro de Rimas")) {
            return indice;
        } else if (this.proximo != null) {
            return proximo.procurar(indice + 1);
        } else {
            return (-1);
        }
    }
}
