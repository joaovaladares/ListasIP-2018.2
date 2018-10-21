import java.io.*;
import java.util.*;

public class HuxleyCode {
  private static String[] StringInvertida(String[] nomes, String[] aux, int i) {
        aux[nomes.length - 1 - i] = nomes[i];
        if (i == nomes.length - 1) {
            return aux;
        } else {
            return StringInvertida(nomes, aux, i + 1);
        }
    }

    private static int[] intInvertida(int[] gramas, int[] aux, int i) {
        aux[gramas.length - 1 - i] = gramas[i];
        if (i == gramas.length - 1) {
            return aux;
        } else {
            return intInvertida(gramas, aux, i + 1);
        }
    }

    private static String distribuirComida(String[] invertida, int[] intInvertida, int i, int comida) {
        if (i == invertida.length) {
            return "";
        } else if (intInvertida[i] - comida > 0) {
            return "\n" + invertida[i] + " foi servido(a)."
                    + "\n" + "Fica tranquilo(a), " + invertida[i] + " pode se servir novamente!"
                    + distribuirComida(invertida, intInvertida, i, comida + 400);
        } else {
            return "\n" + invertida[i] + " foi servido(a)." + distribuirComida(invertida, intInvertida, i + 1, 400);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numAmigos = in.nextInt();
        in.nextLine();
        String[] nomes = new String[numAmigos];
        int[] gramas = new int[numAmigos];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = in.next();
            gramas[i] = in.nextInt();
        }

        String[] aux = new String[numAmigos];
        String[] nomesInvertidos = StringInvertida(nomes, aux, 0);
        int[] auxiliar = new int[numAmigos];
        int[] valoresInvertidos = intInvertida(gramas, auxiliar, 0);

        System.out.println(distribuirComida(nomesInvertidos, valoresInvertidos, 0, 400));
    }
}
