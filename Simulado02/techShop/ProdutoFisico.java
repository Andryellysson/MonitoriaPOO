package techShop;

public class ProdutoFisico extends Produto implements Entregavel {
    private double pesoKg;

    public ProdutoFisico(String codigo, String nome, double precoBase, int estoque, double pesoKg) {
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.10;
    }

    @Override
    public double calcularFrete(String cep) {
        return 15.00 + (2.00 * pesoKg);
    }

    @Override
    public int prazoEntregaDias() {
        return 7;
    }

    public double getPesoKg() { return pesoKg; }
}