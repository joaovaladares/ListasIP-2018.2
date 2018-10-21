import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static long fat(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fat(n - 1);
        }
    }
    public static void main(String args[]) {
    int numVoltas, soma = 0;
        Scanner in = new Scanner(System.in);

        while (in.hasNext()){
            numVoltas = in.nextInt();
            soma += numVoltas;

            if (fat(numVoltas) < 50) {
                System.out.println(fat(numVoltas) * 2);
            } else {
                System.out.println(fat(numVoltas));
            }
        }

        if (soma > 100){
            System.out.println("WildCats, get the head in the game!");
        }
    }
}
