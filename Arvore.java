// Princípio da Responsabilidade Única (SRP): A classe Arvore representa uma árvore e suas operações específicas,
// herdando a responsabilidade de gerenciar o estado de uma planta da classe base Planta.
class Arvore extends Planta {
    // Princípio da Responsabilidade Única (SRP): O construtor inicializa o estado da árvore
    public Arvore(String nome, int quantidade, double preco) {
        super(nome, quantidade, preco);
    }

    // Princípio da Abstração: Este método fornece uma interface para a ação de fertilizar a árvore.
    void fertilizar() {
        System.out.println(nome + " foi fertilizada.");
    }

    // Princípio da Abstração: Este método fornece uma interface para a ação de transplantar a árvore.
    void transplantar() {
        System.out.println(nome + " foi transplantada.");
    }

    // Princípio da Substituição de Liskov (LSP): A classe Arvore pode ser utilizada em lugar de Planta.
    // Isso significa que qualquer instância de Arvore pode substituir uma instância de Planta
    // e o comportamento esperado do programa não será alterado.
    public static void main(String[] args) {
        Planta minhaPlanta = new Arvore("Carvalho", 5, 100.0);
        minhaPlanta.regar(); // Chama o método herdado da classe Planta
        minhaPlanta.podar(); // Chama o método herdado da classe Planta
    }
}
