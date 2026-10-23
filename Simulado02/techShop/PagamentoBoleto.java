package techShop;

// Pagamento via boleto bancário
public class PagamentoBoleto implements Pagamento {

    // Mantém o valor sem alterações
    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }

    @Override
    public String getDescricao() {
        return "Boleto";
    }
}
