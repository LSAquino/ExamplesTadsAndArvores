package ListaEncadeada;

public class Lista {

    private Caixinha inicio;

    //criando a lista vazia
    public Lista() {
        this.inicio = null;
    }

    public void inserir(int elemento) {
        // tenho que criar uma nova caixinha
        Caixinha nova = new Caixinha();
        nova.setElemento(elemento); //inseri o elemento na Caixinha
        nova.setProximo(null);      //depois dela nao vem ninguem

        if (inicio == null) { //vai ser a 1a caixinha?
            inicio = nova;
        } else { //ja tem gente na lista
            Caixinha aux;
            aux = inicio;
            while (aux.getProximo() != null) {
                aux = aux.getProximo();
            }
            aux.setProximo(nova);

        }

    }

    public int retirar() {
        // este metodo considera que a lista sempre tem elemento
        // alguem na aplicacao precisa (antes de removar) testar se a lista nao esta vazia, ok?
        
        Caixinha aux = inicio;
        int elemento = aux.getElemento();
        inicio = aux.getProximo();
        return elemento;
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Nada a exibir - a lista ta vazia!");
        } else {
            Caixinha aux = inicio;
            while (aux != null) {
                System.out.println("Elemento visto " + aux.getElemento());
                aux = aux.getProximo();
            }
        }
    }

    public boolean isEmpity() {
        return (this.inicio == null);
    }

}
