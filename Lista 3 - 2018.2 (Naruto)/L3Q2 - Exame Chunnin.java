package com.company;

import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] nomesNinjas = new String[8];
        for (int i = 0; i < nomesNinjas.length; i++) {
            nomesNinjas[i] = in.nextLine();
        }

        int[] lutas = new int[8];
        for (int i = 0; i < lutas.length; i++) {
            lutas[i] = in.nextInt();
        }

        System.out.println("Bem vindos ao Exame Chunnin!");
        System.out.printf("Quartas de final 1: %s x %s\n", nomesNinjas[lutas[0]], nomesNinjas[lutas[1]]);
        System.out.printf("Quartas de final 2: %s x %s\n", nomesNinjas[lutas[2]], nomesNinjas[lutas[3]]);
        System.out.printf("Quartas de final 3: %s x %s\n", nomesNinjas[lutas[4]], nomesNinjas[lutas[5]]);
        System.out.printf("Quartas de final 4: %s x %s\n", nomesNinjas[lutas[6]], nomesNinjas[lutas[7]]);

        String[] vencedorQuartas = new String[4];
        String tipoVencedorQuartas = "";
        for (int i = 0, j = 0; i < vencedorQuartas.length; i++, j += 2) {
            tipoVencedorQuartas = in.next();
            if (tipoVencedorQuartas.equals("A")) {
                vencedorQuartas[i] = nomesNinjas[lutas[j]];
            } else {
                vencedorQuartas[i] = nomesNinjas[lutas[j + 1]];
            }
        }
        System.out.printf("Semifinal 1: %s x %s\n", vencedorQuartas[0], vencedorQuartas[1]);
        System.out.printf("Semifinal 2: %s x %s\n", vencedorQuartas[2], vencedorQuartas[3]);

        String[] vencedorSemis = new String[2];
        String tipoVencedorSemis = "";
        for (int i = 0, j = 0; i < vencedorSemis.length; i++, j += 2) {
            tipoVencedorSemis = in.next();
            if (tipoVencedorSemis.equals("X")) {
                vencedorSemis[i] = vencedorQuartas[j];
            } else {
                vencedorSemis[i] = vencedorQuartas[j + 1];
            }
        }
        System.out.printf("Final: %s x %s\n", vencedorSemis[0], vencedorSemis[1]);

        String tipoVencedorFinal = "";
        String vencedorFinal = "";
        tipoVencedorFinal = in.next();
        if (tipoVencedorFinal.equals("#")) {
            vencedorFinal = vencedorSemis[0];
        } else {
            vencedorFinal = vencedorSemis[1];
        }
        System.out.printf("O grande vencedor e %s!", vencedorFinal);
    }
}
