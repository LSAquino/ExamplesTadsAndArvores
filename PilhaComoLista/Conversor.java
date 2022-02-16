package PilhaComoLista;

import java.util.Scanner;

public class Conversor{
    public static void main(String args[]){
        int numero = Integer.parseInt(args[0]);
        
        int resto;
        IPilha p;
        try{
            // agora o usuario decide se quer pilha estática ou dinamica através da linha de comando
            p = (IPilha)Class.forName(args[1]).newInstance();
            // fase 1 = empilhamento dos restos
            while (numero != 0){
               resto = numero % 2;   // pego o resto da divisão deste número por 2 (vale 0 ou 1)
               p.push(resto);        // armazeno na pilha
               numero = numero / 2;  // gero um novo número, resultado da divisão dele por 2
            }
            // fase 2 = exibicao dos restos
            while (!p.isEmpity()){
               resto = p.pop();      // remove da pilha (Sempre o cara que está no topo)
               System.out.print(resto);
            }
            System.out.println("\nfim do programa");
        }
        catch(Exception ex){
            System.err.println("Deu muito ruim...");
        }
    }
}
// (172)10 = (10101100)2
/*
  172 / 2
    0   86 / 2
         0  43 / 2
             1   21 / 2
                  1  10 / 2
                      0   5 / 2
                          1   2 / 2
                              0   1 / 2
                                  1   0
*/
