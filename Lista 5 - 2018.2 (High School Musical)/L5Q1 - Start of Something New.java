import java.io.*;
import java.util.*;

public class HuxleyCode {
    public static int chance(int bebidas) {
        if (bebidas == 0) {
            return 0;
        } else if (bebidas == 1) {
            return 1;
        } else {
            return chance(bebidas - 1) + chance(bebidas - 2);
        }
    }
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
        double vergonhaTroy, vergonhaGabriella;
        int numBebidasTroy, numBebidasGabriella;

        vergonhaTroy = in.nextDouble();
        numBebidasTroy = in.nextInt();
        vergonhaGabriella = in.nextDouble();
        numBebidasGabriella = in.nextInt();

        if (vergonhaTroy == 0 && numBebidasTroy == 0) {
            System.out.println("Esse pode ser o comeco de algo novo!! Troy vai cantar!!");
        } else if (chance(numBebidasTroy) >= vergonhaTroy) {
            System.out.println("Esse pode ser o comeco de algo novo!! Troy vai cantar!!");
        } else {
            System.out.println("Nao foi dessa vez!! Troy nao teve coragem o suficiente.");
        }
        if (vergonhaGabriella == 0 && numBebidasGabriella == 0) {
            System.out.println("Esse pode ser o comeco de algo novo!! Gabriella vai cantar!!");
        } else if (chance(numBebidasGabriella) >= vergonhaGabriella) {
            System.out.println("Esse pode ser o comeco de algo novo!! Gabriella vai cantar!!");
        } else {
            System.out.println("Nao foi dessa vez!! Gabriella nao teve coragem o suficiente.");
        }
    }
}
