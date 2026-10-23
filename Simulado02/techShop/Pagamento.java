package techShop;

// Contrato padrão para meios de pagamento com comprovante
public interface Pagamento {
    double calcularValorFinal(double valor);
    String getDescricao();

    // Emite a mensagem de confirmação de pagamento
    default void exibirComprovante(double valor) {
        System.out.println("Pago via " + getDescricao() + ": R$ " + calcularValorFinal(valor));
    }
}