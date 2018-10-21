package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int tamanhoArray, somaFinal, somaInicial = 0, numLoops = 0, i, controleSoma = 0;
        boolean numErrado = false, loopContinua = true;

        Scanner in = new Scanner(System.in);
        tamanhoArray = in.nextInt();
        int[] valores = new int[tamanhoArray];

        for (i = 0; i < valores.length; i++) {
            valores[i] = in.nextInt();
            somaInicial += valores[i];
        }

        somaFinal = in.nextInt();

        if (somaFinal > 0 && somaInicial <= 0) {
            numErrado = true;
        } else if (somaFinal < 0 && somaInicial >= 0) {
            numErrado = true;
        } else {
            i = 0;
            while (loopContinua) {
                controleSoma += valores[i];
                if (somaFinal == controleSoma) {
                    loopContinua = false;
                } else if (somaInicial > 0 && controleSoma > somaFinal) {
                    numErrado = true;
                    loopContinua = false;
                } else if (somaInicial < 0 && controleSoma < somaFinal) {
                    numErrado = true;
                    loopContinua = false;
                }
                if (i == valores.length - 1 && loopContinua) {
                    numLoops += 1;
                    i = -1;
                }
                if (loopContinua) {
                    i++;
                }
            }
        }

        if (numErrado) {
            System.out.print("Esse numero deve estar errado...");
        } else {
            System.out.printf("%d %d", i, numLoops);
        }
    }
}

