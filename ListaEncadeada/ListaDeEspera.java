package ListaEncadeada;

public class ListaDeEspera {
    public static void main(String[]args){
        
        Lista lista = new Lista();
        lista.inserir(872);
        lista.inserir(123);
        lista.inserir(1592);
        lista.inserir(2);
        
        while(!lista.isEmpity()){
            int e = lista.retirar();
            System.out.println("Retirei o elemento "+e);
        }
        
    }
}
