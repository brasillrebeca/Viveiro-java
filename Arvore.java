/*class Arvore extends Planta {
    public Arvore(String nome, int quantidade) {
        super(nome, quantidade);
    }

    void fertilizar() {
        System.out.println(nome + " foi fertilizada.");
    }

    void transplantar() {
        System.out.println(nome + " foi transplantada.");
    }
}*/

class Arvore extends Planta {
    public Arvore(String nome, int quantidade, double preco) {
        super(nome, quantidade, preco);
    }

    void fertilizar() {
        System.out.println(nome + " foi fertilizada.");
    }

    void transplantar() {
        System.out.println(nome + " foi transplantada.");
    }
}
