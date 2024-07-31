class VasoDeCeramica extends Vaso {
    public VasoDeCeramica(String material, int quantidade, double preco) {
        super(material, quantidade, preco);
    }

    void pintar() {
        System.out.println("O vaso de " + material + " está sendo pintado.");
    }

    void quebrar() {
        System.out.println("O vaso de " + material + " foi quebrado.");
    }
}
