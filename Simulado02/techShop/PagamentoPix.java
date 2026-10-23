package techShop;

// Pagamento instantâneo
public class PagamentoPix implements Pagamento {

    // Aplica 5% de desconto
    @Override
    public double calcularValorFinal(double valor) {
        return valor * 0.95;
    }

    @Override
    public String getDescricao() {
        return "Pix";
    }
}