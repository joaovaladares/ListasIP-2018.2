import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
       int lotacao, fila = 0, foramPraFila, pessoasDentro = 0, controle;
        String entradasaida, tipo;

        Scanner in = new Scanner(System.in);
        lotacao = in.nextInt();

        while (in.hasNext()){
            entradasaida = in.next();
            tipo = in.next();

            if(entradasaida.equals("Entraram")){
                if(tipo.equals("VIP")){
                    pessoasDentro += 1;
                    System.out.printf("1 pessoas entraram na casa. Atualmente ha %d pessoas no evento.%n", pessoasDentro);
                } else {
                    controle = Integer.parseInt(tipo);
                    if(pessoasDentro + controle > lotacao){
                        if ((lotacao - pessoasDentro) > 0) {
                            foramPraFila = controle - (lotacao - pessoasDentro);
                            pessoasDentro += lotacao - pessoasDentro;
                            System.out.printf("%d pessoas entraram na casa. Atualmente ha %d pessoas no evento.%n", controle - foramPraFila, pessoasDentro);
                            fila += foramPraFila;
                            System.out.printf("Infelizmente a casa esta lotada, %d pessoas foram redirecionadas para a fila.%n", foramPraFila);
                            System.out.printf("A fila agora contem %d pessoas.%n", fila);
                        } else {
                            foramPraFila = controle;
                            fila += foramPraFila;
                            System.out.printf("Infelizmente a casa esta lotada, %d pessoas foram redirecionadas para a fila.%n", foramPraFila);
                            System.out.printf("A fila agora contem %d pessoas.%n", fila);

                        }
                    } else {
                        pessoasDentro += controle ;
                        System.out.printf("%d pessoas entraram na casa. Atualmente ha %d pessoas no evento.%n", controle, pessoasDentro);
                    }
                }
            } else {
                controle = Integer.parseInt(tipo);
                pessoasDentro -= controle;
                System.out.printf("%d pessoas sairam da casa. Atualmente ha %d pessoas no evento.%n", controle, pessoasDentro);

                if (pessoasDentro < lotacao && fila > 0){
                    if (lotacao - pessoasDentro >= fila) {
                        System.out.printf("%d pessoas da fila entraram na casa.%n", fila);

                        pessoasDentro = pessoasDentro + fila;
                        fila = 0;
                        System.out.printf("Todos que estavam na fila de espera conseguiram entrar, atualmente nao ha fila de espera.%n");
                    } else {
                        fila = fila - (lotacao - pessoasDentro);
                        System.out.printf("%d pessoas da fila entraram na casa.%n", (lotacao - pessoasDentro));
                        System.out.printf("A fila agora contem %d pessoas.%n", fila);
                        pessoasDentro += (lotacao - pessoasDentro);
                    }
                }
            }
            System.out.printf("%n");
        }
        System.out.print("Vai Troinha, agora pede o ubii!");
  }
}
