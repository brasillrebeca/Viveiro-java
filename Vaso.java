class Vaso {
    String material;
    int quantidade;
    double preco;

    public Vaso(String material, int quantidade, double preco) {
        this.material = material;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    void encher() {
        System.out.println("O vaso de " + material + " foi preenchido.");
    }

    void limpar() {
        System.out.println("O vaso de " + material + " foi limpo.");
    }
}


