package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    int quantidadeDias, dinheiro, custoTotal = 0;

        Scanner in = new Scanner(System.in);
        dinheiro = in.nextInt();
        quantidadeDias = in.nextInt();

        int[] tigelasNoDia = new int[quantidadeDias];
        for (int i = 0; i < tigelasNoDia.length; i++) {
            tigelasNoDia[i] = in.nextInt();
        }

        for (int i = 0; i < tigelasNoDia.length; i++) {
            if (tigelasNoDia[i] == 1) {
                custoTotal = custoTotal + 10;
            } else if (tigelasNoDia[i] >= 2 && tigelasNoDia[i] <= 10) {
                custoTotal = custoTotal + tigelasNoDia[i] * 9;
            } else {
                custoTotal = custoTotal + tigelasNoDia[i] * 8;
            }
        }

        if (custoTotal == 0) {
            System.out.print("Naruto nao apareceu para comer");
        } else if (custoTotal > dinheiro) {
            System.out.printf("Naruto, faltam %d ryos!", custoTotal - dinheiro);
        } else {
            System.out.print("Naruto conseguiu pagar a sua conta!");
        }
    
  }
}
