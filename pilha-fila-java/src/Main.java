public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        // Testando fila
        System.out.println("Adicionando: ", fila.adicionar("Abelha"));
        System.out.println("Adicionando: ", fila.adicionar("Bernardo"));
        System.out.println("Adicionando: ", fila.adicionar("Casa"));
        System.out.println("Adicionando: ", fila.adicionar("Dragrão"));
        System.out.println("Adicionando: ", fila.adicionar("Enzo"));

        System.out.println("A fila está vazia ? " + fila.estaVazia());

        System.out.println("Primeiro elemento da fila: " + fila.primeiro());
        System.out.println("Tamanho da fila " + fila.tamanho());

        while (!fila.estaVazia()) {
            System.out.println("Removendo da fila: " + fila.remover());
        }

        System.out.println("A fila está vazia ? " + fila.estaVazia());

        Pilha pilha = new Pilha (5);
        System.out.println();

        System.out.println("Adicionando: ", pilha.empilhar("master"));
        System.out.println("Adicionando: ", pilha.empilhar("legal"));
        System.out.println("Adicionando: ", pilha.empilhar("aluguel"));
        System.out.println("Adicionando: ", pilha.empilhar("Helicopitero"));
        System.out.println("Adicionando: ", pilha.empilhar("I-page"));

        System.out.println("A fila está vazia ? " + pilha.estaVazia());

        System.out.println("Primeiro elemento da fila: " + pilha.topo());
        System.out.println("Tamanho da fila " + pilha.tamanho());

        while (!pilha.estaVazia()) {
            System.out.println("Removendo da fila: " + pilha.desempilhar());
        }

        System.out.println("A fila está vazia ? " + pilha.estaVazia());

        System.out.println("acabô");

    }
}
