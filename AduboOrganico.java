class AduboOrganico extends Adubo {
    public AduboOrganico(String tipo, int quantidadeKg, double preco) {
        super(tipo, quantidadeKg, preco);
    }

    void compostar() {
        System.out.println(tipo + " está sendo compostado.");
    }

    void reciclar() {
        System.out.println(tipo + " está sendo reciclado.");
    }
}

