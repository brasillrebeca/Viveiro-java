
// Princípio da Responsabilidade Única (SRP): A classe Planta tem a responsabilidade de representar uma planta e suas operações básicas.
// Ela não deve ser responsável por mais do que isso. Operações relacionadas a outras funcionalidades (como armazenamento de dados) deveriam estar em outras classes.

class Planta {
    String nome;
    int quantidade;
    double preco;

    // Princípio da Responsabilidade Única (SRP): O construtor da classe é responsável apenas por inicializar o estado da planta.
    public Planta(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    // Princípio da Abstração: Este método fornece uma interface para a ação de regar a planta. O detalhe de como a planta é regada não é relevante para o consumidor do método.
    void regar() {
        System.out.println(nome + " foi regada.");
    }

    // Princípio da Abstração: Este método fornece uma interface para a ação de podar a planta. O detalhe de como a planta é podada não é relevante para o consumidor do método.
    void podar() {
        System.out.println(nome + " foi podada.");
    }
}
