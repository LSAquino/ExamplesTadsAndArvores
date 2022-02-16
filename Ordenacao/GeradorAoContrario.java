package Ordenacao;

import java.util.Scanner;

public class GeradorAoContrario {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valorInicial = in.nextInt();
        for (int i = valorInicial; i > 0; i--) {
            System.out.println(i);
        }
        
        
    }
}
