class Servico {
    String descricao;
    double preco;
    int quantidade;

    public Servico(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    void executar() {
        System.out.println(descricao + " está sendo executado.");
    }

    void cancelar() {
        System.out.println(descricao + " foi cancelado.");
    }
}
