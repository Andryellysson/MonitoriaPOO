package techShop;

// Pagamento por cartão com taxa de parcelamento e limite
public class PagamentoCartao implements Pagamento {
    private int parcelas;
    private double limite;

    public PagamentoCartao(int parcelas, double limite) {
        this.parcelas = parcelas;
        this.limite = limite;
    }

    // Cobra 8% acima de 3 parcelas e lança exceção se o valor exceder o limite
    @Override
    public double calcularValorFinal(double valor) {
        double valorFinal = (parcelas > 3) ? valor * 1.08 : valor;
        if (valorFinal > limite) {
            throw new PagamentoRecusadoException("Valor excede o limite do cartão.");
        }
        return valorFinal;
    }

    @Override
    public String getDescricao() {
        return "Cartão em " + parcelas + "x";
    }
}
