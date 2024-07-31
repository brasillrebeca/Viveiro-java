
class Planta {
    String nome;
    int quantidade;
    double preco;

    public Planta(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    void regar() {
        System.out.println(nome + " foi regada.");
    }

    void podar() {
        System.out.println(nome + " foi podada.");
    }
}
