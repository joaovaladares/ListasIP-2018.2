package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String tipoEntrada;
        int numeroNinjas, contadorAprovados = 0;

        Scanner in = new Scanner(System.in);
        tipoEntrada = in.nextLine();
        numeroNinjas = Integer.parseInt(in.nextLine());

        String[] nomesNinjas = new String[numeroNinjas];
        int[] controleJutsus = new int[numeroNinjas];
        int[] quantidadeChakra = new int[numeroNinjas];
        int[] quantidadeJutsus = new int[numeroNinjas];

        for (int i = 0; i < nomesNinjas.length; i++) {
            nomesNinjas[i] = in.next();
            quantidadeChakra[i] = in.nextInt();
            quantidadeJutsus[i] = in.nextInt();
        }

        if (tipoEntrada.equals("Esse naruto...")) {
            for (int i = 0; i < nomesNinjas.length; i++) {
                controleJutsus[i] = quantidadeJutsus[i];
            }
            for (int i = 0; i < nomesNinjas.length; i++) {
                quantidadeJutsus[i] = controleJutsus[numeroNinjas - i - 1];
            }
        }

        for (int i = 0; i < quantidadeChakra.length; i++) {
            for (int j = 0; j < quantidadeChakra.length - 1; j++) {
                if (quantidadeChakra[j] - quantidadeJutsus[j] < quantidadeChakra[j + 1] - quantidadeJutsus[j + 1]) {
                    String nomesNinjaControle = nomesNinjas[j];
                    int quantidadeChakraControle = quantidadeChakra[j];
                    int quantidadeJutsuControle = quantidadeJutsus[j];

                    nomesNinjas[j] = nomesNinjas[j + 1];
                    nomesNinjas[j + 1] = nomesNinjaControle;

                    quantidadeChakra[j] = quantidadeChakra[j + 1];
                    quantidadeChakra[j + 1] = quantidadeChakraControle;

                    quantidadeJutsus[j] = quantidadeJutsus[j + 1];
                    quantidadeJutsus[j + 1] = quantidadeJutsuControle;
                }
            }
        }

        for (int i = 0; i < nomesNinjas.length; i++) {
            if (quantidadeChakra[i] - quantidadeJutsus[i] > 0) {
                contadorAprovados++;
                System.out.printf("%s esta classificado(a)\n", nomesNinjas[i]);
            } else {
                System.out.printf("%s esta desclassificado(a)\n", nomesNinjas[i]);
            }
        }

        if (contadorAprovados == 0) {
            System.out.printf("\nEsse semestre ninguem veio treinar na aldeia da folha");
        } else {
            System.out.printf("\nKakashi tera um total de %d aluno(s) nesse semestre", contadorAprovados);
        }
    }
}
