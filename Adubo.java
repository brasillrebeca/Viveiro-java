class Adubo {
    String tipo;
    int quantidadeKg;
    double preco;

    public Adubo(String tipo, int quantidadeKg, double preco) {
        this.tipo = tipo;
        this.quantidadeKg = quantidadeKg;
        this.preco = preco;
    }

    void aplicar() {
        System.out.println(tipo + " foi aplicado.");
    }

    void armazenar() {
        System.out.println(tipo + " foi armazenado.");
    }
}

