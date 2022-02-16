package Ordenacao;

import java.util.Scanner;

public class GeradorDeValores {

    static int vetor[];

    public static boolean pertence(int valor, int tam) {
        for (int i = 0; i < tam; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        vetor = new int[in.nextInt()];
        //System.out.println("Criei um vetor de tamanho "+vetor.length);

        int valor, pos;
        //gerei valores aleatorios
        for (pos = 0; pos < vetor.length; pos++) {
            do {
                valor = (int) (Math.random() * 100000) % 100000;
            } while (pertence(valor, pos));
            vetor[pos] = valor;
        }
        //imprimir estes caras
        for (pos = 0; pos < vetor.length; pos++) {
            System.out.println(vetor[pos]);
        }
    }
}
