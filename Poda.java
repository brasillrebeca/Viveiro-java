class Poda extends Servico {
    public Poda(String descricao, double preco, int quantidade) {
        super(descricao, preco, quantidade);
    }

    void iniciar() {
        System.out.println(descricao + " foi iniciado.");
    }

    void finalizar() {
        System.out.println(descricao + " foi finalizado.");
    }
}
