class Ferramenta {
    String nome;
    int quantidadeEmEstoque;
    double preco;

    public Ferramenta(String nome, int quantidadeEmEstoque, double preco) {
        this.nome = nome;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.preco = preco;
    }

    void usar() {
        System.out.println(nome + " foi usada.");
    }

    void reparar() {
        System.out.println(nome + " foi reparada.");
    }
}

