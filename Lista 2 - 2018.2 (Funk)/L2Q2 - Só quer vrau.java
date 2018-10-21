import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      int numerodevrau;
        String letra = "Essas malandra, assanhadinha, que so quer";
        Scanner in = new Scanner(System.in);
        numerodevrau = in.nextInt();

        while(numerodevrau > 0){
            letra = letra + " vrau";
            numerodevrau -= 1;
        }
        System.out.printf("%s", letra);
}
}
