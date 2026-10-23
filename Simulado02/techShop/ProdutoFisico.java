package techShop;

// Item material com aplicação de imposto e regras de entrega
public class ProdutoFisico extends Produto implements Entregavel {
    private double pesoKg;

    public ProdutoFisico(String codigo, String nome, double precoBase, int estoque, double pesoKg) {
        super(codigo, nome, precoBase, estoque);
        this.pesoKg = pesoKg;
    }

    // Aplica 10% de imposto sobre o preço base
    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.10;
    }

    // Frete baseado na taxa fixa + peso do produto
    @Override
    public double calcularFrete(String cep) {
        return 15.00 + (2.00 * pesoKg);
    }

    // Define o prazo de entrega com base no prefixo do CEP
    @Override
    public int prazoEntregaDias() {
        return 7;
    }

    public double getPesoKg(){
        return pesoKg;
    }
}