package Ordenacao;

import java.util.Scanner;

/*
qualAlgoritmo
1- BubbleSort
2- SelectionSort
3- InsertionSort
 */
public class MainApp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //int vetor[] = new int[teclado.nextInt()];
        int opcao = teclado.nextInt();

        /*for (int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextInt();
        }*/
        AlgoritmosDeOrdenacao alg = new AlgoritmosDeOrdenacao();
        //alg.setVetor(vetor);

        if (opcao == 1) {
            alg.bubbleSort();
        } else if (opcao == 2) {
            alg.SelectionSort();
        } else if (opcao == 3) {
            alg.insertionSort();
        }else if (opcao == 4) {
            alg.quickSort(0, alg.getVetor().length-1);
        }

        alg.mostraVetor();

    }
}
