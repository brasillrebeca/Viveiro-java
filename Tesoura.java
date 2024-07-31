class Tesoura extends Ferramenta {
    public Tesoura(String nome, int quantidadeEmEstoque, double preco) {
        super(nome, quantidadeEmEstoque, preco);
    }

    void cortar() {
        System.out.println(nome + " está cortando.");
    }

    void afiar() {
        System.out.println(nome + " foi afiada.");
    }
}
