import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
      String letraMusica = "", novaLetra = "", criptografada = "";
        int novaLinha = 0, tamanhoLetraMusica = 0, i = 0, contador = 0;

        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            letraMusica = in.nextLine();
            tamanhoLetraMusica = letraMusica.length();

            for (i = 0; i < tamanhoLetraMusica; i++) {
            //LETRAS MAIUSCULAS
            char caractere = letraMusica.charAt(i);
            if (caractere >= 65 && caractere <= 90) {
                int letraMaiscula = caractere - 64;
                String NumeroResultante = letraMaiscula + "";
                novaLetra = novaLetra + NumeroResultante;
            }
            //CONTADOR DE CARACTERES
            else if (caractere >= 33 && caractere <= 47 || caractere >= 58 && caractere <= 64
                    || caractere >= 91 && caractere <= 96 || caractere >= 123 && caractere <= 126) {
                contador = contador + 1;
            }
            //PARA NUMEROS
            else if (caractere >= 48 && caractere <= 57) {

                if (caractere == '0') {
                    novaLetra = novaLetra + '*';
                } else if (caractere == '1') {
                    novaLetra = novaLetra + ')';
                } else if (caractere == '2') {
                    novaLetra = novaLetra + '$';
                } else if (caractere == '3') {
                    novaLetra = novaLetra + '!';
                } else if (caractere == '4') {
                    novaLetra = novaLetra + '+';
                } else if (caractere == '5') {
                    novaLetra = novaLetra + '@';
                } else if (caractere == '6') {
                    novaLetra = novaLetra + '-';
                } else if (caractere == '7') {
                    novaLetra = novaLetra + '/';
                } else if (caractere == '8') {
                    novaLetra = novaLetra + '(';
                } else if (caractere == '9') {
                    novaLetra = novaLetra + '%';
                }
            }
            //LETRAS MINUSCULAS
            else if (caractere >= 97 && caractere <= 122) {
                if (contador % 2 == 0) {
                    char letraMinuscula = (char) (caractere - 32);
                    novaLetra = novaLetra + letraMinuscula;
                } else {
                    novaLetra = novaLetra + caractere;
                }
                
            }
        }
            criptografada = novaLetra + "\n" + criptografada;
            novaLetra = "";
            contador = 0;
             
        }
        System.out.println(criptografada);
  }
}
